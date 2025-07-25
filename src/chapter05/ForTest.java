package chapter05;

import java.util.Scanner;

/*
 * 반복문 : for (초기값 성언; 조건식; 증감연산식) {실햄문 (조선식이 true인 경우 실행);}
 *			조건식이 false가 되면 for 블록 종료
 *			초기값으로 선언된 변수는 for 블록 안에서만 사용
 */
public class ForTest {

	public static void main(String[] args) {
		// 1~5까지 정수를 출력
		// 시작과 종료값은 실행시 외부에서 입력을 통해 진행함
		Scanner scan = new Scanner(System.in);
		int start = 0, end = 0;
		int sum = 0;
		
		System.out.print("시작값 > ");
		start = scan.nextInt();
		
		System.out.print("종료값 > ");
		end = scan.nextInt();
		
		for(int i=start; i<=end; i++) { //1이상의 값을 누적합으로 대입 -> i += 값
			
			sum += i;
			System.out.println("sum =  " +sum);
		}
//		System.out.println(i); //에러 : i의 블록 범위는 for 블록
		System.out.println("--for문 종료--");
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
		

	}

}
