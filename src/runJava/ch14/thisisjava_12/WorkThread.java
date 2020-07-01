package runJava.ch14.thisisjava_12;

//****** WorkThread, ThreadGroupExample , 
// 스레드 그룹을 지정해서 한번에 끄는 방법..

public class WorkThread extends Thread{
	
	
	
	public WorkThread(ThreadGroup tg, String name) {
		
		
		super(tg,name); // 쓰레드의 그룹,이름을 지정.
		
		
	}
	
	@Override
	public void run() {
		
		while(true){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
				System.out.println(getName() +"이 쓰레드가 예외 발생");
				System.out.println(getName() +" 쓰레드 종료");
			}
			
		}
		
		
	}
	
	
	

}
