package runJava.ch15.kame.ch15.ex01;


///////*********** Object 클래스의 메소드들 ****************
// Object 클래스란?? 모든 클래스들이 자동적으로 상속받는 클래스
//  class Point{} == class Point extends Object{}
//Object 클래스의 중요 메소드들
// **hasCode 객체를 식별하는 정수 값인 해시코드를 반환한다.
//**toString 객체의 문자열을 반환한다.
//**notify 쓰레드를 다시 시작한다.
//**wait 쓰레드의 작동을 중지하고 대기 상태로 만든다.

class Point{}


class Ch15Ex01 {

	
	public static void main(String[] args) {
		
		System.out.println(">>startPt 객체의 정보");
		
		Point startPt = new Point();
		
		
		System.out.println("클래스 이름:" +startPt.getClass()); //Class 형태로 반환
		//System.out.println(startPt.getClass().getName());
		System.out.println("해시코드:" +startPt.hashCode()); //객체를 식별하는 정수 값
		System.out.println("객체 문자열:" +startPt.toString()); //
		//getClass().getName() +@integer.toHexString(hashCode()) 객체 문자열 : 객체 이름 +객체 해시코드
		//getName(); String 형태로 반환
		
		System.out.println();
		System.out.println("startPt 객체의 정보");
		Point endPt = new Point();
		System.out.println("클래스 이름:" +endPt.getClass());
		System.out.println("해시코드:" +endPt.hashCode());
		System.out.println("객체 문자열:" +endPt.toString());
		
		
		System.out.println("equal 메소드:"+startPt.equals(endPt));
		
		
	}
}
