package gptdrink;

import java.util.Scanner;

public class OrderSystem {
	static Menu[] menuList = {
	        new Menu("☕ 아메리카노", 2800),
	        new Menu("🍵 바닐라 라떼", 3500),
	        new Menu("🥤 딸기 쉐이크", 4000)
	    };
	    static Order currentOrder = null;

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        boolean isRunning = true;

	        while (isRunning) {
	            // 메뉴 출력
	            System.out.println("=== 메뉴판 ===");
	            for (int i = 0; i < menuList.length; i++) {
	                System.out.println((i + 1) + ". " + menuList[i].name + " - " + menuList[i].price + "원");
	            }

	            // 메뉴 선택
	            System.out.print("\n주문할 메뉴 번호 입력> ");
	            int menuNumber = getValidMenuNumber(scan);

	            // 메뉴에 해당하는 음료 선택
	            Menu selectedMenu = menuList[menuNumber - 1];

	            // 주문 수량 입력
	            System.out.print("주문할 수량 입력> ");
	            int quantity = getValidQuantity(scan);

	            // 주문 생성 및 출력
	            currentOrder = new Order(selectedMenu, quantity);
	            currentOrder.printOrderDetails();

	            // 결제
	            Payment payment = new Payment();
	            payment.processPayment(currentOrder.totalAmount);

	            // 프로그램 종료 여부 확인
	            System.out.println("\n이용해주셔서 감사합니다.");
	            isRunning = false;
	        }
	    }

	    // 유효한 메뉴 번호 입력 받기
	    private static int getValidMenuNumber(Scanner scan) {
	        while (true) {
	            if (scan.hasNextInt()) {
	                int menuNumber = scan.nextInt();
	                if (menuNumber >= 1 && menuNumber <= menuList.length) {
	                    return menuNumber;
	                } else {
	                    System.out.println("=> 잘못된 메뉴 번호입니다. 다시 입력해주세요.");
	                }
	            } else {
	                System.out.println("=> 올바르지 않은 입력값입니다. 숫자를 입력해주세요.");
	                scan.next(); // 잘못된 입력 처리
	            }
	        }
	    }

	    // 유효한 수량 입력 받기
	    private static int getValidQuantity(Scanner scan) {
	        while (true) {
	            if (scan.hasNextInt()) {
	                int quantity = scan.nextInt();
	                if (quantity > 0) {
	                    return quantity;
	                } else {
	                    System.out.println("=> 수량은 1 이상이어야 합니다. 다시 입력해주세요.");
	                }
	            } else {
	                System.out.println("=> 올바르지 않은 입력값입니다. 숫자를 입력해주세요.");
	                scan.next(); // 잘못된 입력 처리
	            }
	        }
	    }

	

}
