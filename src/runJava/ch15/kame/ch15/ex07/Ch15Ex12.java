package runJava.ch15.kame.ch15.ex07;


//**************StringBuffer Ŭ������ �پ��� �޼ҵ�� ************
public class Ch15Ex12 {

	public static void main(String[] args) {
		StringBuffer str= new StringBuffer(
				"�������� ����ϱ� ���ؼ� ������ �����̾�� �ߴ�.");
		
		System.out.println(str);
		
		//StringBuffer Ŭ������ insert �޼ҵ�
		//�������� ����ϱ� ���ؼ� ==>14��°
		str.insert(14, "�� ���� ");
		System.out.println(str);
		
		
		//delete �޼ҵ� 0��°���� 1��° ������ ����
		str.delete(0, 1);
		System.out.println(str);
		
		
		//deleteCharAt ������ ����ϱ� 0,1,2,3,4,5,6,7
		str.deleteCharAt(7);
		System.out.println(str);
		
		// ������
		str.reverse();
		System.out.println(str);
		
	}
	
}
