package hanJangHee.day1107;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product(){
		price = 0;
		bonusPoint = 0;
	}
}

class Tv extends Product{
	
	Tv(){
		super(100);
		}
	
	public String toString(){
		return "Tv";
	}
}

class Computer extends Product{
	
	Computer(){
		super(200);
	}
	
	public String toString(){
		return "Computer";
		}
	}

class Audio extends Product{
   
	Audio(){
	   super(50);
   }
	
	public String toString(){
		return "Audio";
	}	
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++]=p;
	    System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary(){
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i<item.length; i++){
			if(item[i]==null) break;
			sum+=item[i].price;
			itemList +=item[i] + ", " ;
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
	
}


class PolyArgumentTest {
	public static void main(String[] args){
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");
		
	}
	

}
