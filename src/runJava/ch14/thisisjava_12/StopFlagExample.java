package runJava.ch14.thisisjava_12;

//****PrintThread1 ,StopFlagExample ******
//쓰레드의 stop() 메소드를 사용하지 않고 정지시키는 방법
//Thread를 상속한 클래스에 boolean 형태의 변수를 두고 무한 루프에 boolean 형태를 넣어둔다.
//쓰레드를 멈추고 싶을때 boolean 형태를 true로 줘서  무한루프를 종료시킨다.



public class StopFlagExample {
	
	public static void main(String[] args) {
		
		PrintThread1 pt1 = new PrintThread1();
		pt1.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pt1.setStop(true);
		
	}

}
