package runJava.ch11.kame.ch11.ex02;

public class Circle extends Shape {

	public int r=5;
	public double area(){ //슈퍼클래스와 메소드명이 같다.
		
		res= r*r*Math.PI;
		return res;
	}

}
