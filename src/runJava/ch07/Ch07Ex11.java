package runJava.ch07;


//************* ������ ������ �⺻ ������ ������.
public class Ch07Ex11 {
	
	public static void main(String[] args) {
		
		int a =3;
		int b =a;
		b =5;
		System.out.println(a); //�⺻�� ������ ���� �����Ǿ� ���� ������ b���� ���ص� a���� ��ȭ�� ����.
		
		
		Point p1 = new Point();
		Point p2 = p1;
		p1.x =3; 
		p2.x =5;
		
		System.out.println(p1.x); 
		//������ ������ ���� new �����ڸ� ���� �޸� �Ҵ��� �ѹ��ۿ� ���� �ʾұ� ������
	    // p2�� ���� ��ȭ�� �ָ� p1�� ���� ���ϰ� �ȴ�.	
	}
}
