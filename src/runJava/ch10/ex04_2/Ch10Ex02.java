package runJava.ch10.ex04_2;

import runJava.ch10.ex02.Point3D;

// ********접근 지정자************
// 다른 패키지, 하위 클래스가 아닌 곳에서 protected 변수에 접근 불가

public class Ch10Ex02 {

	public static void main(String[] args) {
		
		Point3D pt =new Point3D(); // Point3D의 클래스의 객체 생성
		
		
		// protected x,y,z 들
		
		/*pt.x =10; pt.y=20; pt.z=30;
		System.out.println(pt.x+","+ pt.y+ "," +pt.z);
		*/
		
		pt.setX(10); pt.setY(20); pt.setZ(30);
		
		pt.showPoint();
		
		
	}
	
	

}
