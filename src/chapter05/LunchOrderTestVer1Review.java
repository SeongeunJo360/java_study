package chapter05;

import java.util.Scanner;

public class LunchOrderTestVer1Review {

	public static void main(String[] args) {
		System.out.println("**************************************************");
		System.out.println("\t--Jo's Cafe에 오신 것을 환영합니다--");
		System.out.println("**************************************************");
		System.out.println("\t1. 아이스 아메리카노\t 1,500");
		System.out.println("\t2. 초코라떼 \t 4,500");
		System.out.println("\t3. 말차라떼 \t 4,800");
		System.out.println("\t4. 밀크티 \t 6,000");
		System.out.println("\t0. 나가기");
		System.out.println("**************************************************");
		
		Scanner scan = new Scanner(System.in);
		//메뉴 번호, 메뉴 이름 ,메뉴 금액, 넣은 금액, 잔돈
		int menuNum = -1;
		String menuName = "";
		int menuP = 0;
		int money = 0;
		int change = 0;		
		boolean menuFlag = true;
		boolean menuNumFlag = true;
		boolean payFlag = true;
		String menuPriceOutPut = "";
		
		//1. 메뉴 선택
		while(menuFlag) {
			System.out.print("메뉴 번호를 입력하세요> ");
			if(scan.hasNextInt()) {
				menuNum = scan.nextInt();
				switch(menuNum) {
					case 1:
						menuName = "아이스 아메리카노";
						menuP =1500;
						menuFlag = false;// 올바른 입력이므로 반복 종료
						break;
					case 2:
						menuName = "초코라떼";
						menuP = 4500;
						menuFlag = false;// 올바른 입력이므로 반복 종료
						break;
					case 3:
						menuName = "말차라떼";
						menuP = 4800;
						menuFlag = false;// 올바른 입력이므로 반복 종료
						break;
					case 4:
						menuName = "밀크티";
						menuP = 6000;
						menuFlag = false;// 올바른 입력이므로 반복 종료
						break;
					case 0:
						System.out.println("--프로그램을 종료합니다.--");
						System.out.println("안녕히가세요");
						System.exit(0);
						break;
					default :
						System.out.println("메뉴 준비중입니다.다시 입력하세요.");
				}//switch
				//출력용 메뉴가격 저장
				if(!menuFlag) {
					menuPriceOutPut = String.format("%d", menuP);
				}
				
			}
			else {
				System.out.println("잘못된 번호입니다.");
				scan.next();
			}
		}
		System.out.printf("\t메뉴: %s", menuName);
		System.out.printf("\n\t가격: %s원", menuP);
		
		//2. 주문한 메뉴 결제	
		while(payFlag) {
			System.out.print("\n결제할 금액을 입력하세요> ");
			if(scan.hasNextInt()) {
				money += scan.nextInt();//자판기처럼 입력한 값을 합함
				System.out.printf("총 입력 금액: %s원", money);
				if(money >= menuP) {
					change = money - menuP;
					payFlag = false;
				}
				else {
					System.out.print("\n요금이 부족합니다.다시 입력하세요. ");
				}
			}
			else {
				System.out.println("올바르지 않은 입력값입니다.다시 입력하세요");
				scan.next();
			}
		}
		
		//3. 주문 내역 출력
		System.out.println("\n**************************************************");
		System.out.println("\tJo's Cafe");
		System.out.println("**************************************************");
		System.out.println("\t--영수증--");
		System.out.println("\t메뉴: " +menuName);
		System.out.printf("\n\t가격: %s원", menuP);
		System.out.printf("\n\t결제 금액: %s원",money);
		System.out.printf("\n\t잔돈: %s원",change);
		System.out.println("\n\t좋은 하루되세요");
		System.out.println("**************************************************");
	}

}
