package chapter07;

public class Animal2 {
	//Field: 전역 변수
	String name;
	int age;
	
	//Constructor: 생산자는 오버로딩이 가능합!!
	public Animal2() {//기본 생성자
		//생성자 호출시 실행되는 내용 => new Animal() 코드 실행 시 실행됨!!
		System.out.println(name+" -> 객체를 생성한다.");
	}
	public Animal2(String name) {//field의 name만 초기화
		this.name=name; //heap에 생성된 나의 전역변수를 의미(자기 자신을 가르키는 재귀변수)
		//전역변수=name;
		System.out.println(name+" -> 객체를 생성한다.");
	}
	public Animal2(String name, int age) {//field의 name,age 초기화
		this.name=name; //heap에 생성된 나의 전역변수를 의미(자기 자신을 가르키는 재귀변수)
		//전역변수=name;
		this.age=age;
		System.out.println(name+" -> 객체를 생성한다.");
	}
	
	//Method
	public void sleep(){
		String data = "26-07-03";
		System.out.println(name+"->\t"+data+" 잠을 잔다.");				
	}
	
}
