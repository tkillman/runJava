package runJava.ch10.ex05;

public class Point2D {

	protected int x = 10;
	protected int y = 20;
	
	public void setX(int x){
		this.x=x;
		
	}
	
	public void setY(int y){
		this.y=y;
		
	}


	public void showPoint(){
		System.out.println(">> 메소드 오버라이딩 결과 Point2D의 showPoint() 메소드가 실행안된다.<<");
		System.out.println(x);
		System.out.println(y);
	}
	
		}
	

