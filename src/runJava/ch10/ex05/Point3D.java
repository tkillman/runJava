package runJava.ch10.ex05;

public class Point3D extends Point2D {
	protected int z = 30;

	public void setZ(int z){
		this.z=z;		
		System.out.println(x+50); // ����Ŭ�������� protected �� ����Ŭ������ ���� ���� 
		}
		
	public void showPoint(){
		System.out.println(">> �޼ҵ� �������̵� ��� Point3D�� showPoint() �޼ҵ尡 ����ȴ�.<<");
		System.out.println(x +","+ y +","+ z);
		System.out.println("");
		System.out.println(">>>>>> super.showPoint(); ���� Ŭ������ �޼ҵ带 ȣ��<<<<<<<<");
		super.showPoint();
		// ���� Ŭ������ �������̵� �� �޼ҵ带 ȣ���� �ʿ䰡 ���� ���
	}	
	 	
	}
	

