package runJava.ch11.test;
import runJava.ch11.kame.ch11.ex01.*;

///////********** ���۷��� ���� ����ȭ***************
//// �� ĳ���ð� �ٿ� ĳ����
//*** �� ĳ���� : ���� Ŭ������ ���۷��� ������ ���� Ŭ������ �ν��Ͻ��� ���� , �Ͻ��� �� ��ȯ
//*** �ٿ� ĳ���� : ���� Ŭ������ ���۷��� ������ ���� Ŭ������ �ν��Ͻ��� ���� , ����� �� ��ȯ 

public class Ch11Ex01_2 {

	public static void main(String[] args) {
		Point2D up = new Point3D();
		System.out.println("���� Ŭ������ Point2D�� ���۷��� ���� ���");
		System.out.println(up.x);
		System.out.println(up.y);
		//System.out.println(up.z);
		
		Point3D down = (Point3D)up;
		System.out.println("���� Ŭ������ Point3D�� ���۷��� ���� ���");
		System.out.println(down.x);
		System.out.println(down.y);
		System.out.println(down.z);
	}
	

}
