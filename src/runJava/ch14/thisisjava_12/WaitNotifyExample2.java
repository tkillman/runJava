package runJava.ch14.thisisjava_12;

//***ProducerThread,ConsumerThread,DataBox,WaitNotifyExample2******////////
//wait() �ڽ��� �����带 �Ͻô�� ���·� �����. notify() �Ͻô�� ������ �����带 ������ ���·� �����.


public class WaitNotifyExample2 {
	
	public static void main(String[] args) {
		
		DataBox db= new DataBox();
		ProducerThread pt = new ProducerThread(db);
		ConsumerThread ct = new ConsumerThread(db);
		pt.start();
		ct.start();
		
		
	}

}
