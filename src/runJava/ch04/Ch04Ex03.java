package runJava.ch04;

public class Ch04Ex03 {
	
/*	switch ��빮 
 * , ���� 100���� ����A,���� 90�� �̻��� ����B,80�� �̻��� ����C�� �ֵ��� �ڵ�*/
	
	public static void main(String[] args) {
		
		int score = 94;
		
		switch (score/10) { //������ �νĵȴ�.
		case 10:
			System.out.println("100�� �Դϴ�.");
			break;

		case 9:
			System.out.println("90�� �̻��Դϴ�");
			break;
		case 8:
			System.out.println("80�� �̻��Դϴ�");
			break;
		case 7:
			System.out.println("70�� �̻��Դϴ�");
			break;
		case 6:
			System.out.println("60�� �̻��Դϴ�");
			break;
		case 5:
			System.out.println("50�� �̻��Դϴ�");
			break;
		case 4:
			System.out.println("40�� �̻��Դϴ�");
			break;
		case 3:
			System.out.println("30�� �̻��Դϴ�");
			break;
		default:
			System.out.println("������ �ϼ���");
			break;
		}
	}
	
	

}
