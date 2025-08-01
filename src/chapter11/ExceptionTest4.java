package chapter11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Exception 객체 생성 > 다른 메소드에게 예외처리를 넘김
 */
public class ExceptionTest4 {

	//checkAge 메소드
	public static void checkAge(int age) throws Exception{
		if(age < 0) {
			throw new Exception("나이는 0보다 커야 합니다.");
		} else {
			System.out.println("age : " + age);
		}		
	}
	
	public static void main(String[] args) {
		//키보드를 통해 나이를 입력받아 체크함
		Scanner scan = new Scanner(System.in);
		System.out.print("나이>");
		int age = scan.nextInt();
		
		try {
			checkAge(age);			
		} catch (Exception e) {
			System.out.println("Exception : age는 0보다 커야 함!!");
		} finally {
			scan.close();
			System.out.println("-- 프로그램 종료 --");
		}
	}//main

}//class









