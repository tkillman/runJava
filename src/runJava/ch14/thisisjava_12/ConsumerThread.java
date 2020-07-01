package runJava.ch14.thisisjava_12;

//***ProducerThread,ConsumerThread,DataBox,WaitNotifyExample2******////////
// wait() 자신의 쓰레드를 일시대기 상태로 만든다. notify() 일시대기 상태인 쓰레드를 실행대기 상태로 만든다.



//3번 데이터를 가져온다.
public class ConsumerThread extends Thread {
	DataBox db;

	public ConsumerThread(DataBox db) {
		this.db = db; //ProducerThread와 같은 객체인 db를 공유

	}// 생성자

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {

			String data = db.getData();

		}

	}

}
