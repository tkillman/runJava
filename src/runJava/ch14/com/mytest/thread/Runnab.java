package runJava.ch14.com.mytest.thread;

public class Runnab {

	public static void main(String[] args) {
		
		
		
		System.out.println(">>>>>>>���� �޼ҵ� ����<<<<<<<<<<<");
			Runn ru = new Runn();
			
			Thread t1= new Thread(ru,"ru"); // Thread t1 ���۷��� ������ Thread�� ���ڰ����� ru�� ���� �����ڸ� ����
			t1.start();
		
			
		Thread t2=Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
			
		
			int a=0;
			while(true){
				for(int i=0;i<10000;i++);
				System.out.println("main �޼ҵ��� a:" + a++ );
				if(a>5){break;}
			}
			
		System.out.println(">>>>���� �޼ҵ� ����<<<<<<<<");	
	}
	
}

class Runn implements Runnable{
	
	public void run(){
		
		System.out.println(">>>>>run �޼ҵ��� ����<<<<<<<<");
		
		int a=0;
		while(true){
			for(int i=0;i<10000;i++);
			System.out.println("run �޼ҵ��� a:" + a++ );
			if(a>5){break;}
		}
	
		System.out.println(">>>>run �޼ҵ� ����<<<<<<");
	}
	
	
}