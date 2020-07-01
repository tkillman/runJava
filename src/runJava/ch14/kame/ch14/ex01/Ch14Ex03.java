package runJava.ch14.kame.ch14.ex01;

//main 메소드도 thread의 한 종류이다.
// getName() 메소드, currentThread(); 메소드

//********* Thread 메소드들 사용해보기************
public class Ch14Ex03 {
	
	public static void main(String[] args) {
		
		//getName()이 인스턴스 메소드이기 때문에 객체를 만들어서 사용할 필요가 있어서
		// currentThread()를 통해서 현재 실행중인 쓰레드의 객체를 참조값을 얻어온다. 
		Thread t= Thread.currentThread();
		
		System.out.println("현재 수행중인 스레드:" + t.getName());
		
	}

}



