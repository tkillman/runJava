package runJava.ch14.thisisjava_12;

//***ProducerThread,ConsumerThread,DataBox,WaitNotifyExample2******////////
//wait() �ڽ��� �����带 �Ͻô�� ���·� �����. notify() �Ͻô�� ������ �����带 ������ ���·� �����.


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
