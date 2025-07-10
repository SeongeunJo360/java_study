package kbbank;

import java.util.Scanner;

public class Customer {
	private String name;
	private String accountNumber;
	private String password;
	private int money;
	private AccountPaperVo accountPaper;
	
	public Customer() {}
	public Customer(String name, String accountNumber, String password, int money) {
		scan = new Scanner(System.in);
		this.name = name;
		this.accountNumber = accountNumber;
		this.password = password;
		this.money = money;
		
	}
	public Scanner getScan() {
//		return scan;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public AccountPaperVo getAcountPaper() {
		return accountPaper;
	}
	public void setAcountPaper(AccountPaperVo accountPaper) {
		this.accountPaper = accountPaper;
		this.accountPaper.setName(this.name);
		this.accountPaper.setAccountName(this.accountNumber);
		this.accountPaper.setPassword(this.password);
		this.accountPaper.setMoney(this.money);
	}
	
	
}
