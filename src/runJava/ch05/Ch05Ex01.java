package runJava.ch05;

public class Ch05Ex01 {
	//****** �ݺ����� ���ǹ��� ����~********
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 100; i++) {

			total += i;
			if (i % 10 == 0) {
				System.out.println(total);

			}

		}

	}

}
