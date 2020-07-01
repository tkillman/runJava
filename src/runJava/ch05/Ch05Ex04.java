package runJava.ch05;

public class Ch05Ex04 {
 ///////////************* break :가장 가까운 반복문의 종료********/////////
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		System.out.println("");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);

			if (i % 3 == 0) {
				break;
			}
		}

	}

}
