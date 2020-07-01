package runJava.ch11.test;
import runJava.ch11.kame.ch11.ex02.*;

	//************** 메소드 오버라이딩 + 래퍼런스 변수 형변화 실습 예제**********
	//슈퍼 클래스의 래퍼런스변수가 서브 클래스의 인스턴스를 참조했다.
	// 같은 래퍼런스 변수에 같은 메소드를 호출했지만 
	// 서브 클래스 메소드의 오버로딩으로 슈퍼클래스의 메소드는 가려지고 
	// 서브 클래스의 메소드가 호출되면서 각각의 면적을 구할 수 있게 되었다.
	// 문제는 이렇게 했을 경우 래퍼런스 변수명들이 모두 같아서 
	// 어떤 도형의 면적을 구하는지가 애매하다.
	// 해결방법은 instanceof를 사용해서 래퍼런스 변수를 바꿔준다.


public class Ch11Ex02 {

	public static void main(String[] args) {
		
		Shape ref=null;
		
		ref= new Circle();
		System.out.println("도형의 면적은"+ref.area());
		
		ref= new Rectangle();
		System.out.println("도형의 면적은"+ref.area());
		
		ref= new Triangle();
		System.out.println("도형의 면적은"+ref.area());
		
	}
	
	
}
