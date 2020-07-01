package runJava.ch12.kame.ch12.ex03;

public abstract class Shape {
	
	// abstract class == 추상 클래스
	
	public double res = 0; 
	
	
	
	public abstract double area(); // 추상 메소드
	
	
	public void printArea(){ //추상 클래스 안에 일반 메소드가 온다.
		
		System.out.println("면적은"+res+"이다.");
	}
	
}
