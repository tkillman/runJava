package runJava.ch12.kame.ch12.ex04;

//************** 인터페이스를 상속한 뒤 오버라이딩 된 draw() 메소드를 정의 한 클래스

public class Circle implements Drawable {


	@Override
	public void draw() {
		System.out.println("원을 그리다.");

	}

}
