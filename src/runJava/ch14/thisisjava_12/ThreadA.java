package runJava.ch14.thisisjava_12;


/////***** ThreadA,ThreadB,WorkObject,WaitNotifyExample ���***********
//1.notify()��? �Ͻ��������� �ٸ� �����带 ���� ��� ���·� �����.
//2.wait()��? �ڽ��� �����带 �Ͻ� ���� ���·� �����. �ٸ� �����尡 notify�� Ǯ����� ������ ���°� �ȴ�.
//3.��� ���
//����ȭ �� �޼ҵ峪 ������ ��� �����ϴ�.
//4. ��� ����
//� �����ڰ� ���� ���� �� ���� �� ���� ���� �� �Ŀ� �Һ��ڰ� �� ���� ����ϰ�
//�� ���� �����ڰ� �ٽ� ���� �����ϵ��� ������ְ� ���� ��



public class ThreadA extends Thread{
	WorkObject wo;
	
	public ThreadA(WorkObject wo) {
		this.wo =wo;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++){
		wo.methodA();}
		
	}
	
	
}
