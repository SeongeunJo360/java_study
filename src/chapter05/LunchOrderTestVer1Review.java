package chapter05;

import java.util.Scanner;

public class LunchOrderTestVer1Review {

	public static void main(String[] args) {
		System.out.println("**************************************************");
		System.out.println("\t--Jo's Cafe에 오신 것을 환영합니다--");
		System.out.println("**************************************************");
		System.out.println("\t1. 아이스 아메리카노\t 1500");
		System.out.println("\t2. 초코라떼 \t 4500");
		System.out.println("\t3. 말차라떼 \t 4800");
		System.out.println("\t4. 밀크티 \t 6000");
		System.out.println("\t0. 나가기");
		System.out.println("**************************************************");
		
		Scanner scan = new Scanner(System.in);
		//메뉴 번호, 메뉴 이름 ,메뉴 금액, 넣은 금액, 잔돈
		int menuNum = -1;
		String menuName = "";
		int menuP = 0;
		int money = 0;
		int change = 0;		
		
		//1. 메뉴 선택
		System.out.print("메뉴 번호를 입력하세요> ");
		
		if(scan.hasNextInt()) {
			menuNum = scan.nextInt();
			switch(menuNum) {
			case 1:
				menuName = "아이스 아메리카노";
				menuP =1500;
				break;
			case 2:
				menuName = "초코라떼";
				menuP = 4500;
				break;
			case 3:
				menuName = "말차라떼";
				menuP = 4800;
				break;
			case 4:
				menuName = "밀크티";
				menuP = 6000;
				break;
			case 0:
				System.out.println("--프로그램을 종료합니다.--");
				System.out.println("안녕히가세요");
				System.exit(0);
				break;
			default :
				System.out.println("메뉴 준비중입니다.");
			}
		}
		else {
			System.out.println("잘못된 번호입니다.");
		}
		System.out.println("\t메뉴: " +menuName);
		System.out.println("\t가격: " +menuP);
		
		//2. 주문한 메뉴 결제
		System.out.print("결제할 금액을 입력하세요> ");
		if(scan.hasNextInt()) {
			money = scan.nextInt();
			if(money >= menuP) {
				change = money - menuP;
			}
			else {
				System.out.print("요금이 부족합니다. 다시 입력하세요. > ");
				if(scan.hasNextInt()) {
					money = scan.nextInt();
					if(money >= menuP) {
						change = money - menuP;
					}
				}
				else {
					System.out.println("요금이 부족합니다. 프로그램을 종료합니다.");
					System.out.println("안녕히가세요");
					System.exit(0);
				}
			}
		}
		else {
			System.out.println("올바르지 않은 입력값입니다.");
		}
		
		//3. 주문 내역 출력
		System.out.println("**************************************************");
		System.out.println("\tJo's Cafe");
		System.out.println("**************************************************");
		System.out.println("\t--영수증--");
		System.out.println("\t메뉴: " +menuName);
		System.out.println("\t가격: " +menuP);
		System.out.println("\t결제 금액: "+money);
		System.out.println("\t잔돈: "+change);
		System.out.println("\t좋은 하루되세요");
		System.out.println("**************************************************");
	}

}
