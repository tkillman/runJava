package runJava.ch13;


///********************* finally ��� ����********************////
public class Ch13Ex05 {

	public static void main(String[] args) {

		
		try {
			
			System.out.println(">>try ���� : ���ܸ� ����<<");
			String c= null;
		//	System.out.print(c.toString()); 
			// null�� ���ڿ��� �ٲ㼭 ����ض�.. ����
			
		} catch (NullPointerException e) {

			System.out.println("���ܰ� �߻��Ͽ� Exception ��ü�� ����");
			System.out.println(e);
		
		} finally{
			System.out.println(">>finally ����<<");
			System.out.println("try/catch ������ ���� ������ �Ѵ�. <<");
			System.out.println("���ܿ� ������� �ݵ�� �����Ѵ�.");
			
			
		}
		
		System.out.println("��������");
	}

}
