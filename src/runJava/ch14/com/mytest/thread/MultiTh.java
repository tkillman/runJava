package runJava.ch14.com.mytest.thread;

public class MultiTh {
	
	
	public static void main(String[] args) {
		
		
		
		Thread t= Thread.currentThread();
		System.out.println(t.getName());
		
		System.out.println(">>>>���� �޼ҵ� ����<<<<");
		MultiThgo tg= new MultiThgo();
		MultiThgo2 tg2 = new MultiThgo2();
		
		
		/*Thread tg_1= new Thread(tg, "hello");
		tg_1.start();*/ //�����忡 hello �̸� �ֱ�
		
		
		tg.start();
		tg2.start();
		
		int a=0;
		while(true){
			for(int i=0;i<1000000;i++);
				System.out.println("main�� ��" + a++);
				if(a>3)
					{break;}
			
			}
		
	System.out.println(">>>>���� �޼ҵ��� ����<<<<<<<<<<");	
	}
	
	

}

class MultiThgo extends Thread{
	
	
	public void run(){
		
		
		Thread t= Thread.currentThread();
		t.setName("MultiThgo"); //thread �� �̸��ֱ�
		System.out.println(t.getName());
		
		
		System.out.println(">>>>run �޼ҵ� ����<<<<<<<<<");
		
		int a=0;
		while(true){
			for(int i=0;i<1000000;i++);
				System.out.println("run�� ��" + a++);
				if(a>3)
					{break;}
			
			}
		System.out.println(">>>>run �޼ҵ� ����<<<<<<<<");
	}
	
}

class MultiThgo2 extends Thread{
	
	public void run(){
		
		Thread t= Thread.currentThread();
		t.setName("Multithgo2");
		System.out.println(t.getName());
		
		
		System.out.println(">>>>run2 �޼ҵ� ����<<<<<<<<<");
		
		int a=0;
		while(true){
			for(int i=0;i<1000000;i++);
				System.out.println("run2�� ��" + a++);
				if(a>3)
					{break;}
			
			}
		System.out.println(">>>>run2 �޼ҵ� ����<<<<<<<<");
	}
	
}