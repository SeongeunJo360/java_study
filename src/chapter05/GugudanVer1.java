package chapter05;

import java.util.Scanner;

public class GugudanVer1 {

	public static void main(String[] args) {
		//구구단 
		//각 단을 하나씩 출력
		// d입력받고 i++ <=9
		Scanner scan = new Scanner(System.in);
		int dan = 0;
		System.out.print("보고 싶은 구구단을 입력하세요. ");
		
		while(true) {
			System.out.print("(종료:0)>");
			dan = scan.nextInt();
			
			if (dan != 0) {
				// dan 변수값이 0이 아닌 경우 : 구구단 출력
				System.out.println("\n--------------------------------");
				System.out.println("\t["+dan+"단]");
				System.out.println("--------------------------------");
				for(int i=1; i<10; i++) {
					System.out.println("\t"+dan+" X " +i+" = " + (dan*i));
				}
			}
			else {
				// dan 변수값이 0인 경우 : 프로그램 종료
				System.out.println("------------프로그램 종료------------");
				System.exit(0);
			}
			
		}
	}

}
