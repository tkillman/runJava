package runJava.ch13;


// ******** ����ó��**********

public class Ch13Ex04 {

	
	public static void main(String[] args) {
		
		try {
			String c= null;
			System.out.println(c.toString());
			
		} catch (Exception e) {
			System.out.println("���� ó�� ����");
			System.out.println(">>e<<");
			System.out.println(e); // e.toString();�� ����
			System.out.println(">>e.toString()<<");
			System.out.println(e.toString()); // exception�� ǥ���϶�.
			System.out.println(">>>e.getMessage()<<<");
			System.out.println(e.getMessage()); //exception�� ���� �޼����� ����϶�.
			System.out.println(">>e.printStackTrace()<<");
			e.printStackTrace(); // e�� ���ܻ�Ȳ�� �ܰ躰�� ����ض�.
		}
		
	}
	
	
}
