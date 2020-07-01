package runJava.ch14.thisisjava_12;

//****** WorkThread, ThreadGroupExample ****///////// 
// �׷� ���� ���
// 1.ThreadGroup Ŭ������ ��ü�� �����ϰ� �������� String �̸��� �ش�.
// 2. Thread �����ڿ� ThreadGroup�� �Ѱ��ش�. new Thread(ThreadGroup tg, String name)
// 3. ThreadGroup�� ��ü�� interrupt�� ȣ���ϸ� �׷��� ��� �����尡 ����ȴ�.



public class ThreadGroupExample {
	
	public static void main(String[] args) {
		
		ThreadGroup tg = new ThreadGroup("myGroup");
		
		WorkThread workThreadA = new WorkThread(tg, "workThreadA");
		WorkThread workThreadB = new WorkThread(tg, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		// �׷� ����Ʈ�� �̴� ���.
		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
		
		threadGroup.list();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" ");
		System.out.println("myGroup ������ �׷� ����");
		tg.interrupt();
		
		
		
	}

}
