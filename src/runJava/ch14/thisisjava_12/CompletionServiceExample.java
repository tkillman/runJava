package runJava.ch14.thisisjava_12;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//***********CompletionServiceExample ****************/////
// *** 작업 완료 순으로 통보받기  ****///////////////////////
// *** 1.executorService 객체 생성
// *** 2. CompletionService 객체 생성
// *** 3. 처리해 줄 작업을 CompletionService에서 수행하고
// ** 4. 결과값 출력을 executorService에서 받아서 수행한다.



public class CompletionServiceExample {

	public static void main(String[] args) {

		/*
		 * ExecutorService executorService = Executors.newFixedThreadPool(2);
		 * 
		 * for(int j=0;j<3;j++){ Callable<Integer> callable = new
		 * Callable<Integer>() {
		 * 
		 * @Override public Integer call() throws Exception { int sum =0;
		 * for(int i=1;i<=10;i++){ sum+=i; } System.out.println("처리 쓰레드 " +
		 * Thread.currentThread().getName()); return sum; } }; //collable 끝
		 * 
		 * Future<Integer> future =executorService.submit(callable);
		 * 
		 * 
		 * try { int sum = future.get();
		 * 
		 * System.out.println("처리 결과값 " +sum); } catch (InterruptedException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); } catch
		 * (ExecutionException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * }//for문 종료
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
					System.out.println("처리 쓰레드 " + Thread.currentThread().getName());
					return sum;
				}
			}; // callable 끝

			completionService.submit(callable);
		} // 3번 completionService에 집어 넣음

		
		executorService.submit(new Runnable() {

			@Override
			public void run() {
				
				while (true) {

					Future<Integer> future;
					
					try {
						
						future = completionService.take();
						int num = future.get();
						System.out.println("처리 쓰레드 " + Thread.currentThread().getName() +" 작업 처리 결과 : " + num);
						
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						break;

					}

				}

			}
			
		});
		
		
	
		
		
		
		
	}// 메인 메소드 종료

}
