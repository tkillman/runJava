package runJava.ch14.thisisjava_12;

//*****SumThread,JoinExample***
//join�� ���� join�� ȣ����!!!!! �����尡 �����°� �ȴ�.

public class SumThread extends Thread{

	int num;
	
	
	@Override
	public void run() {
		
		for(int i=0;i<=100;i++){
			num+=i;
		}
	
	}
	
}
