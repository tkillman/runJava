package runJava.ch14.thisisjava_12;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample_m {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		CompletionService<Integer> completionService = new ExecutorCompletionService<>(executorService);
		
		for(int j=0;j<50;j++){
		
			Callable<Integer> callable = new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				int sum=0;
				for(int i=1;i<=10;i++){
						sum+=i;
					
				}
				
				System.out.println("처리 쓰레드 " + Thread.currentThread().getName() +"결과값 :" + sum);
				return sum;
			}
		}; //callable 정의
		
		completionService.submit(callable);
		}
		
		
		
		executorService.submit(new Runnable() {
			
			@Override
			public void run() {
				while(true){
				try {
					Future<Integer> future =completionService.take();
					int sum =future.get();
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				}
			}
		});
		
		
	}
	

}
