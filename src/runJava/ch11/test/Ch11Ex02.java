package runJava.ch11.test;
import runJava.ch11.kame.ch11.ex02.*;

	//************** �޼ҵ� �������̵� + ���۷��� ���� ����ȭ �ǽ� ����**********
	//���� Ŭ������ ���۷��������� ���� Ŭ������ �ν��Ͻ��� �����ߴ�.
	// ���� ���۷��� ������ ���� �޼ҵ带 ȣ�������� 
	// ���� Ŭ���� �޼ҵ��� �����ε����� ����Ŭ������ �޼ҵ�� �������� 
	// ���� Ŭ������ �޼ҵ尡 ȣ��Ǹ鼭 ������ ������ ���� �� �ְ� �Ǿ���.
	// ������ �̷��� ���� ��� ���۷��� ��������� ��� ���Ƽ� 
	// � ������ ������ ���ϴ����� �ָ��ϴ�.
	// �ذ����� instanceof�� ����ؼ� ���۷��� ������ �ٲ��ش�.


public class Ch11Ex02 {

	public static void main(String[] args) {
		
		Shape ref=null;
		
		ref= new Circle();
		System.out.println("������ ������"+ref.area());
		
		ref= new Rectangle();
		System.out.println("������ ������"+ref.area());
		
		ref= new Triangle();
		System.out.println("������ ������"+ref.area());
		
	}
	
	
}
