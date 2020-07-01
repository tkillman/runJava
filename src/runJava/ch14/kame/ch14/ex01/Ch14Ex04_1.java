package runJava.ch14.kame.ch14.ex01;

//*******��Ƽ �����带 ����� 3���� ���******************//
//1. Thread�� ��ӹ޾Ƽ� run �޼ҵ� ������ �� �������� ��ü ���� �� start �޼ҵ� ȣ��
//2. runnable�� implements �� ���� run �޼ҵ� �� ���� �� ������ ��ü�� ���ڰ����� ���� �� �������� start �޼ҵ� ȣ��
//3. ���ٽ��� �̿�

//************ ���� ����� ������ Runnable �������̽� *************///////
// 1.runnable�� implements
// 2. run �޼ҵ� �������̵�
// 3. runnable�� implements �� Ŭ������ ��ü ����
// 4. Thread�� ��ü�� �����ϴµ� 3���� ������ ��ü�� Thread �������� ���ڷ� ����
// 5. ������ Thread ��ü�� start() �޼ҵ� ȣ��
// public Thread() -- ������ ����
// public Thread(String name) -- name�� �̸����� ���� ���ο� ������ ����
// public Thread(Runnable r1) -- runnable �������̽��� run�� ȣ���ϴ� ������ ����
// public Thread(Runnable r1,String name) -- runnable �������̽��� run�� ȣ���ϰ� name�� �̸����� ���� ������ ����


/////************** ���ٽ��� �̿��� ����***************//////////////////
public class Ch14Ex04_1 {

	public static void main(String[] args) { // 3.���� �޼ҵ忡�� Runnable �������̽��� ������
		int k=0;										// RunableEx01Ŭ���� �� ��ü ����
		System.out.println(">>���� �޼ҵ� ����<<");
		
		
		
		Thread t1 = new Thread(() -> { // runnable���� �Ű������� ���� run�޼ҵ� �ϳ��̱� ������ ()ǥ������
			
			int a = 0;
			System.out.println(">>run �޼ҵ� ���� <<");
			while (true) {

				try {
					Thread.sleep(300);

				} catch (InterruptedException e) {
					e.printStackTrace();

				}

				System.out.println(Thread.currentThread().getName() + ":" + ++a); // ����
																					// ��������
																					// ������
																					// �̸�
																					// ���
																					// �޼ҵ�

				if (a >= 5)
					break;

			}
			System.out.println(">>run �޼ҵ� ����<<");

		},"hello"); // 4.Thread ��ü�� �����ϴµ� �������� �������ڷ� 3���� ������ ��ü�� �ش�.
		
		t1.start(); // 4���� ������ ��ü�� start �޼ҵ带 ȣ��
		
		//���� �޼ҵ�
		for(int i=0;i<5;i++){
			k++;
			Thread t= Thread.currentThread();
			System.out.println(t.getName()+"�޼ҵ� : " +k);
		}
		
		
		System.out.println(">>���� �޼ҵ� ����<<");
	}

}
