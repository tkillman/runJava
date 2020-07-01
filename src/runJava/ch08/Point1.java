package runJava.ch08;


// this() 를 포함한 클래스

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
		//x=x; 이렇게 하게 되면 필드의 x값을 바꿀 수가 없다.
	}
	
	public void showPoint(){
		System.out.println("x좌표 :"+x+",y좌표 : "+y);
	}
	
}
