package runJava.ch14.kame.ch14.ex01;

//main �޼ҵ嵵 thread�� �� �����̴�.
// getName() �޼ҵ�, currentThread(); �޼ҵ�

//********* Thread �޼ҵ�� ����غ���************
public class Ch14Ex03 {
	
	public static void main(String[] args) {
		
		//getName()�� �ν��Ͻ� �޼ҵ��̱� ������ ��ü�� ���� ����� �ʿ䰡 �־
		// currentThread()�� ���ؼ� ���� �������� �������� ��ü�� �������� ���´�. 
		Thread t= Thread.currentThread();
		
		System.out.println("���� �������� ������:" + t.getName());
		
	}

}



