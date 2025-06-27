package chapter05;

import java.util.Scanner;

/*
 * === 메뉴판 ===

☕ 아메리카노 - 2,800원
🍵 바닐라 라떼 - 3,500원
🥤 딸기 쉐이크 - 4,000원

 */
public class DrinkOrderTestVer1 {

	public static void main(String[] args) {
		//지역 변수 선언
		Scanner scan = new Scanner(System.in);
		
		//step1: 메뉴판 출력
		System.out.println("**************************************************");
		System.out.println("\t--☕🍵🥤 음료 주문 프로그램--");
		System.out.println("**************************************************");
		System.out.println("\t1. ☕ 아메리카노 - 2,800");
		System.out.println("\t2. 🍵 바닐라 라떼 - 3,500");
		System.out.println("\t3. 🥤 딸기 쉐이크 - 4,000");
		System.out.println("\t0. 나가기");
		System.out.println("**************************************************");
		
		//메뉴 번호, 메뉴 이름 ,메뉴 금액, 넣은 금액, 잔돈
		int menuNum = -1;
		String menuName = "";
		int menuPrice = 0;
		int money = 0;
		int change = 0;		
		boolean menuFlag = true;
		boolean menuNumFlag = true;
		boolean payFlag = true;
		String menuPriceOutPut = "";
		
		//1. 메뉴 선택
		while(menuFlag) {
			System.out.print("메뉴 번호를 선택해 주세요 > ");
			if(scan.hasNextInt()) {//정상적인 입력
				menuNum = scan.nextInt();
				switch (menuNum) {
					case 1:
						menuName = "☕ 아메리카노";
						menuPrice = 2800;
						menuFlag = false;// 올바른 입력이므로 반복 종료
						break;
					case 2:
						menuName = "🍵 바닐라 라떼";
						menuPrice =3500;
						menuFlag = false;
						break;
					case 3:
						menuName = "🥤 딸기 쉐이크";
						menuPrice =4000;
						menuFlag = false;
						break;	
					default :
						System.out.println("메뉴 준비중 입니다.다시 입력해주세요");
				}//switch
				//출력용 메뉴가격 저장
				if (!menuFlag) {
                    menuPriceOutPut = String.format("%,d", menuPrice);
//                    System.out.printf("주문 메뉴 : %s, 결제 예정 금액 : %s원%n", menuName, menuPriceOutPut);
                }
			}
			else {//비정상적인 입력
				System.out.println("올바르지 않은 입력값입니다. 다시 입력해주세요.");
				scan.next();
			}
		}//while-정수외의 만자를 받았을 때
		System.out.printf("=> 주문 메뉴 : %s, 결제 예정 금액 : %s원%n", menuName, menuPriceOutPut);
		System.out.println("--step1 종료--");
		
		//2. 주문 결제
				while(payFlag) {
					System.out.print("결제할 요금 입력(숫자) > ");
					if(scan.hasNextInt()) {
						//자판기
						money += scan.nextInt();
						System.out.println("총 입력 금액 : "+money);
						
						if(money >= menuPrice) {
							 change = money - menuPrice;
							 payFlag = false;
						}
						else {
							System.out.println("=> 금액이 부족합니다. 다시 입력해주세요. ");
						}
					}
					else {
						System.out.println("올바르지 않은 입력값입니다. 다시 입력해주세요.");
						scan.next();
					}
				}//while-금액 오류
				
				System.out.printf("=> 결제 완료!\n잔돈: %s", change);
				System.out.println("\n\n[종료]");
				System.out.println("이용해주셔서 감사합니다.");
				
	}

}
