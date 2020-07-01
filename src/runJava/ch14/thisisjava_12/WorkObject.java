package runJava.ch14.thisisjava_12;

/////***** ThreadA,ThreadB,WorkObject,WaitNotifyExample ���***********
//1.notify()��? �Ͻ��������� �ٸ� �����带 ���� ��� ���·� �����.
//2.wait()��? �ڽ��� �����带 �Ͻ� ���� ���·� �����. �ٸ� �����尡 notify�� Ǯ����� ������ ���°� �ȴ�.
//3.��� ���
//����ȭ �� �޼ҵ峪 ������ ��� �����ϴ�.
//4. ��� ����
//� �����ڰ� ���� ���� �� ���� �� ���� ���� �� �Ŀ� �Һ��ڰ� �� ���� ����ϰ�
//�� ���� �����ڰ� �ٽ� ���� �����ϵ��� ������ְ� ���� ��


public class WorkObject {
	
	synchronized void methodA(){
		System.out.println("�޼ҵ� A�� �����.");
		notify();
		
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	synchronized void methodB(){
		System.out.println("�޼ҵ� B�� �����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
