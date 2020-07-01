package runJava.ch14.thisisjava_12;

//****** WorkThread, ThreadGroupExample ****///////// 
// 그룹 짓는 방법
// 1.ThreadGroup 클래스의 객체를 생성하고 생성에서 String 이름을 준다.
// 2. Thread 생성자에 ThreadGroup을 넘겨준다. new Thread(ThreadGroup tg, String name)
// 3. ThreadGroup의 객체에 interrupt를 호출하면 그룹의 모든 쓰레드가 종료된다.



public class ThreadGroupExample {
	
	public static void main(String[] args) {
		
		ThreadGroup tg = new ThreadGroup("myGroup");
		
		WorkThread workThreadA = new WorkThread(tg, "workThreadA");
		WorkThread workThreadB = new WorkThread(tg, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		// 그룹 리스트를 뽑는 방법.
		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
		
		threadGroup.list();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" ");
		System.out.println("myGroup 쓰레드 그룹 멈춤");
		tg.interrupt();
		
		
		
	}

}
