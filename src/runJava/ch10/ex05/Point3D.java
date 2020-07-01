package runJava.ch10.ex05;

public class Point3D extends Point2D {
	protected int z = 30;

	public void setZ(int z){
		this.z=z;		
		System.out.println(x+50); // 하위클래스에서 protected 된 상위클래스를 접근 가능 
		}
		
	public void showPoint(){
		System.out.println(">> 메소드 오버라이딩 결과 Point3D의 showPoint() 메소드가 실행된다.<<");
		System.out.println(x +","+ y +","+ z);
		System.out.println("");
		System.out.println(">>>>>> super.showPoint(); 슈퍼 클래스의 메소드를 호출<<<<<<<<");
		super.showPoint();
		// 슈퍼 클래스의 오버라이딩 된 메소드를 호출할 필요가 있을 경우
	}	
	 	
	}
	

