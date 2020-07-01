package runJava.ch10.ex05;

//******************메소드 오버라이딩 *********************
		// 슈퍼 클래스(Point2D)의 showPoint() 
		// 메소드와 서브 클래스(Point3D)의 showPoint() 메소드 중 서브 클래스가 실행됨.
		// 서브 클래스(Point3D)의 showPoint()를 주석처리해보고 다시 실행시켜보길 권장함.

public class Ch10Ex05 {

	public static void main(String[] args) {		
		
		Point3D pt = new Point3D();
		pt.showPoint();
		
	}
}
