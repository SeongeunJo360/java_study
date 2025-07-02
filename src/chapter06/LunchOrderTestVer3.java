package chapter06;

import java.util.Scanner;
//점심 주문
/*
 * 음식 주문/결제 프로그램(콘솔)
 * -음식을 주문(1), 결제(2), 프로그램 종료(9)하는 메뉴로 구성된다.
 * -프로그램 종료를 제외하고 나머지 메뉴는 반복 선택 가능하다.
 * -메뉴 선택 시 체크하는 기능은 switch~case를 이용하여 구현한다.
 * 
* << 추가 사항>>
* (1) 예외사항 처리
* 		: 메뉴 선택, 결제 금액 입력 시 정수형 타입이 아닌 경우 메시지 출력 후 재입력을 유도함
* (2) 입력값이 정확할 때까지 재입력을 유도하여 진행, flag 변수를 이용하여 반복
* (3) 결제 금액이 부족한 경우 재입력을 통해 금액 누적(자판기)으로 계산아혀 저장 후 결제
*/
public class LunchOrderTestVer3 {

	public static void main(String[] args) {
		//메뉴판
		Scanner scan = new Scanner(System.in);
		boolean menuFlag = true;
		//주문 음식 리스트
		String[] menuList = {"햄버거(🍔)","피자(🍕)","라멘(🍜)","샐러드(🥗)"};
		int[] priceList = {100,200,300,400};
		
		//주문 리스트 선언 및 생성
		System.out.print("주문리스트 크기> ");
		final int MAX_SIZE = scan.nextInt();
		String[] orderMenuList = new String[MAX_SIZE];
		int[] orderPriceList = new int[MAX_SIZE];
		int count=0;
		
		//결제 리스트 선언 및 생성
		//메뉴명, 결제 금액, 입금액, 잔돈
		String[] paymentMenuList = new String[MAX_SIZE];
		int[] totalAmountList = new int [MAX_SIZE];
		int paidAmountList[]=new int[MAX_SIZE];
		int changeList[]=new int[MAX_SIZE];
		int paymentCount = 0;
		
		
		while(menuFlag) {
			System.out.println("**************************************************");
			System.out.println("\t--Food Mart에 오신 것을 환영합니다--");
			System.out.println("**************************************************");
			System.out.println("\t1.음식 주문");
			System.out.println("\t2.주문 내역");
			System.out.println("\t3.음식 결제");
			System.out.println("\t4.결제 내역");
			System.out.println("\t9. 프로그램 종료");
			System.out.println("**************************************************");
			System.out.print("메뉴> ");
			int menu = scan.nextInt();
			switch(menu) {
			case 1:
				//1.메뉴 주문
				boolean orderFlag = true;
				while(orderFlag) {
					System.out.println("**************************************************");
					System.out.println("\t--Food Mart에 오신 것을 환영합니다--");
					System.out.println("**************************************************");
					System.out.println("\n\t1. 햄버거(🍔):100\t2. 피자(🍕):200");
					System.out.println("\t3. 라멘(🍜):300\t4. 샐러드(🥗):400");
					System.out.println("**************************************************");
					System.out.print("주문 메뉴(숫자로)> ");
					if(scan.hasNextInt()) {
						int menuNum = scan.nextInt();
						if(menuNum>=1 && menuNum<=4) {
							orderMenuList[count]=menuList[menuNum-1];
							orderPriceList[count]=priceList[menuNum-1];
							
							count++;
						System.out.println("=>"+menuList[menuNum-1]+"주문 완료!!");
						}
						else {
							System.out.println("=> 메뉴 준비중 입니다.");
						}				
				
						//주문 리스트 저장 공간 O count:3, orderMenuList.length:3
						if(count==MAX_SIZE) {
							System.out.print("=> 주문은 최대 "+MAX_SIZE+"개까지 가능!!\n");
							orderFlag = false;
						}
						else {
							System.out.print("계속 주문?(계속: 아무거나, 종료:n)");
							if(scan.next().equals("n")) {
								orderFlag = false;
							}
						}
					}
					else {
						System.out.println("올바르지 않은 입력값입니다. 다시 입력해주세요 > ");
						scan.next();
					}
				}//while-MenuNum
				break;
			case 2:
				if(count != 0) {
					System.out.println("**************************************************");
					System.out.println("번호\t메뉴명\t가격");
					System.out.println("**************************************************");
					for(int i=0;i<count;i++) {
						System.out.print((i+1)+"\t");
						System.out.print(orderMenuList[i]+"\t");
						System.out.println(orderPriceList[i]+"\t");
					}
					System.out.println("**************************************************");
				}
				else {
					System.out.println("=> 주문 내역 엾음!!");
				}
				break;
			case 3://음식 결제
				boolean paymentFlag = true;
				int totalPayment = 0;
				int charge=0;
				int change=0;
				while(paymentFlag) {//결제 요금 부족시 반복 실행
					//결제 에정 금액 출력: orferPriceList
					
					for(int i=0;i<count;i++) {
						totalPayment += orderPriceList[i];
					}
					System.out.println("=> 결제 예정 금액: "+totalPayment);
					System.out.print("결제할 요금 입력(숫자)> ");
					if(scan.hasNextInt()) {
						charge += scan.nextInt();
						System.out.println("=> 총 입력 금액 :" +charge);
						if(charge >= totalPayment) {
							change = charge - totalPayment;
							paymentFlag = false;
						}
						else {
							System.out.println("=> 요글이 부족합니다. 다시 입력해 주세요.");
						}
					}
					else {
						System.out.println("=> 올바르지 않은 입력값입니다. 다시 입력해주세요.");
						scan.next();
					}
				}
				
				paymentMenuList[paymentCount]=orderMenuList[0] + "등..";
				totalAmountList[paymentCount]=totalPayment;
				paidAmountList[paymentCount]=charge;
				changeList[paymentCount]=change;
				
				
				
				System.out.println("=> 결제 완료");
				System.out.println("**************************************************");
				System.out.println("\t음식 결제 내역");
				System.out.println("**************************************************");
				System.out.println("메뉴명\t결제 금액");
				System.out.println("**************************************************");
				System.out.print(paymentMenuList[paymentCount]+"\t");
				System.out.print(totalAmountList[paymentCount]+"\t");
				System.out.print(paidAmountList[paymentCount]+"\t");
				System.out.println(changeList[paymentCount]);
				System.out.println("**************************************************");
				
				//orderMenuList, orderPriceList 초기화
//				for (int i=0; i<count; i++) {
//					orderMenuList[i] = null;
//					orderPriceList[i]=0;
//				}
//				orderMenuList = new String[MAX_SIZE];
//				orderPriceList=new int[MAX_SIZE];
				
				count=0;			//order
				paymentCount++;		//payment
				break;
			case 4://결제 내역
				System.out.println("**************************************************");
				System.out.println("\t음식 결제 내역");
				System.out.println("**************************************************");
				System.out.println("번호\t주문메뉴\t결제금액\t입금액\t잔돈");
				System.out.println("**************************************************");
				for(int i=0;i<paymentCount;i++) {
					System.out.print((i+1)+"");
				System.out.print(paymentMenuList[i]+"\t");
				System.out.print(totalAmountList[i]+"\t");
				System.out.print(paidAmountList[i]+"\t");
				System.out.println(changeList[i]);
				}
				System.out.println("**************************************************");
				
				break;
			case 9:
				System.out.println("--프로그램 종료--");
				System.exit(0);
				break;
			default:
				System.out.println("=> 메뉴 준비중!!");
			}
		}//while-menuFlag
		
		
		
	}

}
