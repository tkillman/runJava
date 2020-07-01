package runJava.ch11.test;

import runJava.ch11.kame.ch11.ex01.*;

//******************** 래퍼런스 형 변환******************
//*****클래스가 상속 관계에 있을 때만 래퍼런스 형 변환이 가능하다.
public class Ch11Ex01_1 {
	
	public static void main(String[] args) {
		
		Point3D pt;
		pt=new Point3D();
	
		Point2D up= new Point3D();
		
		//Point2D up;
		// up = pt;
		
		//암시적 형변환 
		//슈퍼 클래스의 레퍼런스변수가 서브 클래스의 인스턴스 참조
		// 객체 : 인스턴스 변수 +래퍼런스 변수
		
		//Point3D down = new Point2D(); 에러발생 서브 클래스의 인스턴스가 더 많은 정보를 내포하고 있다.
		//명시적 형변환
		
		//System.out.println(down.z);
		System.out.println("Point3D 래퍼런스 변수 사용");
		System.out.println(pt.x);
		System.out.println(pt.y);
		System.out.println(pt.z);
		System.out.println("Point2D 래퍼런스 변수 사용");
		System.out.println(up.x);
		System.out.println(up.y);
		//System.out.println(up.z);  // 컴파일 에러 발생 --> 업캐스팅으로 상속받은 필드로 축소되어서
		
		
	}
	
	
}
