package runJava.ch10.ex07;

// ************* ��ӿ����� ������************
//���� ������ kame.ch10.ex04_2�� ����.
// Point2D �Ű����� ���� �����ڸ� �ּ� ó���ϴ� ��� ���� Ŭ������ �Ű����� ���� �����ڸ� �����ϴµ��� ������ �߻��Ѵ�.
// �ֳ��ϸ� ��ü�� ���� �� ����Ŭ������ �����ڰ� ȣ��Ǹ� ���� Ŭ������ �����ڵ� ȣ��Ǿ�� �ϱ� �����̴�.

public class Point3D extends Point2D {

	
	protected int z = 30;
	
	public Point3D(){
		
		System.out.println("Point3D �� ������");
	}
	
	public Point3D(int x, int y, int z){
		super(x,y); // ����Ŭ������ �����ڸ� ��������� ȣ���ϴ� ���.
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public void showPoint(){
		System.out.println(">>>>Point3D�� showPoint() �޼ҵ� ����<<<<");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}	
		
}
	

		
	
	

