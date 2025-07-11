package kbank2;

import kbank.BankMan;

public class KBBankTest {

	public static void main(String[] args) {
		BankSystem kbsystem = new BankSystem("KB");
		AccountPaperVo accountPaper = AccountPaperVo.getInstance(); 
				
		BankMan staffPark = new BankMan("박보검",kbsystem); //은행직원은 고객리스트 정보를 가짐
//		staffPark.kbsystem.showAccountList();	//은행직원-> 고객정보 리스트 출력
		
		Customer hong = new Customer("홍길동", "kb - 1234", "1234", 0);
		hong.setAccountPaper(accountPaper);
//		AccountPaperVo.showInfo();
		staffPark.setAccountPaper(hong.getAccountPaper());
		staffPark.validateCheck(); //고객에게 전달받은 출금용지에 빈 값이 있는지 체크하는 작업
		
		while(validateFlag) {
			if(staffPark.validateCheck(hong.answer(staffPark.checkResult))) {
				validateFlag = false;
			}
		}
		staffPark.processWithdrawal();
		
		hong.confirmBalance(kbsystem); //AMT(은행시스템)을 이용하여 잔액을 확인
		
		
	}

}
