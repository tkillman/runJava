package runJava.ch10.ex04_2;

import runJava.ch10.ex02.Point3D;

// ********���� ������************
// �ٸ� ��Ű��, ���� Ŭ������ �ƴ� ������ protected ������ ���� �Ұ�

public class Ch10Ex02 {

	public static void main(String[] args) {
		
		Point3D pt =new Point3D(); // Point3D�� Ŭ������ ��ü ����
		
		
		// protected x,y,z ��
		
		/*pt.x =10; pt.y=20; pt.z=30;
		System.out.println(pt.x+","+ pt.y+ "," +pt.z);
		*/
		
		pt.setX(10); pt.setY(20); pt.setZ(30);
		
		pt.showPoint();
		
		
	}
	
	

}
