package runJava.ch14.thisisjava_12;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//***********CompletionServiceExample ****************/////
// *** �۾� �Ϸ� ������ �뺸�ޱ�  ****///////////////////////
// *** 1.executorService ��ü ����
// *** 2. CompletionService ��ü ����
// *** 3. ó���� �� �۾��� CompletionService���� �����ϰ�
// ** 4. ����� ����� executorService���� �޾Ƽ� �����Ѵ�.



public class CompletionServiceExample {

	public static void main(String[] args) {

		/*
		 * ExecutorService executorService = Executors.newFixedThreadPool(2);
		 * 
		 * for(int j=0;j<3;j++){ Callable<Integer> callable = new
		 * Callable<Integer>() {
		 * 
		 * @Override public Integer call() throws Exception { int sum =0;
		 * for(int i=1;i<=10;i++){ sum+=i; } System.out.println("ó�� ������ " +
		 * Thread.currentThread().getName()); return sum; } }; //collable ��
		 * 
		 * Future<Integer> future =executorService.submit(callable);
		 * 
		 * 
		 * try { int sum = future.get();
		 * 
		 * System.out.println("ó�� ����� " +sum); } catch (InterruptedException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); } catch
		 * (ExecutionException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * }//for�� ����
		 */

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		CompletionService<Integer> completionService = new ExecutorCompletionService<>(executorService);

		for (int j = 0; j < 10; j++) {
			Callable<Integer> callable = new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for (int i = 1; i <= 10; i++) {
						sum += i;
					}
					System.out.println("ó�� ������ " + Thread.currentThread().getName());
					return sum;
				}
			}; // callable ��

			completionService.submit(callable);
		} // 3�� completionService�� ���� ����

		
		executorService.submit(new Runnable() {

			@Override
			public void run() {
				
				while (true) {

					Future<Integer> future;
					
					try {
						
						future = completionService.take();
						int num = future.get();
						System.out.println("ó�� ������ " + Thread.currentThread().getName() +" �۾� ó�� ��� : " + num);
						
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						break;

					}

				}

			}
			
		});
		
		
	
		
		
		
		
	}// ���� �޼ҵ� ����

}
