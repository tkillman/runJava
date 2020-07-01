package runJava.ch10.ex04_2;

public class test2 extends test{

	int z;
	
	public test2() {
		// TODO Auto-generated constructor stub
	System.out.println("매개변수가 없는 test2 생성자");
	
	}
	
	public test2(int z){
		super(5,6);
		this.z=z;
		System.out.println("매개변수가 있는 test2 생성자");
	}
	
	
}
