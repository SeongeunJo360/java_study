package chapter06;

import java.util.Scanner;
/*
 * 
 */
public class ScoreTestVer4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		boolean menuFlag = true;
		
		System.out.print("입력할 학생수> ");
		final int MAX_SIZE = scan.nextInt();
		String nameList[] = new String[MAX_SIZE];
		int scoreList[][] = new int [MAX_SIZE][MAX_SIZE+2];	
		int count = 0;//등록된 학생 수 저장
		while(menuFlag) {
			System.out.println("--------------------------------------------------------");
			System.out.println("\t더조은 고등학교 1학년 1반 학생들의 성적관리 프로그램");
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 리스트 출력");
			System.out.println("3. 학생 성적 검색");
			System.out.println("4. 학생 성적 수정");
			System.out.println("5. 학생 성적 삭제");
			System.out.println("9. 프로그램 종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("메뉴선택(숫자)> ");
			menu = scan.nextInt();	
			String subjectList[] = {"국어", "영어", "수학"};	
			int tot=0, avg=0; //메뉴1,4 공용으로 사용하는 변수이므로, 단계별 초기화 필요!!
			
			if(menu == 1) {//학생 등록
				//step2: 데이터 입력 - 실행시 외부에서 입력
				for(int i=count;i<nameList.length;i++) {
					
					System.out.print("학생명> ");
					nameList[i]=scan.next();
					//학생의 점수를 입력할 배열을 생성함
					scoreList[i]=new int[5];
					tot=0;
					avg=0;
					for(int j=0;j<subjectList.length;j++){
						System.out.print(subjectList[j]+">");
						scoreList[i][j]=scan.nextInt();
						tot+=scoreList[i][j];
						avg=tot/3;
					}
					scoreList[i][scoreList[i].length - 2] = tot;	//총점
					scoreList[i][scoreList[i].length - 1] = avg; //평균										
					count++;
					
					System.out.print("계속 입력 하시겠습니까?(계속: 아무키나누르세요, 종료:n)>?");
					if(scan.next().equals("n")) {
						i = nameList.length; //break;
						System.out.println("=> 등록 완료");
					}
				}
			}
			else if(menu == 2) {//학생 리스트 출력
				//step3: 데이터 출력
				if(count != 0) { //nameList[0] != null
					System.out.println("--------------------------------------------------------");
					System.out.print("학생명\t국어\t영어\t수학\t총점\t평균\n");
					System.out.println("--------------------------------------------------------");
					for(int i=0;i<count;i++) {
						System.out.print(nameList[i]+"\t");
						for(int j=0;j<scoreList[i].length;j++){
							System.out.print(scoreList[i][j]+"\t");
						}
						System.out.println();
					}
				System.out.println("--------------------------------------------------------");
				}
				else {
					System.out.println("=> 등록된 데이터가 없습니다. 등록을 진행해 주세요.");
				}
			}
			else if(menu == 3) {//학생 성적 검색
				if(count != 0) { //nameList[0] != null
					//step4: 데이터 조회
					boolean searchFlag =  true;
					while(searchFlag) {
						//조회할 학생명 입력
						System.out.print("조회할 학생명> ");
						String searchName = scan.next();
						//nameList에서 입력한 학생명 검색 - for문 -> 학생의 nameList 주소를 변수(for블록 밖에)에 저장한다.
						int searchIdx = -1;
						int countIdx = 0;
						for(String name : nameList) {
							if(name != null) {
								if(name.equals(searchName)) searchIdx = countIdx;
								countIdx++;
							}
						}
						if(searchIdx != -1) {
							System.out.println("검색결과 주소 : "+searchIdx);
							
							//step5: 데이터 조회 결과 출력
							System.out.println("--------------------------------------------------------");
							System.out.print("학생명\t국어\t영어\t수학\t총점\t평균\n");
							System.out.println("--------------------------------------------------------");
							for(int score: scoreList[searchIdx]) {
								System.out.print(score+"\t");
								
								System.out.print("계속 검색하시겠습니까?(계속: 아무키나누르세요, 종료:n)>?");
								if(scan.next().equals("n")) {
									searchFlag = false;
								}
							}
							System.out.println("--------------------------------------------------------");
						}
						else {
							System.out.println("=> 검색한 데이터가 없습니다.");
						}
					}//while - searchFlag:step4,5 반복}
				}
			}
			else if(menu == 4) {//학생 성적 수정
				if(count != 0) {
					boolean modiFlag = true;
					while(modiFlag) {				
						System.out.println("[수정] 학생명 검색>");
						String modifiedName = scan.next();
						int modiIdx = -1;
						
						for(int i=0;i<count;i++) {
							if(nameList[i].equals(modifiedName)) {
								modiIdx=i;
							}
						}
						if(modiIdx == -1) {
							System.out.println("수정할 데이터가 존재X, 다시 입력해주세요");
						}
						else {
							scoreList[modiIdx]=new int[5];
							tot=0;
							avg=0;
							for(int j=0;j<subjectList.length;j++){
								System.out.print(subjectList[j]+">");
								scoreList[modiIdx][j]=scan.nextInt();
								tot+=scoreList[modiIdx][j];
								avg=tot/3;
							}
							scoreList[modiIdx][scoreList[modiIdx].length-2] = tot;	//총점
							scoreList[modiIdx][scoreList[modiIdx].length-1] = avg; //평균										
							
							System.out.println("=> 수정 완료");
							System.out.println("--------------------------------------------------------");
							System.out.print("학생명\t국어\t영어\t수학\t총점\t평균\n");
							System.out.println("--------------------------------------------------------");
							for(int score: scoreList[modiIdx]) {
								System.out.print(score+"\t");
							}
							System.out.println("--------------------------------------------------------");
							System.out.print("계속 수정 하시겠습니까?(계속: 아무키나누르세요, 종료:n)>?");
							if(scan.next().equals("n")) {
								modiFlag = false; //또는 break;
							}
						}
					}
				}
				else {
						System.out.println("=> 등록된 데이터가 없습니다. 등록을 진행해주세요.");
					}
			}
			else if(menu == 5) {//학생 성적 삭제
				if(count != 1) {
					boolean deleteFlag = true;
					while(deleteFlag) {
						System.out.print("[삭제] 학생명 검색> ");
						String deleteName = scan.next();
						int deleteIdx = -1;
						for(int i=0;i<count;i++) {
							if(nameList[i].equals(deleteName)) {
								deleteIdx=i;
							}
						}
						if (deleteIdx != -1) {
							for(int i=deleteIdx;i<count-1;i++) {
								nameList[i] = nameList[i+1];
								scoreList[i]=scoreList[i+1];
								}
								count--;
								System.out.println("=> 삭제 완료");
								System.out.print("계속 삭제 하시겠습니까?(계속: 아무키나누르세요, 종료:n)>?");
								if(scan.next().equals("n")) {
									deleteFlag = false; //또는 break;
								}
							}
						else {
							System.out.println("삭제할 데이터가 존재X,다시 입력해주세요.");
							}
						}//while
					}
			}
			else if(menu == 9) {//프로그램 종료
				System.out.println("--프로그램 종료--");
				System.exit(0);
			}
			else {
				System.out.println("메뉴 준비중입니다.");
			}
//			if(menu != 1) {
//				System.out.print("계속 진행 하시겠습니까?(계속: 아무키나누르세요, 종료:n)>?");
//				if(scan.next().equals("n")) {
//					menuFlag = false; //또는 break;
//				}
//			}
		}//while
		System.out.println("--프로그램 종료--");
	}//main
}
