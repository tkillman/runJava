package runJava.ch13;

public class Ch13Ex1_1 {

	public static void main(String[] args) {

		
		try {
			String c= null;
			System.out.print(c.toString()); 
			// null�� ���ڿ��� �ٲ㼭 ����ض�.. ����
			
		} catch (NullPointerException e) {

			System.out.println("���ܰ� �߻��Ͽ� Exception ��ü�� ����");
			System.out.println(e);
		} catch(Exception e){ 
			// ���� ���� catch���� �������� ������ �ٲ��ִٸ� ������ ���� �߻�!! ��??
		//���� Ŭ������ �� ��ü���� ������ �����ϰ� �ֱ� ������ ���� Ŭ������ ���� ó���� ���� ������־�� �Ѵ�.
		//���� ���� Ŭ������ ����ó���� �� �տ� ����Ѵٸ� �Ʒ��� catch���� ��������� ���Ѵ�.	
			
			
			System.out.println(e);
			
		}//catch ����
		
		
		System.out.println("��������");
	} // try ����

}
