package runJava.ch12.kame.ch12.ex04;


//********* Shape 추상 클래스를 상속받고 Drawable 인터페이스를 implements 함

public class ch12Ex05 {

	public static void main(String[] args) {
		
		
		Rectangle ref= null;
		ref= new Rectangle();
		ref.area(); // 추상클래스로부터 상속
		ref.printArea();// 추상클래스로부터 상속
		ref.draw(); // 인터페이스에서 상속
		
	}
	
}
