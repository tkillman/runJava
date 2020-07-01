package runJava.ch14.thisisjava_12;


/////***** ThreadA,ThreadB,WorkObject,WaitNotifyExample 사용***********
//1.notify()란? 일시정지중인 다른 쓰레드를 실행 대기 생태로 만든다.
//2.wait()란? 자신의 쓰레드를 일시 정지 상태로 만든다. 다른 쓰레드가 notify로 풀어줘야 실행대기 상태가 된다.
//3.사용 방법
//동기화 된 메소드나 블럭에서 사용 가능하다.
//4. 사용 예제
//어떤 생산자가 일을 수행 한 다음 그 값을 저장 한 후에 소비자가 그 값을 사용하고
//그 다음 생산자가 다시 일을 수행하도록 만들어주고 싶을 때



public class ThreadA extends Thread{
	WorkObject wo;
	
	public ThreadA(WorkObject wo) {
		this.wo =wo;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++){
		wo.methodA();}
		
	}
	
	
}
