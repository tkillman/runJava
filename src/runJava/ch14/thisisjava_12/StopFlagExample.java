package runJava.ch14.thisisjava_12;

//****PrintThread1 ,StopFlagExample ******
//�������� stop() �޼ҵ带 ������� �ʰ� ������Ű�� ���
//Thread�� ����� Ŭ������ boolean ������ ������ �ΰ� ���� ������ boolean ���¸� �־�д�.
//�����带 ���߰� ������ boolean ���¸� true�� �༭  ���ѷ����� �����Ų��.



public class StopFlagExample {
	
	public static void main(String[] args) {
		
		PrintThread1 pt1 = new PrintThread1();
		pt1.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pt1.setStop(true);
		
	}

}
