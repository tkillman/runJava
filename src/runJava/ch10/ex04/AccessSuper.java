package runJava.ch10.ex04;

//****************** ���� �������� ���**********************

// ���� Ŭ����, ���� ��Ű�� ��
public class AccessSuper {

	private int m_pri=10;
	int m_def=20;
	protected int m_pro=30;
	public int m_pub=40;
	
	
	
	public void showAccessSuper(){
		
		System.out.println("Ŭ���� AccessSuper�� show �޼ҵ�");
		System.out.println("���� ��Ű��,���� Ŭ���� ������ private ȣ�� :" +m_pri); 
		System.out.println("���� ��Ű��,���� Ŭ���� ������ default ȣ�� :"+m_def);
		System.out.println("���� ��Ű��,���� Ŭ���� ������ protected ȣ�� :"+m_pro);
		System.out.println("���� ��Ű��,���� Ŭ���� ������ public ȣ�� :"+m_pub);
		System.out.println("-----------------");
		
	}
}
