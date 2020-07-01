package runJava.ch14.thisisjava_12;

//*******StateMain ,StateThread �����*****
//�������� ���¸� Ȯ���ϴ� ���.

public class StateThread extends Thread {

	TargetThread tt;

	public StateThread(TargetThread tt) {
		this.tt = tt;

	}

	@Override

	public void run() {
		while (true) {
			
			Thread.State state = tt.getState();

			System.out.println(state);
			
			if (state == State.NEW) {
			
				tt.start();

			}

			if (state == state.TERMINATED) {
				
				break;
			}

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
