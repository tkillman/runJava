package runJava.ch10.ex04_2;
import runJava.ch10.ex04.AccessSuper;


// ********* ���� ������*****************
// �ٸ� ��Ű�� , �ٸ� Ŭ����, ���� Ŭ����


public class Accesssub extends AccessSuper {

	
	void showAccesssub(){
		System.out.println("Ŭ���� AccessSuper�� show �޼ҵ�");
		/*System.out.println(m_pri);  // X
		System.out.println(m_def);*/ // x
		System.out.println("�ٸ� ��Ű�� + ���� Ŭ�������� protected ȣ��"+m_pro); // o
		System.out.println("�ٸ� ��Ű�� + ���� Ŭ�������� public ȣ��"+m_pub); // o
		System.out.println("-----------------");
		
	// ��Ű���� �޶����� default���� �� ����.	
		
	}
	

}
