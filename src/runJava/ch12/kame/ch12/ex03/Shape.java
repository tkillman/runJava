package runJava.ch12.kame.ch12.ex03;

public abstract class Shape {
	
	// abstract class == �߻� Ŭ����
	
	public double res = 0; 
	
	
	
	public abstract double area(); // �߻� �޼ҵ�
	
	
	public void printArea(){ //�߻� Ŭ���� �ȿ� �Ϲ� �޼ҵ尡 �´�.
		
		System.out.println("������"+res+"�̴�.");
	}
	
}
