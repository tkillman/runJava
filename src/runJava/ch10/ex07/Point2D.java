package runJava.ch10.ex07;


//******** ��ӿ����� ������********
//���� ������ kame.ch10.ex04_2�� ����.
public class Point2D {

	protected int x;
	protected int y;
	
	//�ּ� ���Ѻ���
	public Point2D(){
		System.out.println("point2D ������");
	}
	//������� �ּ� ���Ѻ���
	
	public Point2D(int x, int y){
		this.x=x;
		this.y=y;		
		System.out.println("Point2D(int x, int y) ������ ���ప :"+x+","+y);
	}
	
	
	
}
