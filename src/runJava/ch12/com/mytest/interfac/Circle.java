package runJava.ch12.com.mytest.interfac;

public class Circle implements Dulre{

		int r= 5;
		
	
	@Override
	public void draw() {
		
		System.out.println("���Դϴ�");
	}

	@Override
	public void dul() {
		
		
		System.out.println("���� �ѷ��� :" + r*2*Math.PI );
		
	}

	@Override
	public void Area() {
		
		System.out.println("���� ���̴� :"+ r*r*Math.PI);
		
	}

}
