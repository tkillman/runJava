package runJava.ch05;

public class Ch05Ex05 {

	
//////////****���̺��� ����� �ݺ��� ����������*******/////	
	public static void main(String[] args) {
		int cnt;
		int i;

		for (cnt = 1; cnt < 5; cnt++) {
			for (i = 1; i < 10; i++) {
				if (i % 3 == 0) {
					break;
				}
				System.out.print(" " + i);
			}
			System.out.println();
		}

		System.out.println("\n break�� ���̺� �����ϱ�");

		exit_for: for (cnt = 1; cnt <= 5; cnt++) {
			for (i = 1; i < 10; i++) {
				if (i % 3 == 0) {
					break exit_for;
				}
				System.out.print(" " + i);
			}
		}
	}

}// ���� �޼ҵ� ����
