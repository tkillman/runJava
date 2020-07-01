package runJava.ch14.com.mytest.thread;

public class MultiTh {
	
	
	public static void main(String[] args) {
		
		
		
		Thread t= Thread.currentThread();
		System.out.println(t.getName());
		
		System.out.println(">>>>메인 메소드 시작<<<<");
		MultiThgo tg= new MultiThgo();
		MultiThgo2 tg2 = new MultiThgo2();
		
		
		/*Thread tg_1= new Thread(tg, "hello");
		tg_1.start();*/ //스레드에 hello 이름 주기
		
		
		tg.start();
		tg2.start();
		
		int a=0;
		while(true){
			for(int i=0;i<1000000;i++);
				System.out.println("main의 값" + a++);
				if(a>3)
					{break;}
			
			}
		
	System.out.println(">>>>메인 메소드의 종료<<<<<<<<<<");	
	}
	
	

}

class MultiThgo extends Thread{
	
	
	public void run(){
		
		
		Thread t= Thread.currentThread();
		t.setName("MultiThgo"); //thread 에 이름주기
		System.out.println(t.getName());
		
		
		System.out.println(">>>>run 메소드 시작<<<<<<<<<");
		
		int a=0;
		while(true){
			for(int i=0;i<1000000;i++);
				System.out.println("run의 값" + a++);
				if(a>3)
					{break;}
			
			}
		System.out.println(">>>>run 메소드 종료<<<<<<<<");
	}
	
}

class MultiThgo2 extends Thread{
	
	public void run(){
		
		Thread t= Thread.currentThread();
		t.setName("Multithgo2");
		System.out.println(t.getName());
		
		
		System.out.println(">>>>run2 메소드 시작<<<<<<<<<");
		
		int a=0;
		while(true){
			for(int i=0;i<1000000;i++);
				System.out.println("run2의 값" + a++);
				if(a>3)
					{break;}
			
			}
		System.out.println(">>>>run2 메소드 종료<<<<<<<<");
	}
	
}