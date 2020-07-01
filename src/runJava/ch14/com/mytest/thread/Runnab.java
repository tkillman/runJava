package runJava.ch14.com.mytest.thread;

public class Runnab {

	public static void main(String[] args) {
		
		
		
		System.out.println(">>>>>>>메인 메소드 시작<<<<<<<<<<<");
			Runn ru = new Runn();
			
			Thread t1= new Thread(ru,"ru"); // Thread t1 래퍼런스 변수가 Thread에 인자값으로 ru를 갖는 생성자를 참조
			t1.start();
		
			
		Thread t2=Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
			
		
			int a=0;
			while(true){
				for(int i=0;i<10000;i++);
				System.out.println("main 메소드의 a:" + a++ );
				if(a>5){break;}
			}
			
		System.out.println(">>>>메인 메소드 종료<<<<<<<<");	
	}
	
}

class Runn implements Runnable{
	
	public void run(){
		
		System.out.println(">>>>>run 메소드의 시작<<<<<<<<");
		
		int a=0;
		while(true){
			for(int i=0;i<10000;i++);
			System.out.println("run 메소드의 a:" + a++ );
			if(a>5){break;}
		}
	
		System.out.println(">>>>run 메소드 종료<<<<<<");
	}
	
	
}