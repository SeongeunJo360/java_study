package chapter04;

/*
 * 대입연산자 : =, +=, -=< *=, /*
 */
public class OpAssignmentTest {

	public static void main(String[] args) {
		//정수형 number 변수에 100 대입
		int number = 100;
		System.out.println(number);
		//number라는 변수에 10값을 중첩하여 대입
		number += 10; //number = number + 10;
		System.out.println(number);
		number += 10; //number = number + 10;
		System.out.println(number);
		
		number -= 10; //number = number - 10;
		System.out.println(number);
		
		number *= 10; //number = number * 10;
		System.out.println(number);
		
		number /= 10; //number = number / 10;
		System.out.println(number);
		
		number %= 3; //number 변수에 10을 중펍으로 모듈러연산하여 대입
		System.out.println(number);
		
	}

}
