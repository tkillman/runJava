package runJava.ch14.thisisjava_12;

//***ProducerThread,ConsumerThread,DataBox,WaitNotifyExample2******////////
//wait() 자신의 쓰레드를 일시대기 상태로 만든다. notify() 일시대기 상태인 쓰레드를 실행대기 상태로 만든다.


public class ProducerThread extends Thread {
	DataBox db;

	public ProducerThread(DataBox db) {
		this.db = db;

	}

	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {

			String data = "data- " + i;
			
			db.setData(data);
		}

	}

}
