package runJava.ch12.kame.ch12.ex04;
public class Rectangle extends Shape implements Drawable {

	
	public int w=10;
	public int h=10;
	
	@Override
	public void draw() { // �������̽� Drawable ���� draw()�޼ҵ� �������̵�
		
		System.out.println("�簢���� �׸���");
	}

	@Override
	public double area() { // �߻� Ŭ���� Shape���� area() �޼ҵ� �������̵�
		
		res=w*h;
		return res;
		
	}

}
