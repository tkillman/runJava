package runJava.ch14.kame.ch14.ex01;


//**********����ȭ�� ����� ���� �������� ������ �ذ��ϴ� Ŭ������***********//
//****************synchronized***********************/
// *** ������ �Ǵ� �� ��ݽ� �ش� �޼ҵ带 ���� �� ���� �ٸ� Thread �� �������� ���ϵ��� ���´�. synchronized�� ����.

class SyncAtm{
	private int money; //�ܾ�
	public SyncAtm(int m){ // ������
	money =m;	 // ���� ������ �Ա��� �ݾ�
		
	}
	
	synchronized void deposit(int amount, String name){ // �Ա�
		money  += amount;
		System.out.println(name +":�Աݱݾ�:"+ amount);
		
	}
	
	synchronized void withdraw(int amount,String name){ // ���
		if((money -amount)>0){ // ��� �����ϸ�
			//�ٸ� �����尡 �����ϵ��� �纸�� �ϴ� �޼ҵ� yield�� ȣ���Ͽ�
			//�ܾ׿� ������ ���⵵�� �����Ѵ�.
			
			Thread.yield();
			
			money-=amount;
			System.out.println(name +":��ݱݾ�:"+ amount);
		}
		
		else {
			System.out.println(name +":��� �Ұ���(�ܾ׺���)");
		}
	}
	
	public void getmoney(){
		
		System.out.println("���� �ܾ���:" +money);
	}
	
}

 class SyncAtmUser extends Thread{ //Atm �����
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
		SyncAtmUser user1 = new SyncAtmUser(obj, "�Ѽ���");
		SyncAtmUser user2 = new SyncAtmUser(obj, "����ȭ");
		SyncAtmUser user3 = new SyncAtmUser(obj, "�̺���");
		
		
		user1.start();
		user2.start();
		user3.start();
	
	}

}
