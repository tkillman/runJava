package runJava.ch14.com.mytest.thread;

public class SingleTh {
	
	public static void main(String[] args) {
		System.out.println(">>���θ޼ҵ� ������<<");
		TestThreadgo tg= new TestThreadgo();
		tg.run();
		int a=0;
		while(true){
			for(int i=0;i<1000000;i++);
				System.out.println("main�� ��" + a++);
				if(a>100)
					{break;}
			
			}
				System.out.println(">>>>>���� �޼ҵ� ����<<<<<<");
	} // ���� �޼ҵ� ����
}


class TestThreadgo{
	
public void run(){
	
	int a=0;
	System.out.println(">>run �޼ҵ� ������<<");
		
		while(true){
			for(int i=0;i<1000000;i++);
				System.out.println("run�� ��" + a++);
				if(a>100)
					{break;}
			
			}
	
		System.out.println(">>>>run �޼ҵ� ����<<<<<<");
	} //run �޼ҵ� ����
	

}
	