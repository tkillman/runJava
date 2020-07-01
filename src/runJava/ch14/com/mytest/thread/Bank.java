package runJava.ch14.com.mytest.thread;

public class Bank {

	public static void main(String[] args) {
		
		
		Atm obj = new Atm(1000);
		AtmUser a1 = new AtmUser(obj, "�赿��");
		AtmUser a2 = new AtmUser(obj, "�ֺ���");
		AtmUser a3 = new AtmUser(obj, "����ö");
		a1.start();
		a2.start();
		a3.start();
	}
	
	
}


class Atm{
	private int money;
	
	public Atm(int m){ //money �� �ܾ� , m�� �Աݱݾ�
		money=m;
	}
	
	void deposit(int amount, String name){ // amount �Աݾ�, name �Ա���
			money= money+amount;
			System.out.println(name+":�Աݱݾ�:"+amount);
						
	}
	
	void withdraw(int amount, String name){ //amount ��ݾ�, name �����
		
		if(money >amount){ // ��ݰ���
		
		Thread.yield();
		money -=amount;
		
		System.out.println(name+"---��ݱݾ�:"+amount);
		
		} else{
			
			System.out.println(name +"��ݸ���");
		}
	
	}
	
	public void getMoney(){
		
		System.out.println("���� �ܾ���" +money);
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



