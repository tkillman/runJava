package runJava.ch10.ex07;


//******** 상속에서의 생성자********
//실행 파일은 kame.ch10.ex04_2에 있음.
public class Point2D {

	protected int x;
	protected int y;
	
	//주석 시켜보기
	public Point2D(){
		System.out.println("point2D 생성자");
	}
	//여기까지 주석 시켜보기
	
	public Point2D(int x, int y){
		this.x=x;
		this.y=y;		
		System.out.println("Point2D(int x, int y) 생성자 실행값 :"+x+","+y);
	}
	
	
	
}
