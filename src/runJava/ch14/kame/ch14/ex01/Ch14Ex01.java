package runJava.ch14.kame.ch14.ex01;

//****** ������ ���� ���*******////
/*1.Thread Ŭ������ ��ӹ޴´�.
2.run �޼ҵ带 �������̵� �ؼ� ������ ��ü�� � �۾��� ���� ����Ѵ�.
3.main�޼ҵ忡�� �����带 ��ӹ��� Ŭ������ ��ü�� �����Ѵ�.
4. 3�ܰ迡�� ������ ��ü�� start �޼ҵ带 ȣ���Ѵ�.

*/

//********************** ���� ������ ����**********************////

/*NoThreadExam01 Ŭ������ ������ Ŭ������ ��ӹ��� �ʾҴ�. 
   * �Ϲ����� ��ü�� �����Ͽ� run �޼ҵ带 ���� �����Ű�� 
   run �޼ҵ尡 ���� �� �� ���� �޼ҵ尡 �����Ѵ�.
  	�̰� ���� ������� �����Ѵٰ� �Ѵ�.
*/

class NoThreadExam01 {

	public void run() {
		int a = 0;
		System.out.println(">>run �޼ҵ� ����<<");
		while (true) {

			for (int k = 1; k < 100000000; k++)
				; // ���� �ð��� ���ϴ� �۾�
			System.out.println("NoThreadExam01�� a :" + ++a);
			if (a >= 5)
				break;

		}
		System.out.println(">>run �޼ҵ� ����<<");

	}

}

public class Ch14Ex01 {

	public static void main(String[] args) {

		System.out.println(">>---main ������ ���� ����---<<");
		
		NoThreadExam01 t1 = new NoThreadExam01();
		t1.run();

		int b = 0;
		while (true) {
			for (int k = 1; k < 1000000; k++)
				; // ���� �ð��� ���ϴ� �۾�
			System.out.println("main �� b:" + ++b);
			if (b >= 5)
				break;

		}
		System.out.println(">>---���� ������ ���� ����---<<");

	}

}
