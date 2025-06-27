package chapter05;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menuNum = -1;
		String menuName = "";
		int menuPrice = 0;
		int money = 0;
		int change = 0;		
		boolean menuFlag = true;
		boolean menuNumFlag = true;
		
		System.out.print("메뉴 번호를 선택해 주세요 > ");
		if(scan.hasNextInt()) {//정상적인 입력
			menuNum = scan.nextInt();
			switch (menuNum) {
				case 1:
					menuName = "햄버거(🍔)";
					menuPrice = 100;
					break;
				case 2:
					menuName = "피자(🍕)";
					menuPrice =200;
					break;
				case 3:
					menuName = "라멘(🍜)";
					menuPrice =300;
					break;
				case 4:
					menuName = "샐러드(🥗)";
					menuPrice =400;
					break;
				case 0:
					System.out.println("--프로그램을 종료합니다.--");
					System.out.println("안녕히가세요");
					System.exit(0);
					break;		
				default :
					System.out.println("메뉴 준비중 입니다.");
			}
		}
		else {//비정상적인 입력
			System.out.println("올바르지 않은 입력값입니다. 다시 입력해주세요. ");
			scan.next();
		}
	}
}
