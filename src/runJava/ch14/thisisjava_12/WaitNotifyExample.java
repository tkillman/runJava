package runJava.ch14.thisisjava_12;

/////***** ThreadA,ThreadB,WorkObject,WaitNotifyExample ���***********
// 1.notify()��? �Ͻ��������� �ٸ� �����带 ���� ��� ���·� �����.
// 2.wait()��? �ڽ��� �����带 �Ͻ� ���� ���·� �����. �ٸ� �����尡 notify�� Ǯ����� ������ ���°� �ȴ�.
// 3.��� ���
// ����ȭ �� �޼ҵ峪 ������ ��� �����ϴ�.
// 4. ��� ����
// � �����ڰ� ���� ���� �� ���� �� ���� ���� �� �Ŀ� �Һ��ڰ� �� ���� ����ϰ�
// �� ���� �����ڰ� �ٽ� ���� �����ϵ��� ������ְ� ���� ��



public class WaitNotifyExample {
	
	public static void main(String[] args) {
		
		WorkObject wo = new WorkObject();
		
		
		ThreadA ta = new ThreadA(wo);
		ThreadB tb = new ThreadB(wo);
		ta.start();
		tb.start();
		
	}

}
