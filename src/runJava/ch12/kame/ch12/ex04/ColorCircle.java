package runJava.ch12.kame.ch12.ex04;



public class ColorCircle implements ColorShape {

	int color=0;
	
	@Override
	public void setColor(int c) {// �������̽� Color�� �ִ� setColor() �޼ҵ�
		
		color = c;

	}

	@Override
	public int getColor() { // �������̽� Color�� �ִ� getColor() �޼ҵ�
		
		return color;
	}

	@Override
	public void draw() { // �������̽� ColorShape�� �ִ� draw() �޼ҵ�
		switch (color) {
		case 1:
			System.out.println("������");
			break;

			
		case 2:
			System.out.println("�ʷϻ�");
			break;
			
		case 3:
			System.out.println("�Ķ���");
			break;
			
		}
		
		System.out.println("���̴�.");
		
	}

	
	
}
