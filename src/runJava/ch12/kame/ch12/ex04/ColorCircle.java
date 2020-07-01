package runJava.ch12.kame.ch12.ex04;



public class ColorCircle implements ColorShape {

	int color=0;
	
	@Override
	public void setColor(int c) {// 인터페이스 Color에 있는 setColor() 메소드
		
		color = c;

	}

	@Override
	public int getColor() { // 인터페이스 Color에 있는 getColor() 메소드
		
		return color;
	}

	@Override
	public void draw() { // 인터페이스 ColorShape에 있는 draw() 메소드
		switch (color) {
		case 1:
			System.out.println("빨간색");
			break;

			
		case 2:
			System.out.println("초록색");
			break;
			
		case 3:
			System.out.println("파란색");
			break;
			
		}
		
		System.out.println("원이다.");
		
	}

	
	
}
