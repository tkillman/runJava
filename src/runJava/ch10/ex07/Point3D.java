package runJava.ch10.ex07;

// ************* 상속에서의 생성자************
//실행 파일은 kame.ch10.ex04_2에 있음.
// Point2D 매개변수 없는 생성자를 주석 처리하는 경우 하위 클래스의 매개변수 없는 생성자를 정의하는데도 에러가 발생한다.
// 왜냐하면 객체를 만들 때 하위클래스의 생성자가 호출되면 상위 클래스의 생성자도 호출되어야 하기 때문이다.

public class Point3D extends Point2D {

	
	protected int z = 30;
	
	public Point3D(){
		
		System.out.println("Point3D 의 생성자");
	}
	
	public Point3D(int x, int y, int z){
		super(x,y); // 슈퍼클래스의 생성자를 명시적으로 호출하는 방법.
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public void showPoint(){
		System.out.println(">>>>Point3D의 showPoint() 메소드 실행<<<<");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}	
		
}
	

		
	
	

