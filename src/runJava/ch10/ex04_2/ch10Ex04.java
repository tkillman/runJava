package runJava.ch10.ex04_2;

//************���� ������*****************

/****��� ����***
		1.Ŭ����  2.������Ű�� 3.����Ŭ����	4. �ٸ���Ű��
private     0
default     0         0
protected   0		  0       0	
public      0         0       0          0

0�� �����κп����� ���� ����.*/

// ���� ��� : ���� ��Ű���� �������� ���Ѵ�. 2,4���� Ȯ�� �� 1,3���� Ȯ���Ѵ�.

public class ch10Ex04 {

	public static void main(String[] args) {
		Accesssub obj= new Accesssub();
		
		obj.showAccessSuper();
		obj.showAccesssub();
	
		System.out.println("Ŭ���� ch10Ex04�� ���� �޼ҵ�");
		/*System.out.println(obj.m_pri);  // X
		System.out.println(obj.m_def); // x
		System.out.println(obj.m_pro);*/ // x
		System.out.println("�ٸ� ��Ű�� , ���� Ŭ������ �ƴ� ������ public ȣ��"+obj.m_pub); // o
		System.out.println("-----------------");
		
		
	}

}
