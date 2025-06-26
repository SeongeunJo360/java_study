package chapter04;

import java.util.Scanner;

public class 실전예제04 {

	public static void main(String[] args) {
		//6세 이상 탑승 가능(120cm 이상이면 보호자 동반시 탑승 가능),120cm 이상 탑승 가능, 심장 질환자 탑승 불가, 
		/*
		 * 1. 6세 이상 탑승 가능(단, 6세 이하는 키가 120cm 이상이고 보호자 동반하에 탑승 가능
		 * 2. 키 120cm 이상 탑승 가능
		 * 3. 심장질환자는 탑승 불가
		 */
		//지역변수를 선언하는 경우에는 반드시 초기화를 진행함
		
		 String name =""; //클래스는 null값으로 초기화를 진행
		 int age = 0, hight =0;
		 boolean parent = false, hearchDease = false;
		 
		 System.out.println("********************************************");
		 System.out.println("놀이기구 탑승전 유의사항 및 확인");
		 System.out.println("1. 6세 이상 탑승 가능\n(단, 6세 이하는 키가 120cm 이상이고 보호자 동반하에 탑승 가능 \r\n"
		 		+ "2. 키 120cm 이상 탑승 가능 \r\n"
		 		+ "3. 심장질환자는 탑승 불가");
		 System.out.println("********************************************");
		 
		 Scanner input = new Scanner(System.in);
		 System.out.print("이름 > ");
		 name = input.next();
		 System.out.print("나이 > ");
		 age = input.nextInt();
		 System.out.print("키(cm) > ");
		 hight = input.nextInt();
    	 System.out.print("보호자 동반 (동반⭕:1/동반❌:0) > ");
    	 parent = (input.nextInt() ==1)? true:false;
//    	 boolean parent = scan.nextBoolean();
		 System.out.print("심장질환 (⭕:1/❌:0) > ");
//		 boolean hearchDease = scan.nextBoolean();
		 hearchDease = (input.nextInt() ==1)? true:false;
		
	 	 //((6세이상 키 120이상)||(6세미만 키120 이상 보호자))&&(심장질환)
		 String result = ((age >= 6 && hight >=120) || ((age < 6 && hight >=120)&& parent == true)) 
				 && (hearchDease == false)? "가능" : "불가능";
		
		 System.out.println("탑승 가능 여부 : " +result);
		
		

	}

}
