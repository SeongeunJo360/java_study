package vending_machine_ver;

import commons.Menu;

public class VendingMachine {
	String[] namesList = {"☕ 밀크커피","☕ 아메리카노","🍋 유자차","🥛 우유"};
	int[] priceList= {300, 400, 300, 200};
	Menu[] menuList;
	String title;
	
	public VendingMachine() {
		this("막심");
	}
	public VendingMachine(String title) {	
		this.title=title;
		createMenuList();
		showMenuList();
	}
	/*
	 * 메뉴 출력
	 */
	public void showMenuList() {
		System.out.println("*************************************************");
		System.out.println("\t☕🍵🥤 "+title+" Coffee Menu");
		System.out.println("*************************************************");
		for(Menu menu: menuList) {
			System.out.print(menu.no+".\t");
			System.out.print(menu.name+"\t");
			System.out.print(String.format("%,d", menu.price)+"\n");
		}
		System.out.println("*************************************************");
	}
	/*
	 * 메뉴 리스트 생성
	 */
	public void createMenuList() {
		for(int i=0;i<nameList.length;i++) {
			int no = i+1;
			String name = nameList[i];
			int price = priceList[i];			
			
			Menu menu = new Menu(no,name,price);
			menuList[i]=menu;
		}
	}

}
