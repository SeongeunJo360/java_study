package chapter07;

import java.util.Scanner;
/*
 * - 학생 3명의 점수를 입력 받는다.
 * - 한 명 입력 후 계속 입력 여부를 메시지로 출력 루 입력 받는다.
 */

public class ScoreMgmSystem {
	//Field = 필드변수, 멤버변수, 전역변수
	Scanner scan = new Scanner(System.in);
	String agmin;
	Student student;
	Student[] sList = new Student[10];
	int count = 0;
	
	//Constructor
	public ScoreMgmSystem() {
		
	}
	//Method
//	insert(), update(), remove(), search()
	/*
	 * 선택한 메뉴에 따라 기능별 메소드 호출 
	 */
	public void showMenu() {
		System.out.println("--------------------------------------------------------");
		System.out.println("\t더조은 고등학교 1학년 1반 학생들의 성적관리 프로그램");
		System.out.println("--------------------------------------------------------");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 리스트 출력");
		System.out.println("3. 학생 성적 검색");
		System.out.println("4. 학생 성적 수정");
		System.out.println("5. 학생 삭제");
		System.out.println("9. 프로그램 종료");
		System.out.println("--------------------------------------------------------");
		
		System.out.print("메뉴선택(숫자)> ");
//		int menu = scan.nextInt();
//		choiceMenu(menu);
		
		menuCheck(scan.nextInt());
	}
	/*
	 * 선택한 메뉴에 따라 기능별 메소드 호출
	 */
	public void menuCheck(int menu) {
		switch(menu) {
		case 1: //학생 등록
			insert(); 
			showMenu();
			break;
		case 2: //학생 리스트 출력
			showList(); 
			showMenu();
			break;
		case 3: // 학생 성적 검색
			search();
			showMenu();
			break;
		case 4: // 학생 성적 수정
			update(); 
			showMenu();
			break;
		case 5: // 학생 삭제
			remove();
			showMenu();
			break;
		case 9: 
			System.out.println("----성적 관리 시스템 종료----");
			System.exit(0);
			break;
		default:
			System.out.println("=> 메뉴 준비 중");
			showMenu();

		}
	}
	
	public void insert() {
		System.out.println("=> 학생 정보를 등록하세요.");
		sList[count] = new Student();
		
		System.out.print("학생명> ");
		sList[count].name = scan.next();
		System.out.println("점수를 입력하시오.");
		System.out.print("국어> ");
		sList[count].kor = scan.nextInt();
		System.out.print("영어> ");
		sList[count].eng = scan.nextInt();
		System.out.print("수학> ");
		sList[count].math = scan.nextInt();
		count++;
		System.out.println("=> 등록 완료");
		System.out.print("계속 등록(아무거나), 종료(n)?> ");
		if (scan.next().equals("n")) {
			showMenu();
		}
		else {
			insert();
		}
		
	}
	public void showList() {
		if(count!=0) {
			System.out.println("**************************************************");
			System.out.println("학생\t국어\t영어\t수학\t총합\t평균");
			System.out.println("**************************************************");
			int i=0;
			for(Student student: sList) {
//				if(i<count) {
				if(student != null) {
					System.out.print(student.name+"\t");
					System.out.print(student.kor+"\t");
					System.out.print(student.eng+"\t");
					System.out.print(student.math+"\t");
					System.out.print(student.getTot()+"\t");
					System.out.println(student.getAvg());
				}
				else {
					break;
				}
				i++;
			}
			System.out.println("**************************************************");
		}
		else {
			System.out.println("=> 등록된 데이터 없음, 등록부터 진행해 주세요.");
		}
	}
	/*
	 * 학생명을 검색하여 주소를 리턴하는 메소드
	 */
	public int searchIndex(String pname) {
		System.out.print(pname+"조회할 학생명> ");
		String searchName = scan.next();
		int searchIdx = -1;
		for(int i=0;i<count;i++) {
			Student student = sList[i];
			if(student.name.equals(searchName)) {
				searchIdx = i;
			}
		}
		return searchIdx;
	}
	public void search() {
	    if (count != 0) {
	        System.out.println("=> 학생 정보를 검색하세요");
	        int searchIdx = searchIndex("[검색]");

	        if (searchIdx != -1) {
	            System.out.println("--------------------------------------------------------");
	            System.out.print("학생명\t국어\t영어\t수학\t총점\t평균\n");
	            System.out.println("--------------------------------------------------------");
	            System.out.print(sList[searchIdx].name + "\t");
	            System.out.print(sList[searchIdx].kor + "\t");
	            System.out.print(sList[searchIdx].eng + "\t");
	            System.out.print(sList[searchIdx].math + "\t");
	            System.out.print(sList[searchIdx].getTot() + "\t");
	            System.out.print(sList[searchIdx].getAvg() + "\n");
	            System.out.println("--------------------------------------------------------");

	            System.out.print("계속 검색하시겠습니까?(계속: 아무키나누르세요, 종료:n)>?");
	            if (scan.next().equals("n"))
	                showMenu();
	            else
	                search();
	        } else {
	            System.out.println("=> 검색한 데이터 없음");
	            return;
	        }
	    } else {
	        System.out.println("=> 등록된 데이터가 없습니다. 등록을 진행해주세요.");
	    }
	}

		public void update() {
			if (count != 0) {
				System.out.println("=> 학생 정보를 수정하세요");
				int modiIdx = searchIndex("[수정]");
				
				if (modiIdx == -1) {
					System.out.println("수정할 데이터가 존재X, 다시 입력해주세요");
				} else {
					System.out.print("국어> ");
					sList[modiIdx].kor = scan.nextInt();
					System.out.print("영어> ");
					sList[modiIdx].eng = scan.nextInt();
					System.out.print("수학> ");
					sList[modiIdx].math = scan.nextInt();

					System.out.println("=> 수정 완료");
					System.out.println("--------------------------------------------------------");
					System.out.print("학생명\t국어\t영어\t수학\t총점\t평균\n");
					System.out.println("--------------------------------------------------------");
					System.out.print(sList[modiIdx].name + "\t");
					System.out.print(sList[modiIdx].kor + "\t");
					System.out.print(sList[modiIdx].eng + "\t");
					System.out.print(sList[modiIdx].math + "\t");
					System.out.print(sList[modiIdx].getTot() + "\t");
					System.out.print(sList[modiIdx].getAvg() + "\n");
					System.out.println("--------------------------------------------------------");

					System.out.print("계속 검색하시겠습니까?(계속: 아무키나누르세요, 종료:n)>?");
					if (scan.next().equals("n"))
						showMenu();
					else
						update();
				}
			} else {
				System.out.println("=> 등록된 데이터가 없습니다. 등록을 진행해주세요.");
			}
		}

	public void remove() {
		if(count != 0) {
			System.out.println("=> 학생 정보를 삭제하세요");
		
			int deleteIdx = searchIndex("[삭제]");
			if (deleteIdx != -1) {
				for(int i=deleteIdx;i<count-1;i++) {
					sList[i] = sList[i+1];
					}
					sList[count-1] = null;
					count--;
					System.out.println("=> 삭제 완료");
					System.out.print("계속 삭제 하시겠습니까?(계속: 아무키나누르세요, 종료:n)>?");
					if(scan.next().equals("n")) showMenu();
					else remove();
			}
			else {
				System.out.println("삭제할 데이터가 존재X,다시 입력해주세요.");
			}	
		}	
	}
	
	
}
