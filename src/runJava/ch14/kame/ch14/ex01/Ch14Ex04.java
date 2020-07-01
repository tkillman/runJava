package runJava.ch14.kame.ch14.ex01;

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


class RunableExam01 implements Runnable {
	//1. Runnable �������̽��� ������ RunableExam01 Ŭ������ �ۼ�
	
	@Override // 2. run �޼ҵ带 �������̵��Ѵ�. ������ ��ü�� � �۾��� �� �� ���.
	public void run() {
		int a=0;
		System.out.println(">>run �޼ҵ� ���� <<");
		while(true){
			
		try {
			Thread.sleep(300);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}	
			
	System.out.println(Thread.currentThread().getName() +":" + ++a);	//���� �������� ������ �̸� ��� �޼ҵ�
	
	if(a >=5)	
	break;
	
		}
	System.out.println(">>run �޼ҵ� ����<<");
	}
}

	public class Ch14Ex04 {
		
		public static void main(String[] args) { //3.���� �޼ҵ忡�� Runnable �������̽��� ������ RunableEx01Ŭ���� �� ��ü ����
			System.out.println(">>���� �޼ҵ� ����<<");
			RunableExam01 r1=new RunableExam01();
			RunableExam01 r2=new RunableExam01();
			RunableExam01 r3=new RunableExam01();
			
			Thread t1= new Thread(r1, "ù��° ������"); //4.Thread ��ü�� �����ϴµ� �������� �������ڷ� 3���� ������ ��ü�� �ش�.
			Thread t2= new Thread(r1, "�ι�° ������"); // Thread�� ������ ���� �� 4��°
			Thread t3= new Thread(r1, "����° ������");
			
			t1.start(); // 4���� ������ ��ü�� start �޼ҵ带 ȣ��
			t2.start();
			t3.start();
			System.out.println(">>���� �޼ҵ� ����<<");
		}
		
	}
