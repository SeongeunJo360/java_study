package chapter05;

import java.util.Scanner;

public class GugudanVer2 {

	public static void main(String[] args) {
		//구구단 
		//각 단을 하나씩 출력
		// dan입력받고 i++ <=9
		Scanner scan = new Scanner(System.in);
		int dan = 0;
//		System.out.print("보고 싶은 구구단을 입력하세요(_단) > ");
		int start = 0, end = 0;
		System.out.println("--------------------------------");
		System.out.print("시작 단>");
		start = scan.nextInt();
		System.out.print("끝 단>");
		end = scan.nextInt();
		for(dan=start; dan<=end; dan++) {
			System.out.println("--------------------------------");
			System.out.println("\t["+dan+"단]");
			System.out.println("--------------------------------");
			for(int i=1; i<10; i++) {
				System.out.println("\t"+dan+" X " +i+" = " + (dan*i));
			}
		}
		

	}

}
