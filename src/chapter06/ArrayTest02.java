package chapter06;

public class ArrayTest02 {

	public static void main(String[] args) {
		//names 문자열 변수 선언 및 생성
		String[] names;
		String names2[];
		
		names = new String[3];
		names2 = new String[5];
		
		names[0] = "홍길동";//값이 heap에 저장됨
//		names = "이순신';// stack에 저장하려고 해서 오류 -> 이미 주소값이 들어가 있고 그 주소감ㅅ은 JVM이 설정한거라 변경이 불가능하다.
		
		int scores[] = new int[10];
		int scores2[] = new int[3];
		int scores3[] = {10, 20, 30};
		String names3[] = {"홍길동", "홍길순"};
		
		//names 2번때 공간에 "이순신" 저장
		names[1] = "이순신";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names2[0]);
		System.out.println(names3[0]);
		System.out.println(scores[0]);
		System.out.println(scores2[0]);
		System.out.println(scores3[0]);
	}

}
