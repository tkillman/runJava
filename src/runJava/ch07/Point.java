package runJava.ch07;

public class Point {
	int x;
	int y;

	public Point() {
		// TODO Auto-generated constructor stub
		System.out.println("�Ű������� ���� ����Ʈ ������");

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");

	}

}
