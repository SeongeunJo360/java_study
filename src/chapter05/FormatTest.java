package chapter05;

public class FormatTest {

	public static void main(String[] args) {
		//정수를 ,로 구분하는 메소드
		int a = 2800;
		String aa = String.format("%d", new Object[] { Integer.valueOf(a)});
		System.out.println(aa);

	}

}
