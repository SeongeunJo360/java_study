package chapter05;

import java.util.Scanner;

/*
 * 단일 If문 : 조건의 결과가 true인 경우에만 실행
 * If ~ else : 조건의 결과가 true/false 경우에 각각 실행
 * 형식) if(조선식) { 실행문;} else { 실행문;}
 * if~else if ~... else : 여러개의 조건을 체크하여 실행, 
 * 모든 조건에 만족하지 않는 경우 else가 실행
 * 형식) if (조건식1) {
 * 			조건식1이 true인 경우 실행문;
 * 		}
 * 		else if(조건식2) {
 * 			조건식2이 true인 경우 실행문;
 * 		}...
 *		else{
 *			위의 모든 조건이 false인 경우 생행문;
 *		}
 *
 * ✔각 if문의 실행문이 한줄인 경우에는 {}(블록)을 생략할 수 있음✔
 */
public class IfTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 > ");
		int score = scan.nextInt();
		String grade = "";
		
		System.out.println("--시작--");
		
		//합격 출력 : 95점 이상(A+), 90점 이상(A), 85점 이상(B+), 80점 이상(B), ... 60점 이하(F)
//		if(score >= 95) {
//			System.out.println("학점 : A+");
//		}
//		else if(score >= 90) {
//			System.out.println("학점 : A");
//		}
//		else if(score >= 85) {
//			System.out.println("학점 : B+");
//		}
//		else if(score >= 80) {
//			System.out.println("학점 : B");
//		}
//		else if(score >= 75) {
//			System.out.println("학점 : C+");
//		}
//		else if(score >= 70) {
//			System.out.println("학점 : C");
//		}
//		else if(score >= 65) {
//			System.out.println("학점 : D+");
//		}
//		else if(score >= 60) {
//			System.out.println("학점 : D");
//		}
//		else {
//			System.out.println("학점 : F");
//		}
//		
//		System.out.println("--종료--");
//
//	}
		
		if(score >= 95) {
			grade = "A+";
		}
		else if(score >= 90) {
			grade = "A";
		}
		else if(score >= 85) {
			grade = "B+";
		}
		else if(score >= 80) {
			grade = "B";
		}
		else if(score >= 75) {
			grade = "C+";
		}
		else if(score >= 70) {
			grade = "C";
		}
		else if(score >= 65) {
			grade = "D+";
		}
		else if(score >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		System.out.println("당신의 학점은 \"" +grade+"\" 입니다");
		System.out.println("--종료--");

	}

}
