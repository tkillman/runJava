package runJava.ch14.thisisjava_12;

//***ProducerThread,ConsumerThread,DataBox,WaitNotifyExample2******////////
//wait() 자신의 쓰레드를 일시대기 상태로 만든다. notify() 일시대기 상태인 쓰레드를 실행대기 상태로 만든다.


public class WaitNotifyExample2 {
	
	public static void main(String[] args) {
		
		DataBox db= new DataBox();
		ProducerThread pt = new ProducerThread(db);
		ConsumerThread ct = new ConsumerThread(db);
		pt.start();
		ct.start();
		
		
	}

}
