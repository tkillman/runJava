package runJava.ch11.test;
import runJava.ch11.kame.ch11.ex02.Circle;
import runJava.ch11.kame.ch11.ex02.Rectangle;
import runJava.ch11.kame.ch11.ex02.Shape;
import runJava.ch11.kame.ch11.ex02.Triangle;


/**************instanceof 연산자******************
연산자? +,-,*,/ 같은거. 두 피연산자의 대해 수행할 평가를 지정합니다. 
		
is a 관계		
Circle is a Shape.

instanceof 연산자란

왼쪽 instanceof 오른쪽
왼쪽의 래퍼런스 변수가 오른쪽 클래스의 인스턴스로 형변환이 가능한가?
boolean 형태 반환		
*/

public class Ch11Ex04 {
	
	public static void polyMethod(Shape ref){ //polyMethod 메소드 정의 , 매개변수로 Shape 래퍼런스변수를 받는다.
		
		ref.area(); // 이 함수가 호출되면 Shape 클래스의 area 메소드가 실행된다.
		
	if(ref instanceof Circle){ // ref 래퍼런스 변수가 Circle 클래스의 래퍼런스 변수로 형변환이 가능한가?

		// c 래퍼런스변수가  ref로 래퍼런스 형변환이 불가능하기 때문에 왜냐하면 c가 서브클래스 ref 가 슈퍼클래스이므로 
		//강제 형변환 (Circle)을 넣어준다.
		Circle c = (Circle) ref; 
		System.out.println("반지름이"+ c.r +"원의 면적이" + c.res);
		
	}	else if (ref instanceof Rectangle){
		Rectangle r= (Rectangle) ref;
		System.out.println("너비가"+ r.w +"높이가" + r.h +"면적은"+r.res);

	} else if (ref instanceof Triangle){
		Triangle t= (Triangle)ref;
		System.out.println("너비가"+ t.w +"높이가" + t.h +"면적은" +t.res);
	}
} // polyMethod의 끝
	
	
	public static void main(String[] args) {
		polyMethod(new Circle()); // instanceof를 사용해서 어떤 도형의 면적을 구하는지 알 수 있다.
		polyMethod(new Rectangle()); // 
		polyMethod(new Triangle());
	}
	}
