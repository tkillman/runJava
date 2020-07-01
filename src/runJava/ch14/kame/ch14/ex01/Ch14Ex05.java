package runJava.ch14.kame.ch14.ex01;

//************ Thread의 우선권**************

// setPriority() 메소드

public class Ch14Ex05 {
	
	// 다중 스레드에서 우선권을 주는 방법
	public static void main(String[] args) {
		
		RunableExam01 r1=new RunableExam01();
		RunableExam01 r2=new RunableExam01();
		RunableExam01 r3=new RunableExam01();
		Thread t1= new Thread(r1, "첫번째 스레드");
		Thread t2= new Thread(r1, "두번째 스레드");
		Thread t3= new Thread(r1, "세번째 스레드");
		t2.setPriority(Thread.MAX_PRIORITY); // *****************두 번째 스레드가 가장 먼저 실행된다.**************형식 보기
						//Thread.MIN_PRIORITY
						//Thread.NORM_PRIORITY
		t1.start();
		t2.start();
		t3.start();
		
	}
	

}
