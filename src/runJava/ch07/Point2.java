package runJava.ch07;


// default 생성자를 주석처리

public class Point2 {
		int x;
		int y;
	
	
	/*public Point2() {
		// TODO Auto-generated constructor stub
		System.out.println("매개변수가 없는 디폴트 생성자");
		
	}
*/	
	public Point2(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	public void showPoint(){
		System.out.println("(" + x +","+y +")");
		
	}
	
}
