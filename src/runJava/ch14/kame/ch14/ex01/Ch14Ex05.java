package runJava.ch14.kame.ch14.ex01;

//************ Thread�� �켱��**************

// setPriority() �޼ҵ�

public class Ch14Ex05 {
	
	// ���� �����忡�� �켱���� �ִ� ���
	public static void main(String[] args) {
		
		RunableExam01 r1=new RunableExam01();
		RunableExam01 r2=new RunableExam01();
		RunableExam01 r3=new RunableExam01();
		Thread t1= new Thread(r1, "ù��° ������");
		Thread t2= new Thread(r1, "�ι�° ������");
		Thread t3= new Thread(r1, "����° ������");
		t2.setPriority(Thread.MAX_PRIORITY); // *****************�� ��° �����尡 ���� ���� ����ȴ�.**************���� ����
						//Thread.MIN_PRIORITY
						//Thread.NORM_PRIORITY
		t1.start();
		t2.start();
		t3.start();
		
	}
	

}
