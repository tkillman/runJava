package runJava.ch10.ex06;

// ******** ��ӿ����� ������***********
// ���� ������ kame.ch10.ex04_2�� ����.
public class Point3D extends Point2D {

	
	protected int z = 30;
	
	public Point3D(){ //������ 
		
		System.out.println("Point3D �� ������");
	}
	
	public Point3D(int x, int y, int z){
		System.out.println(x+","+y+","+z);
		
	}
	public void showPoint(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}	
		
}
	
		
		
	
	

