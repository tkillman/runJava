package runJava.ch11.test;

import runJava.ch11.kame.ch11.ex01.*;

//******************** ���۷��� �� ��ȯ******************
//*****Ŭ������ ��� ���迡 ���� ���� ���۷��� �� ��ȯ�� �����ϴ�.
public class Ch11Ex01_1 {
	
	public static void main(String[] args) {
		
		Point3D pt;
		pt=new Point3D();
	
		Point2D up= new Point3D();
		
		//Point2D up;
		// up = pt;
		
		//�Ͻ��� ����ȯ 
		//���� Ŭ������ ���۷��������� ���� Ŭ������ �ν��Ͻ� ����
		// ��ü : �ν��Ͻ� ���� +���۷��� ����
		
		//Point3D down = new Point2D(); �����߻� ���� Ŭ������ �ν��Ͻ��� �� ���� ������ �����ϰ� �ִ�.
		//����� ����ȯ
		
		//System.out.println(down.z);
		System.out.println("Point3D ���۷��� ���� ���");
		System.out.println(pt.x);
		System.out.println(pt.y);
		System.out.println(pt.z);
		System.out.println("Point2D ���۷��� ���� ���");
		System.out.println(up.x);
		System.out.println(up.y);
		//System.out.println(up.z);  // ������ ���� �߻� --> ��ĳ�������� ��ӹ��� �ʵ�� ��ҵǾ
		
		
	}
	
	
}
