package runJava.ch08;


// this() �� ������ Ŭ����

public class Point1 {
	
	int x;
	int y;
	public Point1() {
		// TODO Auto-generated constructor stub
		this(10,10);
		
	}

	public Point1(int x){
		this(x,10);
	}
	
	
	public Point1(int x,int y){
		this.x= x;
		this.y= y;
		
	}
	
	
	public void setX(int x){
		this.x=x;
		//x=x; �̷��� �ϰ� �Ǹ� �ʵ��� x���� �ٲ� ���� ����.
	}
	
	public void showPoint(){
		System.out.println("x��ǥ :"+x+",y��ǥ : "+y);
	}
	
}
