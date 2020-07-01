package runJava.ch14.kame.ch14.ex01;


//**********동기화를 사용해 다중 스레드의 문제를 해결하는 클래스들***********//
//****************synchronized***********************/
// *** 문제가 되는 입 출금시 해당 메소드를 실행 할 때는 다른 Thread 가 접근하지 못하도록 막는다. synchronized를 붙임.

class SyncAtm{
	private int money; //잔액
	public SyncAtm(int m){ // 생성자
	money =m;	 // 계좌 개설시 입금한 금액
		
	}
	
	synchronized void deposit(int amount, String name){ // 입금
		money  += amount;
		System.out.println(name +":입금금액:"+ amount);
		
	}
	
	synchronized void withdraw(int amount,String name){ // 출금
		if((money -amount)>0){ // 출금 가능하면
			//다른 스레드가 동작하도록 양보를 하는 메소드 yield를 호출하여
			//잔액에 문제가 생기도록 유도한다.
			
			Thread.yield();
			
			money-=amount;
			System.out.println(name +":출금금액:"+ amount);
		}
		
		else {
			System.out.println(name +":출금 불가능(잔액부족)");
		}
	}
	
	public void getmoney(){
		
		System.out.println("계좌 잔액은:" +money);
	}
	
}

 class SyncAtmUser extends Thread{ //Atm 사용자
	 boolean flag=false;
	 SyncAtm obj;
	
	 public SyncAtmUser(SyncAtm obj,String name){
		 super(name);
		 this.obj=obj;
		 
	 }
	 
	 
	 public void run(){
		 for(int i=0; i<2; i++){
			 
			 try {
				 sleep(500);
				 
			} catch (InterruptedException e) {}
			 
		if(flag){
			obj.deposit((int)(Math.random()*10+2)*100, getName()); 
			obj.getmoney();
		
		} else {
			obj.withdraw((int)(Math.random()*10+2)*100, getName());
		}	 
			 flag = !flag;
		 }
	 }
 }


public class Ch14Ex07 {

	public static void main(String[] args) {
		
		SyncAtm obj = new SyncAtm(1000);
		SyncAtmUser user1 = new SyncAtmUser(obj, "한석희");
		SyncAtmUser user2 = new SyncAtmUser(obj, "유명화");
		SyncAtmUser user3 = new SyncAtmUser(obj, "이복정");
		
		
		user1.start();
		user2.start();
		user3.start();
	
	}

}
