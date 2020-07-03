package hanJangHee.day1115;

import java.awt.Toolkit;

class BeepPrintExample1 {
	
	public static void main(String[] args){
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i <5 ; i++){
			toolkit.beep();
			try{Thread.sleep(500);} catch(Exception e){}
		}
		
		for(int i = 0; i < 5 ; i++){
			System.out.println("¶ò");
			try{Thread.sleep(500);} catch(Exception e){}
		}
	}

}

class BeepTask implements Runnable{
	public void run(){
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i <5; i++){
			toolkit.beep();
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}

