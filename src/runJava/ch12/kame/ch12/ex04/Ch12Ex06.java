package runJava.ch12.kame.ch12.ex04;



public class Ch12Ex06 {
	
	public static void main(String[] args) {
		
		Triangle ref= new Triangle();
		 
		// Color.RED �� �������� �������̽� ������ ���ǵ����Ƿ� static final�� ������ ������ ���� ����� ����ص� ����
		//setColor() �޼ҵ�� �������̵� �����Ƿ� color�� ���� 1�� ����
		
		ref.setColor(Color.RED); 
		
		
		// getColor()�޼ҵ嵵 �������̵� �����Ƿ� ���� Ŭ���� getColor() �޼ҵ尡 ����
		switch (ref.getColor()) {
		case 1:
			System.out.print("������");
			break;
			
		case 2:
			System.out.print("�ʷϻ�");
			break;
			
		case 3:
			System.out.print("�Ķ���");
			break;
			
	
		}
		System.out.println("�ﰢ���̴�.");
		
	}

}
