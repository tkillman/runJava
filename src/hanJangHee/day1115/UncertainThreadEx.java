package hanJangHee.day1115;

class MyRunnableOne implements Runnable{
	public void run(){
		System.out.println("run");
		first();}
	public void first(){
		System.out.println("first");
		second();}
	public void second(){
		System.out.println("second");
	}
}

class UncertainThreadEx {
	public static void main(String[] args){
		System.out.println("main start");
		Runnable r = new MyRunnableOne();
		Thread myThread = new Thread(r);
		myThread.start();
		
		try{
			myThread.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("main end");
	}

}
