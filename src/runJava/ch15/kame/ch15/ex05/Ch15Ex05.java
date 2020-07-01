package runJava.ch15.kame.ch15.ex05;


//*************** Object 클래스의 equals() 메소드 오버라이딩****************
class Point{
	int x,y;
	
	Point(){}
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}

	public boolean equals(Object obj){ // object 클래스의 equals 메소드 오버라이딩
		
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
		
		System.out.println("p1==p2의 결과");
		if(p1==p2){
			
			System.out.println("p1과 p2의 인스턴스는 동일");
		} else {System.out.println("p1과 p2의 인스턴스는 다르다.");}
		
		System.out.println("p1.equals(p2)의 결과");
		if(p1.equals(p2)){
			System.out.println("p1과 p2의 데이터는 동일하다.");
			
		} else {System.out.println("p1과 p2의 데이터는 다르다.");}
		//equals 메소드를 사용했기 때문에 결과값은 데이터는 동일하다가 나오길 바랬는데 그렇지 않았다.
		//why? equals를 오버라이딩하지 않으면 두 데이터의 해시값을 비교하기 때문에
		
	}
}	
	
	

