package runJava.ch14.kame.ch14.ex01;

//****** 쓰레드 생성 방법*******////
/*1.Thread 클래스를 상속받는다.
2.run 메소드를 오버라이딩 해서 스레드 객체가 어떤 작업을 할지 기술한다.
3.main메소드에서 쓰레드를 상속받은 클래스의 객체를 생성한다.
4. 3단계에서 생성한 객체로 start 메소드를 호출한다.

*/

//********************** 단일 쓰레드 동작**********************////

/*NoThreadExam01 클래스는 쓰레드 클래스를 상속받지 않았다. 
   * 일반적인 객체를 생성하여 run 메소드를 직접 실행시키면 
   run 메소드가 종료 된 후 메인 메소드가 동작한다.
  	이걸 단일 스레드로 동작한다고 한다.
*/

class NoThreadExam01 {

	public void run() {
		int a = 0;
		System.out.println(">>run 메소드 진입<<");
		while (true) {

			for (int k = 1; k < 100000000; k++)
				; // 일정 시간을 요하는 작업
			System.out.println("NoThreadExam01의 a :" + ++a);
			if (a >= 5)
				break;

		}
		System.out.println(">>run 메소드 종료<<");

	}

}

public class Ch14Ex01 {

	public static void main(String[] args) {

		System.out.println(">>---main 스레드 동작 시작---<<");
		
		NoThreadExam01 t1 = new NoThreadExam01();
		t1.run();

		int b = 0;
		while (true) {
			for (int k = 1; k < 1000000; k++)
				; // 일정 시간을 요하는 작업
			System.out.println("main 의 b:" + ++b);
			if (b >= 5)
				break;

		}
		System.out.println(">>---메인 스레드 동작 종료---<<");

	}

}
