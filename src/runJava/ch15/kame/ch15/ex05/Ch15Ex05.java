package runJava.ch15.kame.ch15.ex05;


//*************** Object Ŭ������ equals() �޼ҵ� �������̵�****************
class Point{
	int x,y;
	
	Point(){}
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}

	public boolean equals(Object obj){ // object Ŭ������ equals �޼ҵ� �������̵�
		
		Point pt=null;
		if(obj instanceof Point){
			pt= (Point)obj;
			}
		if(this.x==pt.x && this.y==pt.y){
			return true;
		} else {return false;}
	
		
}
}


public class Ch15Ex05 {

	public static void main(String[] args) {
		Point p1= new Point(10,20);
		Point p2= new Point(10, 20);
		
		System.out.println("p1==p2�� ���");
		if(p1==p2){
			
			System.out.println("p1�� p2�� �ν��Ͻ��� ����");
		} else {System.out.println("p1�� p2�� �ν��Ͻ��� �ٸ���.");}
		
		System.out.println("p1.equals(p2)�� ���");
		if(p1.equals(p2)){
			System.out.println("p1�� p2�� �����ʹ� �����ϴ�.");
			
		} else {System.out.println("p1�� p2�� �����ʹ� �ٸ���.");}
		//equals �޼ҵ带 ����߱� ������ ������� �����ʹ� �����ϴٰ� ������ �ٷ��µ� �׷��� �ʾҴ�.
		//why? equals�� �������̵����� ������ �� �������� �ؽð��� ���ϱ� ������
		
	}
}	
	
	

