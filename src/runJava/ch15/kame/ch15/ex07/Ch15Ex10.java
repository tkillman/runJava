package runJava.ch15.kame.ch15.ex07;

//************String Ŭ������ �پ��� �޼ҵ��*********
// ******** Ư¡ String�� ��ü���� ������ �ʴ´�.

public class Ch15Ex10 {
	

	public static void main(String[] args) {
		
		String str= new String("����");
		System.out.println(str); // ���� ���
		
		// String Ŭ������ concat() �޼ҵ� : ���� ���ڿ� �ٿ��� ���
		String str1=str.concat("���̷���");
		System.out.println(str1); //���ǹ��̷��� ���
		
		
		//length() �޼ҵ�: ���� ���̷��� ���� ���==> 6����
		int len= str1.length();
		System.out.println(len); // 6 ���
		
		
		// charAt(int a) �޼ҵ�: a ��° ���ڸ� ���
		char ch= str1.charAt(2); 
		System.out.println(ch); // ���ǹ� 0,1,2
		
		//indexOf(����) �޼ҵ� : ���ڰ� ���°�� ��ġ�� �ִ��� ��ġ ���
 		int pos=str1.indexOf(ch);
		System.out.println(pos);
		
		// substring(int a) �޼ҵ� : 3��°���� ��� ���ǹ��� 0,1,2,3
		String str2= str1.substring(3);
		System.out.println(str2);
		
		
		// substring(int a, int b) �޼ҵ�: 2��°���� 3��°���� ��� ���ǹ��̷� 0,1,2,3,4
		String str3=str1.substring(2, 4);
		System.out.println(str3);
	}
	
}
