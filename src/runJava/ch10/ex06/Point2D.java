package runJava.ch10.ex06;

// ******** 상속에서의 생성자***************
//실행 파일은 kame.ch10.ex04_2에 있음.
public class Point2D {

	protected int x;
	protected int y;
	
	public Point2D(int x, int y){
		System.out.println(x+","+y);
	}
	
	public Point2D(){ // 생성자 
		System.out.println("point2D 생성자");
	}
}
