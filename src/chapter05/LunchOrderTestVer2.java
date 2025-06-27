package chapter05;

import java.util.Scanner;

//점심 주문
/*
 * << 추가 사항>>
 * (1) 예외사항 처리
 * 		: 메뉴 선택, 결제 금액 입력 시 정수형 타입이 아닌 경우 메시지 출력 후 재입력을 유도함
 * (2) 입력값이 정확할 때까지 재입력을 유도하여 진행, flag 변수를 이용하여 반복
 * (3) 결제 금액이 부족한 경우 재입력을 통해 금액 누적(자판기)으로 계산아혀 저장 후 결제
 */
public class LunchOrderTestVer2 {

	public static void main(String[] args) {
		//메뉴판
		System.out.println("**************************************************");
		System.out.println("\t--Food Mart에 오신 것을 환영합니다--");
		System.out.println("**************************************************");
		System.out.println("\n\t1. 햄버거(🍔):100\t2. 피자(🍕):200");
		System.out.println("\t3. 라멘(🍜):300\t4. 샐러드(🥗):400");
		System.out.println("\t0. 나가기");
		System.out.println("**************************************************");
		
		Scanner scan = new Scanner(System.in);
		int menuNum = -1;
		String menuName = "";
		int menuPrice = 0;
		int charge = 0;
		int change = 0;
		boolean menuFlag = true;
		boolean payFlag = true;
		
		//1. 메뉴 선택
		while(menuFlag) {
			System.out.print("메뉴 번호를 선택해 주세요 > ");
			if(scan.hasNextInt()) {
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
				}//switch
				menuFlag = false;
			}
			else {
				System.out.println("올바르지 않은 입력값입니다. 다시 입력해주세요 > ");
				scan.next();
			}
		}//while-정수외의 만자를 받았을 때
		System.out.println("주문하신 메뉴는 " +menuName+ " 가격은 " +menuPrice+"원 입니다.");
		
		
		//2. 주문 결제
		while(payFlag) {
			System.out.print("결제할 요금 입력(숫자) > ");
			if(scan.hasNextInt()) {
				//자판기
				charge += scan.nextInt();
				System.out.println("총 입력 금액 : "+charge);
				
				if(charge >= menuPrice) {
					 change = charge - menuPrice;
					 payFlag = false;
				}
				else {
					System.out.println("요금이 부족합니다. 다시 입력해 주세요. ");
				}
			}
			else {
				System.out.println("올바르지 않은 입력값입니다. 다시 입력해 주세요.");
				scan.next();
			}
		}//while-금액 오류
		
		//3. 주문 내역 출력 : 주문 메뉴는 (), 결제 금액(), 잔동()입니다.(다시 입력하세요.에서 반복해서 적은 금액에서 주문 내역 출력하는 오류를 잡을 수 있음)
		System.out.println("주문하신 메뉴는 " +menuName+ " "
				+ "결제금액("+menuPrice+"원), 잔돈(" +change+"원) 입니다.");
		
	}

}
