package runJava.ch14.kame.ch14.ex01;

//****************** ���� ������*****************////////

/*Ch14Ex01���� �ٸ��� ThreadExam01�� Thread Ŭ������ ��ӹ޾Ұ�
run �޼ҵ带 �������̵� �ߴ�. ���� ���� �޼ҵ忡�� run �޼ҵ带 �����Ű�� ����
start �޼ҵ带 ȣ���Ű�� ���� �� �� �־���.

�̷��� Thread Ŭ������ ��ӹ��� �� �����Ű�� run �޼ҵ尡 �����߿� 
main �޼ҵ嵵 ���� �����ϴ� ���� ���Ѻ� �� �ִ�.
�̸� ���� �������� �Ѵ�.
*/

class ThreadExam01 extends Thread {

	public void run() {

		int a = 0;
		System.out.println(">>run �޼ҵ� ����<<");
		while (true) {

			for (int k = 1; k < 100; k++)
				; // ���� �ð��� ���ϴ� �۾�
			System.out.println("ThreadExam01�� a :" + ++a);
			if (a >= 10)
				break;

		}

		System.out.println(">>run �޼ҵ� ����<<");

	}

}

public class Ch14Ex02 {

	public static void main(String[] args) {

		System.out.println(">>---main ������ ���� ����---<<");
		ThreadExam01 t1 = new ThreadExam01();
		System.out.println(">>�Ǵٸ� �����带 ���۽�Ŵ<<");
		t1.start();///// *******************************************////

		int b = 0;
		while (true) {
			for (int k = 1; k < 100; k++)
				; // ���� �ð��� ���ϴ� �۾�
			System.out.println("main �� b:" + ++b);
			if (b >= 10)
				break;

		}
		System.out.println(">>---���� ������ ���� ����---<<");

	}

}
