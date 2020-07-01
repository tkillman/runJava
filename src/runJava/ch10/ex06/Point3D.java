package runJava.ch10.ex06;

// ******** 상속에서의 생성자***********
// 실행 파일은 kame.ch10.ex04_2에 있음.
public class Point3D extends Point2D {

	
	protected int z = 30;
	
	public Point3D(){ //생성자 
		
		System.out.println("Point3D 의 생성자");
	}
	
	public Point3D(int x, int y, int z){
		System.out.println(x+","+y+","+z);
		
	}
	public void showPoint(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}	
		
}
	
		
		
	
	

