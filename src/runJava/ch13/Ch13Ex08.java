package runJava.ch13;

//************ ���� ó�� �̷��  *************
//************ throws ***************
// throw : ����ڰ� ���ܸ� �߻� ��Ŵ ,    
//			throw new ����_Ŭ��();
// throws : �߻��� ���ܸ� ȣ���� ��ü�� ó���� �̷��.
//			public void �޼����̸�(�Ű�����) throws Exception{}

public class Ch13Ex08 {

	public static void throwException() throws Exception{ // ���� �߻� ������ �������� ó���� ���� �ʰ� throws�� ���� ���� �޼ҵ�� �Ѱܹ���
		
		System.out.println(">>throwException �Լ� ȣ��<<");
		
		throw new Exception("����ڰ� ���ܸ� �߻���Ŵ"); //���� �߻� ����
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println(">>main �Լ����� ���ܸ� �߻���Ű�� �Լ�(throwException()) ȣ��<<");
			throwException();
		//���� �߻� �޼ҵ带 ȣ���� ������ ���ܸ� ó���ϰ��ִ�.	
			
		} catch (Exception e) {
			
			System.out.println(">>catch ���� : ���ܸ� ó���Ѵ�. <<");
			System.out.println(e);
			
		}
		System.out.println(">>��������<<");		
	}

}
