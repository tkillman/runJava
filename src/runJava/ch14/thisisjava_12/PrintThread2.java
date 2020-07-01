package runJava.ch14.thisisjava_12;

//****PrintThread2,InterruptExample**********
//원래 interrupt() 메소드는 일시정지 상태에 있는 쓰레드에 예외를 발생시켜서 중지시키는데
//쓰레드가 일시정지 상태가 없다면 어떻게 쓰레드를 중지시킬까?
//boolean state = Thread.interrupt() 정적 메소드 또는 isinterrupted() 를 이용한다.
//Thread 정적 메소드인 interrupt()는 interrupt 메소드가 호출되면 true를 반환한다.
//이를 run메소드에서 반복적으로 실행되는 코드 안에 넣어주면 반복문을 빠져나올 수 있다.



public class PrintThread2 extends Thread {

	@Override
	public void run() {

		while (true) {
			System.out.println("실행중");

			
			//객체에서 interrupted() 메소드가 호출되면 
			//true를 반환하는 Thread의 정적 메소드이다.
			if (Thread.interrupted()) {
				break;
			}

		}

	}

}
