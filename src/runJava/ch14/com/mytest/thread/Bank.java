package runJava.ch14.com.mytest.thread;

public class Bank {

	public static void main(String[] args) {
		
		
		Atm obj = new Atm(1000);
		AtmUser a1 = new AtmUser(obj, "김동규");
		AtmUser a2 = new AtmUser(obj, "최빛찬");
		AtmUser a3 = new AtmUser(obj, "김인철");
		a1.start();
		a2.start();
		a3.start();
	}
	
	
}


class Atm{
	private int money;
	
	public Atm(int m){ //money 는 잔액 , m은 입금금액
		money=m;
	}
	
	void deposit(int amount, String name){ // amount 입금액, name 입금자
			money= money+amount;
			System.out.println(name+":입금금액:"+amount);
						
	}
	
	void withdraw(int amount, String name){ //amount 출금액, name 출금자
		
		if(money >amount){ // 출금가능
		
		Thread.yield();
		money -=amount;
		
		System.out.println(name+"---출금금액:"+amount);
		
		} else{
			
			System.out.println(name +"출금못함");
		}
	
	}
	
	public void getMoney(){
		
		System.out.println("계좌 잔액은" +money);
	}
	
}

class AtmUser extends Thread{
	
	boolean flag= false;
	Atm obj;
	
	public AtmUser(Atm obj,String name){
		super(name);
		this.obj = obj;	
	}

	@Override
	public void run() {
		
		try { 	
		
		for(int i=0; i<5; i++){
			
			Thread.sleep(500);
			if(flag){
				obj.deposit((int)(Math.random()*1000), getName());
				
			} else {obj.withdraw((int)(Math.random()*1000), getName());}
			
			flag = !flag;
			obj.getMoney();
			
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
	}

}



