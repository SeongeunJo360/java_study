package chapter08;

public class Rectangle extends Shape implements ShapeInterface{
//	String color;
	int height;
	int wigth;
	public Rectangle(String color,int height,int wigth) {
		this.color = color;
		this.height = height;
		this.wigth = wigth;
	}
	
	@Override
	public void draw() {
		System.out.println(color+" 사각형을 그린다.");
	}


}
