package runJava.ch14.thisisjava_12;


////******* AutoSaveThread, DaemonExample ****////
//setDaemon 메소드 실행 시 그 메소드를 부른 쓰레드에 속해져서 그 쓰레드가 꺼질경우 다른 쓰레드도 같이 꺼진다.


/// ********* ThreadInfoExample , AutoSaveThread *******************
//Thread의 그룹 상태를 보는 방법.


public class AutoSaveThread extends Thread{
	
	
	public void save(){
		System.out.println("작업 내용을 저장함.");
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
