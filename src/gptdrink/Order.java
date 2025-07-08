package gptdrink;

public class Order {
	Menu menu;			//선택한 음료
	int quantity;		//수량
	int totalAmount;	//합계

	 // 주문 생성자
    public Order(Menu menu, int quantity) {
        this.menu = menu;
        this.quantity = quantity;
        this.totalAmount = menu.price * quantity;
    }

    // 주문 정보 출력
    public void printOrderDetails() {
        System.out.println("=> 주문 메뉴 : " + menu.name + ", 결제 예정 금액 : " + totalAmount + "원");
    }
}
