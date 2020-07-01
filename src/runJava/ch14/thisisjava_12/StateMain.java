package runJava.ch14.thisisjava_12;

//*******StateMain ,StateThread,TargetThread 사용방법*****
////쓰레드의 상태를 확인하는 방법.

public class StateMain {

	public static void main(String[] args) {
		
		//TargetThread tt= new TargetThread();
	
		
		StateThread st = new StateThread(new TargetThread());
		st.start();
		
	}
	
}
