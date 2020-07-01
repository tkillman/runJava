package runJava.ch10.ex01;


//***************** 상속***************
//ch10_1 클래스에는 x와 y에 대한 변수가 선언되어 있지 않지만 상속받아서 사용 가능하다.

//ch10_1 ------ 하위 클래스, 서브 클래스
//ch10 ------ 상위 클래스, 슈퍼 클래스

public class Ch10Ex01 {
	
	public static void main(String[] args) {
		Ch10_1 pt= new Ch10_1();
		pt.x =10; pt.y=20; pt.z=30;
	
		System.out.println( pt.x+","+ pt.y+ "," +pt.z);
	}

}

