package chapter05;

import java.util.Scanner;

public class IfOverlabTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int math = 0, eng =0;
		boolean math_pass = false, eng_pass = false;
		
		System.out.print("수학 점수 > ");
		math_pass = (scan.nextInt() >= 60)? true : false;
		System.out.print("영어 점수 > ");
		eng_pass = (scan.nextInt() >= 60)? true : false;
		//및에 사칙연산을 안한다는 조건으로 사용 가능
		
		//1. 중첩 if
		if (math_pass) {
			if (eng_pass) {
				System.out.println("통과");
			}
			else {
				System.out.println("탈락");
			}
		}
		
		//2. 논리연산자 &&을 이용하여 if~else
		if ((math_pass) && (eng_pass)) {
			System.out.println("통과");
		}
		else {
			System.out.println("탈락");
		}

	}

}
