package runJava.ch14.thisisjava_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

///********** NoResultExample , ���ϰ��� ���� �۾� �Ϸ� �뺸 ***********////



public class NoResultExample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {

					sum += i;

				}
				System.out.println("������� : " + sum);
			}
		}; // runnable ���� ��

		Future future = executorService.submit(runnable);
		

		try {
			
			future.get();
			System.out.println("�۾� ó�� �Ϸ�");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�۾� ó�� ���� �߻���");
		}

		executorService.shutdown();
	}// ���� �޼ҵ� ����

}
