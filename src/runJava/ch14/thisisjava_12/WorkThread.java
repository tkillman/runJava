package runJava.ch14.thisisjava_12;

//****** WorkThread, ThreadGroupExample , 
// ������ �׷��� �����ؼ� �ѹ��� ���� ���..

public class WorkThread extends Thread{
	
	
	
	public WorkThread(ThreadGroup tg, String name) {
		
		
		super(tg,name); // �������� �׷�,�̸��� ����.
		
		
	}
	
	@Override
	public void run() {
		
		while(true){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
				System.out.println(getName() +"�� �����尡 ���� �߻�");
				System.out.println(getName() +" ������ ����");
			}
			
		}
		
		
	}
	
	
	

}
