package runJava.ch14.thisisjava_12;

//*******StateMain ,StateThread,TargetThread �����*****
////�������� ���¸� Ȯ���ϴ� ���.

public class StateMain {

	public static void main(String[] args) {
		
		//TargetThread tt= new TargetThread();
	
		
		StateThread st = new StateThread(new TargetThread());
		st.start();
		
	}
	
}
