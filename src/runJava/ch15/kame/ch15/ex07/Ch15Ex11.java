package runJava.ch15.kame.ch15.ex07;


//**************StringBuffer Ŭ������ �پ��� �޼ҵ�� ************
// ********* Ư¡  : StringBuffer�� ��ü ���� ��ȭ�Ѵ�.
public class Ch15Ex11 {
	
	public static void main(String[] args) {
		StringBuffer str= new StringBuffer();
		int len = str.length(); // ���ڼ��� �˷��ش�.
		int size = str.capacity(); // �޸� ũ�⸦ �˷��ش�.
		
		System.out.println(str+"/"+len+"/"+size);
		
		
		str.append("�������� ����ϱ� ���ؼ�"); // ���ڿ� �߰�
		len = str.length();
		size= str.capacity();
		System.out.println(str+"/"+len+"/"+size);
		
		
		str.append("�� ������ ������ �����̾�� �ߴ�.");
		len = str.length();
		size= str.capacity();
		System.out.println(str+"/"+len+"/"+size);
	}
	

}
