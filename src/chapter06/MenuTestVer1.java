package chapter06;

import java.util.Scanner;

/*
 * 더조은 레스토랑 메뉴 등록/출력/검색 프로그램
 * - 메뉴는 피자, 햄버거, 라멘, 셀러드 menuList
 * - 메뉴명, 이모지, 가격을 저장
 * - 메뉴명, 이모지, 가격은 각각 1차원 배열로 생성하여 관리
 * - 메뉴 관리를 위해서 각 배열의 주소를 통일시킨다
 */
public class MenuTestVer1 {

	public static void main(String[] args) {
		//변수 or 객체 선언
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴 개수> ");
		final int MAX_SIZE = scan.nextInt();
		String nameList[] = new String[MAX_SIZE];
		String emojList[] = new String[MAX_SIZE];
		int priceList[] = new int[MAX_SIZE];
		//메뉴 등록/출력/검색/종료
		boolean menuFlag = true;
		int menu = 0;
		int menuCount = 0;//등록된 메뉴 수 저장-메뉴 등록 완료시 ++
		while(menuFlag) {
			System.out.println("--------------------------------------------------------");
			System.out.println("\t더조은 레스토랑 메뉴 관리 프로그램");
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴 리스트 출력");
			System.out.println("3. 메뉴 검색");
			System.out.println("9. 프로그램 종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("메뉴선택(숫자)> ");
			menu = scan.nextInt();
			
			if(menu == 1) {
				for(int i=menuCount;i<MAX_SIZE;i++) {
					System.out.print("메뉴 이름> ");
					nameList[i]=scan.next();
					System.out.print("이모지> ");
					emojList[i]=scan.next();
					System.out.print("메뉴 가격> ");
					priceList[i]=scan.nextInt();
					menuCount++;
					if(menuCount==MAX_SIZE) {
						System.out.println("=> 저장공간 부족, 등록 종료.");
					}
					else {
						System.out.print("=>입력 속행(계속: 아무키나누르세요, 종료:n)>");
						if(scan.next().equals("n")) {
							i = MAX_SIZE; //break;
							System.out.println("=> 등록 완료");
						}
					}
				}
			}	
			else if(menu == 2) {
				//step3: 데이터 출력
				if(menuCount != 0) { //nameList[0] != null
					System.out.println("--------------------------------------------------------");
					System.out.print("메뉴\t이모지\t메뉴 가격\n");
					System.out.println("--------------------------------------------------------");
					for(int i=0;i<MAX_SIZE;i++) {
						//이름이 null이 아닌 경우에만 출력
						if(nameList[i] != null) {
							System.out.print(nameList[i]+"\t");
							System.out.print(emojList[i]+"\t");
							System.out.print(priceList[i]+"\n");
						}
					}
				System.out.println("--------------------------------------------------------");
				System.out.println("출력 완료");
				}
				else {
					System.out.println("=> 등록된 데이터가 없습니다. 등록을 진행해 주세요.");
				}
			}
			else if(menu == 3) {
				if(menuCount != 0) { //nameList[0] != null
					//step4: 데이터 조회
					boolean searchFlag =  true;
					while(searchFlag) {
						//조회할 학생명 입력
						System.out.print("조회할 메뉴명> ");
						String searchMenu = scan.next();
						//nameList에서 입력한 학생명 검색 - for문 -> 학생의 nameList 주소를 변수(for블록 밖에)에 저장한다.
						int searchIdx = -1;
						int countIdx = 0;
						for(int i=0;i<menuCount;i++) {
							if(searchMenu.equals(nameList[i])) {
								searchIdx = i;
							}
							System.out.println("검색결과 주소 : "+searchIdx);
						}
						//출력:searchIdx가 -1이 아닌 경우
						if(searchIdx == -1) {
							System.out.println("=> 검색한 메뉴 없음 ");
						}
						else {
							//step5: 데이터 조회 결과 출력
							System.out.println("--------------------------------------------------------");
							System.out.println("검색 결과");
							System.out.println("--------------------------------------------------------");
							System.out.print("메뉴\t이모지\t메뉴 가격\n");
							System.out.println("--------------------------------------------------------");
							System.out.print(nameList[searchIdx]+"\t");
							System.out.print(emojList[searchIdx]+"\t");
							System.out.print(priceList[searchIdx]+"\n");
							System.out.println("--------------------------------------------------------");
							System.out.println("=> 검색 완료");
						}	
							System.out.print("계속 검색하시겠습니까?(계속: 아무키나누르세요, 종료:n)>?");
							if(scan.next().equals("n")) {
								searchFlag = false;
								System.out.println("검색 종료");
							}
						
					}//while - searchFlag:stwp4,5 반복}
				}
				else {
					System.out.println("=> 등록된 데이터가 없습니다. 등록을 진행하세요.");
				}
			}			
			else if(menu == 9) {
				System.out.println("--프로그램 종료--");
				System.exit(0);
			}
			else {
				System.out.println("=> 메뉴 준비중");
			}
			
			
		}

	}//main

}
