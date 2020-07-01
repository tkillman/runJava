package runJava.ch07;

public class Point {
	int x;
	int y;

	public Point() {
		// TODO Auto-generated constructor stub
		System.out.println("매개변수가 없는 디폴트 생성자");

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");

	}

}
