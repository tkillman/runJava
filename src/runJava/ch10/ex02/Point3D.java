package runJava.ch10.ex02;


// 접근 제시자 protected 의 사용 예제

// Point3D 서브 클래스
// Point2D 슈퍼 클래스
public class Point3D extends Point2D {

	
	protected int z;
	
	public void setZ(int z){
		this.z=z;
		
		System.out.println("x에 50을 더한 값 : "+ (x+50)); // 하위클래스에서 protected 된 상위클래스를 접근 가능 
		}
		
	public void showPoint(){
		
		System.out.println(x +","+ y +","+ z);
		// x와 y는 Point2D의 protected 된 변수이지만 접근이 가능했다.
		
	}	
		
	}
	

