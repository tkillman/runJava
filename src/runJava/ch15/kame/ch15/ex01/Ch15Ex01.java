package runJava.ch15.kame.ch15.ex01;


///////*********** Object Ŭ������ �޼ҵ�� ****************
// Object Ŭ������?? ��� Ŭ�������� �ڵ������� ��ӹ޴� Ŭ����
//  class Point{} == class Point extends Object{}
//Object Ŭ������ �߿� �޼ҵ��
// **hasCode ��ü�� �ĺ��ϴ� ���� ���� �ؽ��ڵ带 ��ȯ�Ѵ�.
//**toString ��ü�� ���ڿ��� ��ȯ�Ѵ�.
//**notify �����带 �ٽ� �����Ѵ�.
//**wait �������� �۵��� �����ϰ� ��� ���·� �����.

class Point{}


class Ch15Ex01 {

	
	public static void main(String[] args) {
		
		System.out.println(">>startPt ��ü�� ����");
		
		Point startPt = new Point();
		
		
		System.out.println("Ŭ���� �̸�:" +startPt.getClass()); //Class ���·� ��ȯ
		//System.out.println(startPt.getClass().getName());
		System.out.println("�ؽ��ڵ�:" +startPt.hashCode()); //��ü�� �ĺ��ϴ� ���� ��
		System.out.println("��ü ���ڿ�:" +startPt.toString()); //
		//getClass().getName() +@integer.toHexString(hashCode()) ��ü ���ڿ� : ��ü �̸� +��ü �ؽ��ڵ�
		//getName(); String ���·� ��ȯ
		
		System.out.println();
		System.out.println("startPt ��ü�� ����");
		Point endPt = new Point();
		System.out.println("Ŭ���� �̸�:" +endPt.getClass());
		System.out.println("�ؽ��ڵ�:" +endPt.hashCode());
		System.out.println("��ü ���ڿ�:" +endPt.toString());
		
		
		System.out.println("equal �޼ҵ�:"+startPt.equals(endPt));
		
		
	}
}
