package runJava.ch14.com.mytest.thread;

public class SingleTh {
	
	public static void main(String[] args) {
		System.out.println(">>메인메소드 동작중<<");
		TestThreadgo tg= new TestThreadgo();
		tg.run();
		int a=0;
		while(true){
			for(int i=0;i<1000000;i++);
				System.out.println("main의 값" + a++);
				if(a>100)
					{break;}
			
			}
				System.out.println(">>>>>메인 메소드 종료<<<<<<");
	} // 메인 메소드 종료
}


class TestThreadgo{
	
public void run(){
	
	int a=0;
	System.out.println(">>run 메소드 진입중<<");
		
		while(true){
			for(int i=0;i<1000000;i++);
				System.out.println("run의 값" + a++);
				if(a>100)
					{break;}
			
			}
	
		System.out.println(">>>>run 메소드 종료<<<<<<");
	} //run 메소드 종료
	

}
	