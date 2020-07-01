package runJava.ch14.thisisjava_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

///************* ExecuteExample
//������ Ǯ�� ����� ����� ������ Ǯ�� ���� ���¹�**********///////
//1. ExecutorService �������̽��� Executors ���� �޼ҵ� nexFixedThreadPool�� ���.



public class ExecuteExample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
		
		
		for(int i=0;i<10;i++){
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				int poolSize = threadPoolExecutor.getPoolSize();
				
				String threadName = Thread.currentThread().getName();
				System.out.println("�� ������ ������ : " + poolSize +" �۾� ó�� - " + threadName);
				int value = Integer.parseInt("��");

			}
		};

		//executorService.execute(runnable);
		//���ܰ� �߻��� ��� �����带 ���ְ� ���ο� �����带 ���� ���
		// thread �̸��� �޶����� ���� �� �� �ִ�.
		executorService.submit(runnable);
		//���ܰ� �߻��ϴ��� �����带 ������ �ʴ´�.
		
		}
		
		executorService.shutdown();

	}

}
