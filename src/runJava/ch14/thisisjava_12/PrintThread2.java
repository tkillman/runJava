package runJava.ch14.thisisjava_12;

//****PrintThread2,InterruptExample**********
//���� interrupt() �޼ҵ�� �Ͻ����� ���¿� �ִ� �����忡 ���ܸ� �߻����Ѽ� ������Ű�µ�
//�����尡 �Ͻ����� ���°� ���ٸ� ��� �����带 ������ų��?
//boolean state = Thread.interrupt() ���� �޼ҵ� �Ǵ� isinterrupted() �� �̿��Ѵ�.
//Thread ���� �޼ҵ��� interrupt()�� interrupt �޼ҵ尡 ȣ��Ǹ� true�� ��ȯ�Ѵ�.
//�̸� run�޼ҵ忡�� �ݺ������� ����Ǵ� �ڵ� �ȿ� �־��ָ� �ݺ����� �������� �� �ִ�.



public class PrintThread2 extends Thread {

	@Override
	public void run() {

		while (true) {
			System.out.println("������");

			
			//��ü���� interrupted() �޼ҵ尡 ȣ��Ǹ� 
			//true�� ��ȯ�ϴ� Thread�� ���� �޼ҵ��̴�.
			if (Thread.interrupted()) {
				break;
			}

		}

	}

}
