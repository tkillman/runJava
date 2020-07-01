package runJava.ch15.kame.ch15.ex03;


//// ************* Object 클래스의 toString() 메소드 오버라이딩**************
// 문자열값을 반환한다.

class Point{
	int x,y;
	public Point(){}
	public Point(int x, int y){
		
		this.x = x;
		this.y =y;		
	}
	
// 객체의 문자열 값이 아닌 데이터의 문자열 값을 받고 싶을 때 Object의
	//toString() 메소드를 재 정의해서 사용한다.
	public String toString(){
		String str;
		str="("+x+","+y+")";
		return str;
		
	}
	
}

public class Ch15Ex03 {
	
		public static void main(String[] args) {
			
			Point d2=new Point(10, 20);
			
			System.out.println(d2.toString());
			
			System.out.println(">>>>d2 객체<<<<");
			System.out.println(d2);
			
		}
	
}
