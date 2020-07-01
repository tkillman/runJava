package runJava.ch14.com.mytest.thread;

public class Yiel extends Thread {
	
	int result;
	
	public Yiel(String name){
		super(name);
		result=0;
		start();
		
	}
	
	public void run(){
		for(int i=0;i<100;i++){
			result = i;
			System.out.println(getName() +"result :" + result);
			
		}
		
	}
	
	public static void main(String[] args) {
		Yiel y1= new Yiel("first Thread");
		/*y1.yield();*/
		
		Yiel y2= new Yiel("Second Thread");
		/*y2.yield();*/
		
		Yiel y3= new Yiel("Third Thread");
		/*y3.yield();*/
	}
	
}
