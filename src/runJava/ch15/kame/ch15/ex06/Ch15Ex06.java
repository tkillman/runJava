package runJava.ch15.kame.ch15.ex06;

////********* Wrapper Ŭ����**************
// �⺻ �ڷ����� ���� ������ ����Ǵµ� �̸� �� ������ �����ϰ� ������
// Wrapper Ŭ������ ����Ѵ�. 
// ���� ������ �⺻ �ڷ����� �� ������ �ڵ����� ����Ǵ� ���� ����ڽ�
// �ݴ� ��Ȳ�� ���� ��ڽ��̶�� �Ѵ�.

public class Ch15Ex06 {
	public static void main(String[] args) {
		
		Integer intA = new Integer(10);
		// Integer Ŭ������ �������� ���ڷ� 10�� ���� intA ��ü ����
		Integer intB = new Integer("20");
		//Integer Ŭ������ �����ڷ� String ���� 20�� ���� intB ��ü ����
		
		int a = intA.intValue();
		// Integer Ŭ������ intValue() �޼ҵ� ȣ��
		// int ���� ��ȯ�ϴ� �޼ҵ�
		int b = intB.intValue();
		
		System.out.println(a +"�� 2������"+Integer.toBinaryString(a));
		System.out.println(a +"�� 8������"+Integer.toOctalString(a));
		System.out.println(a +"�� 2������"+Integer.toHexString(a));

		int c = Integer.parseInt("255");
		int d = Integer.parseInt("11111111",2);
		
		System.out.println("���ڿ� ��� 255�� 10������ �ν�:"+c);
		System.out.println("���ڿ� ��� 11111111�� 2������ �ν�:"+d);
		
	}
	

}
