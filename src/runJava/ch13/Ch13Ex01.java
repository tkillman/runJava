package runJava.ch13;


//*************** ���� ó��******************

// �� ���� catch�������� ���ܰ� ó���Ǹ� ������ ���������� ������ �� ���ʿ� ��ü���� ���� ��Ȳ�� ������� ������ �� ����.

public class Ch13Ex01 {

	public static void main(String[] args) {

		
		try {
			String c= null;
			System.out.print(c.toString()); 
			// null�� ���ڿ��� �ٲ㼭 ����ض�.. ����
			
		} catch (NullPointerException e) {

			System.out.println("���ܰ� �߻��Ͽ� Exception ��ü�� ����");
			System.out.println(e);
		}
		System.out.println("��������");
	}

}
