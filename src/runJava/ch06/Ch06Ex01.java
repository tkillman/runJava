package runJava.ch06;

//////////// **************** �迭 ����*******************
//*** ������ �������� �������� �ʾƵ� ������ �������� ������ �����ϱ� ���ϰ� ������ش�.

public class Ch06Ex01 {

	public static void main(String[] args) {
		int[] a = new int[5];

		a[0] = 0;
		a[1] = 50;
		a[2] = 100;
		a[3] = 150;
		a[4] = 200;

		for (int i = 0; i < 5; i++) {
			System.out.println("a[" + i + "] :" + a[i]);
		}
	}

}
