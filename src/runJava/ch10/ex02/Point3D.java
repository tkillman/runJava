package runJava.ch10.ex02;


// ���� ������ protected �� ��� ����

// Point3D ���� Ŭ����
// Point2D ���� Ŭ����
public class Point3D extends Point2D {

	
	protected int z;
	
	public void setZ(int z){
		this.z=z;
		
		System.out.println("x�� 50�� ���� �� : "+ (x+50)); // ����Ŭ�������� protected �� ����Ŭ������ ���� ���� 
		}
		
	public void showPoint(){
		
		System.out.println(x +","+ y +","+ z);
		// x�� y�� Point2D�� protected �� ���������� ������ �����ߴ�.
		
	}	
		
	}
	

