package runJava.ch11.kame.ch11.ex02;

public class Triangle extends Shape {

	public int w=10;
	public int h=10;
	
	public double area(){ //슈퍼클래스와 메소드명이 같다.
		
		res= w*h*0.5;
		return res;
		
	}
	
	

}
