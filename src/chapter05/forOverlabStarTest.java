package chapter05;

import java.util.Scanner;

/*
 [시작]
 *
 **
 ***
 ****
 *****
 [종료]
 */
public class forOverlabStarTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("처음 *의 개수 > ");
		int start = scan.nextInt();
		System.out.print("마지막 *의 개수 > ");
		int end = scan.nextInt();
		System.out.println("[시작]");
		
		//줄 반복(행)
		for(int i=start; i<=end; i++) {
			//별 반복(열)
			for(int j=1;j<=i;j++) {
				if (i>=j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("[종료]");
	}

}
