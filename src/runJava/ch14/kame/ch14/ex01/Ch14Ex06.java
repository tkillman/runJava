
package runJava.ch14.kame.ch14.ex01;

/*3명의 사용자가 동일한 계좌를 사용할 때 synchronized를 사용하지 않았을 때 잔액이 문제가 생기는 클래스이다.
잔액의 문제 : 잔액이 음수가 되는 경우가 발생한다.
*/


class Atm{
	private int money; //잔액 == money
	
	public Atm(int m){ // 생성자
	money = m;	 // 계좌 개설시 입금한 금액
	}
	
	void deposit(int amount, String name){ // amount == 입금액 , 예금주
		money  += amount;
		System.out.println(name +":입금금액:"+ amount);
		
	}
	
	void withdraw(int amount,String name){ // 출금 == amount
		if((money -amount)>0){ // 출금 가능하면
			//다른 스레드가 동작하도록 양보를 하는 메소드 yield를 호출하여
			//잔액에 문제가 생기도록 유도한다.
			
			Thread.yield(); // 양보하는 메소드
			
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


 class AtmUser extends Thread{ //Thread를 구현한 AtmUser 클래스
	
	 boolean flag=false; 
	 
	 Atm obj; // Atm의 래퍼런스변수 obj
	 
	 public AtmUser(Atm obj,String name){ //객체의 래퍼런스변수와 이름을 매개변수로 갖는 AtmUser의 생성자
		 super(name);// == Thread(name); name을 이름으로 갖는 새로운 스레드 생성
		 this.obj=obj; // 
		 
	 }
	 
	 
	 public void run(){
		 for(int i=0; i<5; i++){
			 
			 try {
				 
				 sleep(500);
				 
			} catch (InterruptedException e) {}
			 
		if(flag){
			obj.deposit((int)(Math.random()*10+2)*100, getName()); //입금 , 쓰레드 이름을 가지고 온다.
			obj.getmoney();
		
		} else {
			obj.withdraw((int)(Math.random()*10+2)*100, getName()); //출금
		}	 
			 flag = !flag;
			 
		 }
	 }
 }


public class Ch14Ex06 {

	public static void main(String[] args) {
		
		Atm obj = new Atm(1000);
		
		AtmUser user1 = new AtmUser(obj, "한석희");
		AtmUser user2 = new AtmUser(obj, "유명화");
		AtmUser user3 = new AtmUser(obj, "이복정");
		
		
		user1.start();
		user2.start();
		user3.start();
	
	}

}
