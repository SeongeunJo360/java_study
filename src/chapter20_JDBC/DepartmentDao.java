package chapter20_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDao {
		//Field
		private String url = "jdbc:mysql://127.0.0.1:3306/hrdb2019";
		private String user = "root";
		private String password = "mysql1234";
		
		Connection connection;
		Statement stmt;
		ResultSet rs;
			
		//Constructor
		public DepartmentDao() {
			try { 
				//1 단계			
				connection = DriverManager.getConnection(url, user, password);
				System.out.println("---->> 1단계 성공!!");			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//2단계: Statement
		public void getStatement() {
			try {
				//2단계 : Statement 객체 생성
				stmt = connection.createStatement();
				System.out.println("---->> 2단계 성공!!");			
			} catch (Exception e) {	e.printStackTrace(); }
		}
		
		//3단계: CRUD 기능에 따라 메소드 생성
		public List<DepartmentVo> getList() {
			List<DepartmentVo> list = new ArrayList<DepartmentVo>();
			String sql = """
						select  dept_id,
								dept_name,
								unit_id,
								start_date
						from department
					""";
			try {
				rs = stmt.executeQuery(sql);	
				while(rs.next()) {
					DepartmentVo  department = new DepartmentVo();
					department.setDeptId(rs.getString(1));
					department.setDeptName(rs.getString(2));
					department.setUnitId(rs.getString(3));
					department.setStartDate(rs.getString(4));
					
					list.add(department);
				}
			} catch (Exception e) { e.printStackTrace(); }
			
			return list;
		}
		
		//5단계: close
		public void close() {
			try {
				
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(connection != null) connection.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
}