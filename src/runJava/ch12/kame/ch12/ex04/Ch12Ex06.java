package runJava.ch12.kame.ch12.ex04;



public class Ch12Ex06 {
	
	public static void main(String[] args) {
		
		Triangle ref= new Triangle();
		 
		// Color.RED 는 변수지만 인터페이스 내에서 정의됐으므로 static final이 생략된 것으로 보아 상수로 취급해도 무관
		//setColor() 메소드는 오버라이딩 됐으므로 color의 값에 1이 대입
		
		ref.setColor(Color.RED); 
		
		
		// getColor()메소드도 오버라이딩 됐으므로 서브 클라스의 getColor() 메소드가 실행
		switch (ref.getColor()) {
		case 1:
			System.out.print("빨간색");
			break;
			
		case 2:
			System.out.print("초록색");
			break;
			
		case 3:
			System.out.print("파란색");
			break;
			
	
		}
		System.out.println("삼각형이다.");
		
	}

}
