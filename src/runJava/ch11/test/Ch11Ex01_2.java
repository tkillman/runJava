package runJava.ch11.test;
import runJava.ch11.kame.ch11.ex01.*;

///////********** 래퍼런스 변수 형변화***************
//// 업 캐스팅과 다운 캐스팅
//*** 업 캐스팅 : 슈퍼 클래스의 래퍼런스 변수가 하위 클래스의 인스턴스를 참조 , 암시적 형 변환
//*** 다운 캐스팅 : 서브 클래스의 래퍼런스 변수가 상위 클래스의 인스턴스를 참조 , 명시적 형 변환 

public class Ch11Ex01_2 {

	public static void main(String[] args) {
		Point2D up = new Point3D();
		System.out.println("슈퍼 클래스인 Point2D의 래퍼런스 변수 사용");
		System.out.println(up.x);
		System.out.println(up.y);
		//System.out.println(up.z);
		
		Point3D down = (Point3D)up;
		System.out.println("하위 클래스인 Point3D의 래퍼런스 변수 사용");
		System.out.println(down.x);
		System.out.println(down.y);
		System.out.println(down.z);
	}
	

}
