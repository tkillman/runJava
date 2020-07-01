package runJava.ch12.kame.ch12.ex04;
public class Rectangle extends Shape implements Drawable {

	
	public int w=10;
	public int h=10;
	
	@Override
	public void draw() { // 인터페이스 Drawable 에서 draw()메소드 오버라이드
		
		System.out.println("사각형을 그리다");
	}

	@Override
	public double area() { // 추상 클래스 Shape에서 area() 메소드 오버라이드
		
		res=w*h;
		return res;
		
	}

}
