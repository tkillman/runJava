package runJava.ch14.thisisjava_12;


//*******StateMain ,StateThread,TargetThread �����*****
////�������� ���¸� Ȯ���ϴ� ���.

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
