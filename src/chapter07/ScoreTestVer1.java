package chapter07;

import java.util.Scanner;

public class ScoreTestVer1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Score student = new Score();
		
		
		
		
		System.out.print("학생명> ");
		student.name = scan.next();
		System.out.println("점수를 입력하시오.");
		System.out.print("국어> ");
		student.kor = scan.nextInt();
		System.out.print("영어> ");
		student.eng = scan.nextInt();
		System.out.print("수학> ");
		student.math = scan.nextInt();
		
		System.out.println("**************************************");
		System.out.println("\tScore Information");
		System.out.println("**************************************");
		student.showInfo();
		System.out.println("---main 메소드 종료 ---");

	}

}
