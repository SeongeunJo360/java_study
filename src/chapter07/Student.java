package chapter07;

public class Student {
	//Field = 필드변수, 멤버변수, 전역변수
	String name;	
	int kor;
	int eng;
	int math;
	int tot;
	int avg;
	
	//Constructor
	public Student() {
		
	}

	//Method	
	public int getTot() {
		return kor+eng+math;
	}
	public int getAvg() {
		return avg = getTot()/3;
	}
	
}
