package runJava.ch07;

///////***************** 생성자********************
//1. 생성자는 특별한 멤버 메소드이다.
//2. 생성자는 자료형(반환 값의 유형)을 지정하지 않는다.
//3. 생성자의 호출은 명시적이지 않다.
//4. 생성자는 객체를 선언할 때 자동으로 호출된다.
//5. 객체의 초기화란 멤버 필드의 초기화를 의미한다.

public class Ch07Ex08 {

	public static void main(String[] args) {
		
		Point pt01 = new Point();
		pt01.showPoint();
		
	}

}
