package hanJangHee.day1115;

class SingleThreadEx extends Thread{
	
	private int[] temp;
	
	public SingleThreadEx(String threadname){
		super(threadname);
		temp = new int[10];
		for(int start = 0; start < temp.length; start++){
			temp[start] = start;
		}
	}
	
	public void run(){
		for(int start : temp){
			try{
				sleep(1000);
			} catch(InterruptedException ie){
				ie.printStackTrace();
			}
			System.out.printf("스레드 이름 : %s ," , currentThread().getName());
			System.out.printf("temp value : %d %n", start);
		}
	}

	public static void main(String[] args){
		SingleThreadEx st = new SingleThreadEx("첫번째");
		st.start();
		SingleThreadEx st1 = new SingleThreadEx("두번째");
		st1.start();
		SingleThreadEx st2 = new SingleThreadEx("세번째");
		st2.start();
	}
	
	
}
