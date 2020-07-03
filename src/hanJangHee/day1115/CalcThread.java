package hanJangHee.day1115;

class CalcThread extends Thread {
	
	public CalcThread(String name){
		super();
		setName(name);
	}
	
	public void run(){
		for(int i = 0; i <2000000000 ; i++){
		}
		System.out.println(getName());
		
	}

}
