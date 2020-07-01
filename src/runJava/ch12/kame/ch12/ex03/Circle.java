package runJava.ch12.kame.ch12.ex03;

public class Circle extends Shape {

	
	public int r = 5;

	@Override
	public double area() {
		
		
		res = r*r*Math.PI;
		return res;
	}

}
