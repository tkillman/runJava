
package runJava.ch14.kame.ch14.ex01;

/*3���� ����ڰ� ������ ���¸� ����� �� synchronized�� ������� �ʾ��� �� �ܾ��� ������ ����� Ŭ�����̴�.
�ܾ��� ���� : �ܾ��� ������ �Ǵ� ��찡 �߻��Ѵ�.
*/


class Atm{
	private int money; //�ܾ� == money
	
	public Atm(int m){ // ������
	money = m;	 // ���� ������ �Ա��� �ݾ�
	}
	
	void deposit(int amount, String name){ // amount == �Աݾ� , ������
		money  += amount;
		System.out.println(name +":�Աݱݾ�:"+ amount);
		
	}
	
	void withdraw(int amount,String name){ // ��� == amount
		if((money -amount)>0){ // ��� �����ϸ�
			//�ٸ� �����尡 �����ϵ��� �纸�� �ϴ� �޼ҵ� yield�� ȣ���Ͽ�
			//�ܾ׿� ������ ���⵵�� �����Ѵ�.
			
			Thread.yield(); // �纸�ϴ� �޼ҵ�
			
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


 class AtmUser extends Thread{ //Thread�� ������ AtmUser Ŭ����
	
	 boolean flag=false; 
	 
	 Atm obj; // Atm�� ���۷������� obj
	 
	 public AtmUser(Atm obj,String name){ //��ü�� ���۷��������� �̸��� �Ű������� ���� AtmUser�� ������
		 super(name);// == Thread(name); name�� �̸����� ���� ���ο� ������ ����
		 this.obj=obj; // 
		 
	 }
	 
	 
	 public void run(){
		 for(int i=0; i<5; i++){
			 
			 try {
				 
				 sleep(500);
				 
			} catch (InterruptedException e) {}
			 
		if(flag){
			obj.deposit((int)(Math.random()*10+2)*100, getName()); //�Ա� , ������ �̸��� ������ �´�.
			obj.getmoney();
		
		} else {
			obj.withdraw((int)(Math.random()*10+2)*100, getName()); //���
		}	 
			 flag = !flag;
			 
		 }
	 }
 }


public class Ch14Ex06 {

	public static void main(String[] args) {
		
		Atm obj = new Atm(1000);
		
		AtmUser user1 = new AtmUser(obj, "�Ѽ���");
		AtmUser user2 = new AtmUser(obj, "����ȭ");
		AtmUser user3 = new AtmUser(obj, "�̺���");
		
		
		user1.start();
		user2.start();
		user3.start();
	
	}

}
