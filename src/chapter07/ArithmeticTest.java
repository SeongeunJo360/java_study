package chapter07;

public class ArithmeticTest {

	public static void main(String[] args) {
		Arithmetic arithmetic = new Arithmetic();
		ArithmeticOverloading arithmetic_01 = new ArithmeticOverloading();
		
		System.out.println("arithmetic_01.add = "+arithmetic_01.add(10,20));
		System.out.println("arithmetic_01.add = "+arithmetic_01.add(3.14,1.5));
		System.out.println("arithmetic_01.add = "+arithmetic_01.add("100","200"));
		System.out.println("arithmetic_01.add = "+arithmetic_01.add(1,2,5,76,8,5,9));
		System.out.println("arithmetic_01.add = "+arithmetic_01.add("1","2","3"));
		
		System.out.println("------------------------");
		int add = arithmetic.add(10.7,20.8);
		int sub = arithmetic.sub(100,20);
		double mul = arithmetic.mul(3.14,10);
		int div = arithmetic.div(10,20);
		int mod = arithmetic.mod(10,20);
		
		System.out.println("add = " +add);
		System.out.println("sub = " +sub);
		System.out.println("mul = " +mul);
		System.out.println("div = " +div);
		System.out.println("mod = " +mod);
		

	}

}
