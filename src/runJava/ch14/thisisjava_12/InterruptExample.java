package runJava.ch14.thisisjava_12;

//****PrintThread2,InterruptExample**********
//���� interrupt() �޼ҵ�� �Ͻ����� ���¿� �ִ� �����忡 ���ܸ� �߻����Ѽ� ������Ű�µ�
//�����尡 �Ͻ����� ���°� ���ٸ� ��� �����带 ������ų��?
//boolean state = Thread.interrupt() ���� �޼ҵ� �Ǵ� isinterrupted() �� �̿��Ѵ�.
//Thread ���� �޼ҵ��� interrupt()�� interrupt �޼ҵ尡 ȣ��Ǹ� true�� ��ȯ�Ѵ�.
//�̸� run�޼ҵ忡�� �ݺ������� ����Ǵ� �ڵ� �ȿ� �־��ָ� �ݺ����� �������� �� �ִ�.


public class InterruptExample {

	public static void main(String[] args) {
		
		PrintThread2 pt2 = new PrintThread2();
		pt2.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pt2.interrupt();
	
		
	}
	
	
}
