package runJava.ch14.thisisjava_12;

//****PrintThread1 ,StopFlagExample ******

//�������� stop() �޼ҵ带 ������� �ʰ� ������Ű�� ���
// Thread�� ����� Ŭ������ boolean ������ ������ �ΰ� ���� ������ boolean ���¸� �־�д�.
// �����带 ���߰� ������ boolean ���¸� true�� �༭  ���ѷ����� �����Ų��.


public class PrintThread1 extends Thread{
	private boolean stop ;
	
	public void setStop(boolean stop){
		this.stop=stop;
	}
	
	
	@Override
	public void run() {
		
		while(!stop){
			
			System.out.println("hello");
			
		}
		
	}
	

}
