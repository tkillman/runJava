package runJava.ch12.kame.ch12.ex03;

// ***** 추상 클래스 Shape를 통해 오버라이딩 된 area() 메소드를 실행

public class Ch12Ex03 {

	public static void main(String[] args) {
	
		

		Shape ref=null; // 추상 클래스로 래퍼런스 변수를 선언
		 
		ref = new Circle(); //서브 클래스로 인스턴스 생성 및 참조
		ref.area(); // 오버라이딩 된 서브 클래스의 메소드가 호출됨.
		ref.printArea();
		
		ref=new Rectangle(); // 또 다른 인스턴스를 생성 및 참조
		ref.area(); //동일한 접근 방식이지만 호출되는 메소드는 달라짐
		ref.printArea(); 

		
		ref=new Triangle(); //래퍼런스가 참조하는 인스턴스가 바뀌면
		ref.area();
		ref.printArea(); //호출되는 메소드는 달라짐.
		
	}

}
