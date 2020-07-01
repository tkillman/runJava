package runJava.ch14.kame.ch14.ex01;

//*******멀티 쓰레드를 만드는 3가지 방법******************//
//1. Thread를 상속받아서 run 메소드 재정의 후 쓰레드의 객체 생성 후 start 메소드 호출
//2. runnable을 implements 한 다음 run 메소드 재 정의 후 쓰레드 객체의 인자값으로 넣은 뒤 쓰레드의 start 메소드 호출
//3. 람다식을 이용

//************ 다중 상속이 가능한 Runnable 인터페이스 *************///////
// 1.runnable을 implements
// 2. run 메소드 오버라이딩
// 3. runnable을 implements 한 클래스의 객체 생성
// 4. Thread의 객체를 생성하는데 3에서 생성한 객체를 Thread 생성자의 인자로 전달
// 5. 생성한 Thread 객체로 start() 메소드 호출
// public Thread() -- 스레드 생성
// public Thread(String name) -- name을 이름으로 갖는 새로운 스레드 생성
// public Thread(Runnable r1) -- runnable 인터페이스의 run을 호출하는 스레드 생성
// public Thread(Runnable r1,String name) -- runnable 인터페이스의 run을 호출하고 name을 이름으로 갖는 스레드 생성


/////************** 람다식을 이용한 정의***************//////////////////
public class Ch14Ex04_1 {

	public static void main(String[] args) { // 3.메인 메소드에서 Runnable 인터페이스를 구현한
		int k=0;										// RunableEx01클래스 의 객체 생성
		System.out.println(">>메인 메소드 진입<<");
		
		
		
		Thread t1 = new Thread(() -> { // runnable에는 매개변수가 없는 run메소드 하나이기 때문에 ()표현가능
			
			int a = 0;
			System.out.println(">>run 메소드 진입 <<");
			while (true) {

				try {
					Thread.sleep(300);

				} catch (InterruptedException e) {
					e.printStackTrace();

				}

				System.out.println(Thread.currentThread().getName() + ":" + ++a); // 현제
																					// 실행중인
																					// 쓰레드
																					// 이름
																					// 얻는
																					// 메소드

				if (a >= 5)
					break;

			}
			System.out.println(">>run 메소드 종료<<");

		},"hello"); // 4.Thread 객체를 생성하는데 생성자의 전달인자로 3에서 생성한 객체를 준다.
		
		t1.start(); // 4에서 생성한 객체로 start 메소드를 호출
		
		//메인 메소드
		for(int i=0;i<5;i++){
			k++;
			Thread t= Thread.currentThread();
			System.out.println(t.getName()+"메소드 : " +k);
		}
		
		
		System.out.println(">>메인 메소드 종료<<");
	}

}
