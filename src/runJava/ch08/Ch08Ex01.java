package runJava.ch08;

//**************this의 사용 예제*************
//Point.java 참조

//this 와 static

/*Point pt; 객체의 선언 - 객체에 접근 가능한 레퍼런스변수 생성 

  래퍼런스 변수란 ? 클래스의 객체에 접근할 수 있는 변수, 스택 영역에 할당


pt = new Point(); 인스턴스 생성 - 메모리에 할당되면서 실질적인 객체가 생성됨, 힙 영역에 값이 저장됨


this 의 역할?
한 클래스로부터 여러가지의 객체를 생성할 수 있도록 도와준다.
자동적으로 this라는 래퍼런스변수가 선언되고 이 this에 pt01이나 pt02의 필드값이 저장된다.
그래서 this를 쓰면 그 객체의 필드임을 명시적으로 밝힐 수 있다.


결론?
this는 그 객체를 지칭한다.*/

public class Ch08Ex01 {
	
	public static void main(String[] args) {
		
		Point pt01 = new Point(10, 20);
		
		pt01.showPoint();
		pt01.setX(30); // 매개변수의 인자로 x=30을 준 것이 필드의 x값을 변경 시킬 수 있었다.
		pt01.showPoint();
		
	}

}
