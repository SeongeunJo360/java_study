package gptdrink;

import java.util.Scanner;

public class Payment {
	int amountPaid;  // 사용자가 낸 금액
    int change;  // 잔돈

    // 결제 처리
    public void processPayment(int totalAmount) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("결제할 금액 입력> ");
            if (scan.hasNextInt()) {
                amountPaid = scan.nextInt();
                if (amountPaid >= totalAmount) {
                    change = amountPaid - totalAmount;
                    System.out.println("총 입금 금액 : " + amountPaid);
                    System.out.println("=> 결제 완료! 잔돈: " + change + "원");
                    break;
                } else {
                    System.out.println("=> 금액이 부족합니다. 다시 입력해주세요.");
                }
            } else {
                System.out.println("=> 올바르지 않은 입력값입니다. 다시 입력해주세요.");
                scan.next(); // 잘못된 입력 처리
            }
        }
    }

}
