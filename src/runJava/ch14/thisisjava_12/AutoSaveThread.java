package runJava.ch14.thisisjava_12;


////******* AutoSaveThread, DaemonExample ****////
//setDaemon �޼ҵ� ���� �� �� �޼ҵ带 �θ� �����忡 �������� �� �����尡 ������� �ٸ� �����嵵 ���� ������.


/// ********* ThreadInfoExample , AutoSaveThread *******************
//Thread�� �׷� ���¸� ���� ���.


public class AutoSaveThread extends Thread{
	
	
	public void save(){
		System.out.println("�۾� ������ ������.");
	}
	
	@Override
	public void run() {
		
		while(true){
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			save();
		}
		
		
	}
	

}
