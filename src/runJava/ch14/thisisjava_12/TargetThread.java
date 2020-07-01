package runJava.ch14.thisisjava_12;


//*******StateMain ,StateThread,TargetThread 사용방법*****
////쓰레드의 상태를 확인하는 방법.

public class TargetThread extends Thread {

	@Override
	public void run() {
		
		for (long i = 0; i < 1000000000; i++) {

		}

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (long i = 0; i < 1000000000; i++) {

		}

	}

}
