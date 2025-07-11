package kbank2;

public class Customer {
	private String name;
	private String accountNumber;
	private String password;
	private int money;
	private AccountPaperVo accountPaper;
	private Scanner scan;
	
	public Custoner() {}
	public Customer(String name, String accountNumber, String password, int money) {
		this.name = "[은행직원 : "+ name+ "]";
		this.accountNumber = accountNumber;
		this.password = password;
		this.money = money;
		this.scan = new Scanner(System.in);
	}
	/**
	 * 고객의 출금정보 유효성 체크 결과에 따라 질문
	 */
	public AccountPaperVo answer(int checkResult) {
		switch(checkResult) {
		case BankMan.ACCOUNT_NAME:
			System.out.print("이름 > ");
			accountPaper.setName(scan.next());
			break;
		case BankMan.ACCOUNT_NUMBER:
			System.out.print("계좌 번호> ");
			accountPaper.setAccountNumber(scan.next());
			break;
		case BankMan.ACCOUNT_PASSWORD:
			System.out.print("비밀 번호> ");
			accountPaper.setPassword(scan.next());
			break;
		case BankMan.ACCOUNT_MONEY:
			System.out.print("잔액> ");
			accountPaper.setAccountMoney(scan.next());
			break;
		}
		return accountPaper;
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
	public AccountPaperVo getAccountPaper() {
		return accountPaper;
	}
	public void setAccountPaper(AccountPaperVo accountPaper) {
		accountPaper.setName(this.name);
		accountPaper.setAccountNumber(this.accountNumber);
		accountPaper.setPassword(this.password);
		accountPaper.setMoney(this.money);
		this.accountPaper = accountPaper;
		
		
		
//		this.accountPaper = accountPaper;
//		this.accountPaper.setName(this.name);
//		this.accountPaper.setAccountNumber(this.accountNumber);
//		this.accountPaper.setPassword(this.password);
//		this.accountPaper.setMoney(this.money);
	}
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	
}
