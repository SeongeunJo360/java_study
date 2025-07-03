package chapter07;

public class Animal {
	//Field: 전역 변수
	String name;
	int age;
	
	//Constructor
	public Animal() {//기본 생성자
		//생성자 호출시 실행되는 내용 => new Animal() 코드 실행 시 실행됨!!
		this.name = name;
		System.out.println(name+" -> 객체를 생성한다.");
	}
	
	//Method
	public void sleep(){
		String data = "26-07-03";
		System.out.println(name+"->\t"+data+" 잠을 잔다.");				
	}
	
}
