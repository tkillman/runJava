package runJava.ch14.kame.ch14.ex01;

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


class RunableExam01 implements Runnable {
	//1. Runnable 인터페이스를 구현한 RunableExam01 클래스를 작성
	
	@Override // 2. run 메소드를 오버라이딩한다. 스레드 객체가 어떤 작업을 할 지 기술.
	public void run() {
		int a=0;
		System.out.println(">>run 메소드 진입 <<");
		while(true){
			
		try {
			Thread.sleep(300);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}	
			
	System.out.println(Thread.currentThread().getName() +":" + ++a);	//현제 실행중인 쓰레드 이름 얻는 메소드
	
	if(a >=5)	
	break;
	
		}
	System.out.println(">>run 메소드 종료<<");
	}
}

	public class Ch14Ex04 {
		
		public static void main(String[] args) { //3.메인 메소드에서 Runnable 인터페이스를 구현한 RunableEx01클래스 의 객체 생성
			System.out.println(">>메인 메소드 진입<<");
			RunableExam01 r1=new RunableExam01();
			RunableExam01 r2=new RunableExam01();
			RunableExam01 r3=new RunableExam01();
			
			Thread t1= new Thread(r1, "첫번째 스레드"); //4.Thread 객체를 생성하는데 생성자의 전달인자로 3에서 생성한 객체를 준다.
			Thread t2= new Thread(r1, "두번째 스레드"); // Thread의 생성자 종류 중 4번째
			Thread t3= new Thread(r1, "세번째 스레드");
			
			t1.start(); // 4에서 생성한 객체로 start 메소드를 호출
			t2.start();
			t3.start();
			System.out.println(">>메인 메소드 종료<<");
		}
		
	}
