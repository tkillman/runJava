package runJava.ch10.ex06;

// ******** ��ӿ����� ������***************
//���� ������ kame.ch10.ex04_2�� ����.
public class Point2D {

	protected int x;
	protected int y;
	
	public Point2D(int x, int y){
		System.out.println(x+","+y);
	}
	
	public Point2D(){ // ������ 
		System.out.println("point2D ������");
	}
}
