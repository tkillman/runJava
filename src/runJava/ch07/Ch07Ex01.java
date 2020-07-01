package runJava.ch07;


////********** 클래스의 객체 생성과 필드 접근법************
// 클래스 = 데이터(필드) +데이터를 처리할 부분(메소드)

class Point01{
	int x;
	int y;
	
}

public class Ch07Ex01 {
	
	public static void main(String[] args) {
		
		Point01 pt01=new Point01();
		pt01.x =10;
		pt01.y=20;
		System.out.println("pt01.x=="+pt01.x +"\t  pt01.y=="+pt01.y);
		
	}

}
