package runJava.ch14.thisisjava_12;

//***ProducerThread,ConsumerThread,DataBox,WaitNotifyExample2******////////
// wait() �ڽ��� �����带 �Ͻô�� ���·� �����. notify() �Ͻô�� ������ �����带 ������ ���·� �����.



//3�� �����͸� �����´�.
public class ConsumerThread extends Thread {
	DataBox db;

	public ConsumerThread(DataBox db) {
		this.db = db; //ProducerThread�� ���� ��ü�� db�� ����

	}// ������

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {

			String data = db.getData();

		}

	}

}
