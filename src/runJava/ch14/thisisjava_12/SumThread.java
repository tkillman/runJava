package runJava.ch14.thisisjava_12;

//*****SumThread,JoinExample***
//join을 쓰면 join을 호출한!!!!! 쓰레드가 대기상태가 된다.

public class SumThread extends Thread{

	int num;
	
	
	@Override
	public void run() {
		
		for(int i=0;i<=100;i++){
			num+=i;
		}
	
	}
	
}
