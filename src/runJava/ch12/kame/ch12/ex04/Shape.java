package runJava.ch12.kame.ch12.ex04;

public abstract class Shape {

	public double res=0;
	public abstract double area();
	public void printArea(){
		
		System.out.println("면적은" + res + "이다.");
		
	}
	
}
