package runJava.ch05;

public class Ch05Ex04 {
 ///////////************* break :���� ����� �ݺ����� ����********/////////
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
