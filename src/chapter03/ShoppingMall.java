package chapter03;

import java.util.Scanner;

public class ShoppingMall {

	public static void main(String[] args) {
		
		System.out.println("****************************************");
		System.out.println("\tWelcome to Shopping Mall");
		System.out.println("\tWelcome to Food Market");
		System.out.println("****************************************");
		System.out.println("\t1. 상품보기 \t2. 상품구입 \n\t3.영수증보기 \t4.종료");
		System.out.println("****************************************");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("메뉴를 선택해주세요(숫자) > ");
		int manuNumber = scan.nextInt();
		
		//선책 메뉴 체크 확인 (다른 수를 입력 받을때 처음을 돌아가거나 에러 띄우기 등)
		
		System.out.println("선택한 메뮤 : " +manuNumber);

		//
	}

}
