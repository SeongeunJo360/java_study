package chapter03;

//import java.lang.String;

public class Variable {
	public static void main(String[] args) {
		//기본자료형 변수 정의
		int age = 10;
		double height = 137.2;
		boolean flag = true; //true(1), false(0)
		char name = '홍';
		char name2 = '길';
		char name3 = '동';
		
		//참조 자료형 변수 정의
		String sname2 = new String("홍길동");
		
		// ** String 클래스는 기본형과 참조형으호 모두 사용 가능!!
		String sname = "홍길동";
		
		
		
		//출력
		System.out.println(age);
		System.out.println(height);
		System.out.println(flag);
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(sname);
		System.out.println(sname2);
	}
}
