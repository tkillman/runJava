package runJava.ch12.kame.ch12.ex04;

public class Triangle implements Color {

	
	int color=0; // color 변수에 0
	
	
	@Override
	public void setColor(int c) { //setColor(숫자) 메소드
		color =c; 

	}

	@Override
	public int getColor() { //getColor() 메소드
		
		return color;
	}

}
