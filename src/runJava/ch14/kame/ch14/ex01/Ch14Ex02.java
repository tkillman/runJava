package runJava.ch14.kame.ch14.ex01;

//****************** 다중 스레드*****************////////

/*Ch14Ex01과는 다르게 ThreadExam01은 Thread 클래스를 상속받았고
run 메소드를 오버라이딩 했다. 또한 메인 메소드에서 run 메소드를 실행시키기 위해
start 메소드를 호출시키는 것을 볼 수 있었다.

이렇게 Thread 클래스를 상속받은 후 실행시키면 run 메소드가 진행중에 
main 메소드도 같이 동작하는 것을 지켜볼 수 있다.
이를 다중 쓰레드라고 한다.
*/

class ThreadExam01 extends Thread {

	public void run() {

		int a = 0;
		System.out.println(">>run 메소드 진입<<");
		while (true) {

			for (int k = 1; k < 100; k++)
				; // 일정 시간을 요하는 작업
			System.out.println("ThreadExam01의 a :" + ++a);
			if (a >= 10)
				break;

		}

		System.out.println(">>run 메소드 종료<<");

	}

}

public class Ch14Ex02 {

	public static void main(String[] args) {

		System.out.println(">>---main 스레드 동작 시작---<<");
		ThreadExam01 t1 = new ThreadExam01();
		System.out.println(">>또다른 스레드를 동작시킴<<");
		t1.start();///// *******************************************////

		int b = 0;
		while (true) {
			for (int k = 1; k < 100; k++)
				; // 일정 시간을 요하는 작업
			System.out.println("main 의 b:" + ++b);
			if (b >= 10)
				break;

		}
		System.out.println(">>---메인 스레드 동작 종료---<<");

	}

}
