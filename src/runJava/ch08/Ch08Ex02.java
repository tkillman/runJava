package runJava.ch08;


/////////// *************** this() �������� ����***********************
/// Point1.java �� �Բ� �� ��.

public class Ch08Ex02 {
	
	public static void main(String[] args) {
		Point1 pt01 = new Point1(10,20); //�����ڷ� �Ű����� �ΰ���  �� �޼ҵ� ����
		pt01.showPoint();
		
		
		//�Ű������� ���� ����Ʈ �����ڴ� �ڵ������� ȣ��Ǵµ� �̶� this(10,10)�� ����ǰ�
		// x���� 30���� �����Ű�Ƿ� ���ؼ� ������� 30,10�� ������ �ȴ�.
		Point1 pt02 = new Point1(30); 
		pt02.showPoint();
		
		
		// ����Ʈ �����ڷ� ���� 10,10�� ȣ��ȴ�.
		Point1 pt03 = new Point1();
		pt03.showPoint();
		
	}

}
