package runJava.ch13;


//// ************** throw���� ���� �߻���Ű��*****************

// throw�� ����ڰ� ���� ���ܸ� �߻���Ű�� ���� �� ����ϴ� Ű����

public class Ch13Ex07 {

	public static void throwException(){
		
		try {
			
			System.out.println(">>throwException �Լ�ȣ��<<");
			throw new Exception("����ڰ� ���� �߻���Ŵ");
			
		} catch (Exception e) {
			System.out.println(">>cathch ���� : ���ܸ� ó���Ѵ�. <<");
			System.out.println(e);
		
		} 
		
	} // throwException �޼ҵ� ����
	
	public static void main(String[] args) {
		System.out.println(">>main �Լ����� ���ܸ� �߻���Ű�� �Լ� ȣ��<<");
		
		throwException(); // ���� �߻� �Լ�
		System.out.println(">>��������<<");
	}
	
}
