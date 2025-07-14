package chapter08;

public class Animal extends Client {
	String name;
	int age;
	Person owner;
	
	public Animal() {
		this("예삐",3, null);
	}
	public Animal(String name, int age, Person owner) {
		this.name = name;
		this.age = age;
		this.owner = owner;
	}
	
	//sound()
	public void sound() {
		System.out.println(name+"가 짖는다");
	}
	
	public void animalRegister() {
		System.out.println("접수한다.");
	}
	@Override
	public void register() {}
	@Override
	public void payment() {}	
	//고객 정보 출력시 owner 정보 포함!!
	@Override
	public void printInfo() {	//부모가 가진 메소드를 똑같은 모습으로 가져옴 - 오버라이딩(Overriding)
		System.out.print("고객(Person)정보 --> ");
		System.out.print(name + ",");
		System.out.print(age + ",");
		System.out.print(owner.name + ",");
		System.out.println(owner.age);
	}
}
