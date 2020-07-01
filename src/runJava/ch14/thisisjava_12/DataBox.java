package runJava.ch14.thisisjava_12;


//***ProducerThread,ConsumerThread,DataBox,WaitNotifyExample2******////////
//wait() 자신의 쓰레드를 일시대기 상태로 만든다. notify() 일시대기 상태인 쓰레드를 실행대기 상태로 만든다.

public class DataBox {

	String data;

	public synchronized String getData() {
//wait과 notify를 쓰기 위해서는 synchronized (동기화 )된 메소드를 써야한다.
		if (data == null) {
			

			try {
				wait(); // 데이터가 없다면 ConsumerThread를 일시정지상태로 만든다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String resultValue = data;
		data =null;
		notify(); // data가 null이 됐으므로 ProducerThread를 실행대기 상태로 만든다.
		System.out.println("Consumer가 읽은 데이터 : "+ resultValue);
		return resultValue;

	}

	public synchronized void setData(String data) {

		if (this.data != null) {
		
			try {
				wait();// 데이터가 아직 있으므로 ProducerThread를 대기상태로
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		this.data = data; //데이터가 없다면 데이터를 세팅한다.
		System.out.println("Producer가 생성한 데이터 : " +data);
		notify(); // 데이터를 세팅했으므로 ConsumerThread를 실행대기상태로 만든다.
	}

}
