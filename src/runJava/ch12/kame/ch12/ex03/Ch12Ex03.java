package runJava.ch12.kame.ch12.ex03;

// ***** �߻� Ŭ���� Shape�� ���� �������̵� �� area() �޼ҵ带 ����

public class Ch12Ex03 {

	public static void main(String[] args) {
	
		

		Shape ref=null; // �߻� Ŭ������ ���۷��� ������ ����
		 
		ref = new Circle(); //���� Ŭ������ �ν��Ͻ� ���� �� ����
		ref.area(); // �������̵� �� ���� Ŭ������ �޼ҵ尡 ȣ���.
		ref.printArea();
		
		ref=new Rectangle(); // �� �ٸ� �ν��Ͻ��� ���� �� ����
		ref.area(); //������ ���� ��������� ȣ��Ǵ� �޼ҵ�� �޶���
		ref.printArea(); 

		
		ref=new Triangle(); //���۷����� �����ϴ� �ν��Ͻ��� �ٲ��
		ref.area();
		ref.printArea(); //ȣ��Ǵ� �޼ҵ�� �޶���.
		
	}

}
