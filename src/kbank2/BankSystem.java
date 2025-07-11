package kbank2;

import kbank.AccountVo;

public class BankSystem {
	String name;
	AccountVo[] accountList;
	
	public BankSystem(String name) {
		this.name = name;
		// 은행 고객 리스트 생성 accountList 생성
		accountList = createAccountList();	//은행 고객 리스트 생성
	}
	/**
	 * 계정 검색
	 */
	public int searchAccount(AccountPaperVo accountPaper) {
		int resultIdx = -1;
		
		for(int i=0;i<accountList.length;i++) {
			AccountVo account = accountList[i];
			if(account.getName().equals(accountPaper.getName())
					&&account.getAccountNumber().equals(accountPaper.getAccountNumber())
					&&account.getPassword().equals(accountPaper.getPassword())){
						
					}
		}
		return resultIdx;
	}
	/**
	 * 은행직원이 관리하는 고객 리스트 출력
	 */
	public void showAccountList() {
		System.out.println("=============================================================");
		System.out.println("\t"+name+" 고객 리스트");
		System.out.println("=============================================================");
		for(int i=0;i<accountList.length;i++) {
			AccountVo account = accountList[i];
			System.out.print(i+1+".\t");
			System.out.print(account.getName()+"\t");
			System.out.print(account.getAccountNumber()+"\t");
			System.out.print(account.getPassword()+"\t");
			System.out.println(account.getBalance()+"\t");
		}
		System.out.println("=============================================================");
	}
	/**
	 * 은행 직원이 괄리하는 고객 리스트
	 */
	public AccountVo[] createAccountList() {
		String[] names = {"홍길동", "이순신", "김유신"};
		String[] numbers = {"kb - 1234","kb - 9876", "kb - 3456"};
		String[] passwords = {"1234","9876","3456"};
		int[] balances = {500, 1000, 700};
		AccountVo[] list = new AccountVo[names.length];
		
		for(int i=0;i<names.length;i++) {
			AccountVo account = new AccountVo();
			account.setName(names[i]);
			account.setAccountNumber(numbers[i]);
			account.setPassword(passwords[i]);
			account.setBalance(balances[i]);
			
			list[i] = account; //이게 안들어가면 값들이 안만들어진다/
		}
		return list;
		
	}
}
