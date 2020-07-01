package runJava.ch12.kame.ch12.ex03;

public class Triangle extends Shape {

	public int w=10;
	public int h=10;
	
	@Override
	public double area(){ 
		
		res= w*h*0.5;
		return res;
		
	}
	
	

}
