package runJava.ch05;

public class Ch05Ex06 {

	/////**********continue ����************///
	//continue�� continue ������ �ڵ带 �������� �ʰ� �ݺ������� ���ư���.
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");

		for (int i = 1; i <= 10; i++) {

			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
