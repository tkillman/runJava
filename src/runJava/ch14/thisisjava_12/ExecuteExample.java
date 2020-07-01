package runJava.ch14.thisisjava_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

///************* ExecuteExample
//쓰레드 풀을 만드는 방법과 쓰레드 풀의 갯수 세는법**********///////
//1. ExecutorService 인터페이스와 Executors 정적 메소드 nexFixedThreadPool을 사용.



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
				System.out.println("총 쓰레드 개수는 : " + poolSize +" 작업 처리 - " + threadName);
				int value = Integer.parseInt("삼");

			}
		};

		//executorService.execute(runnable);
		//예외가 발생한 경우 쓰레드를 없애고 새로운 쓰레드를 만들어서 사용
		// thread 이름이 달라지는 것을 볼 수 있다.
		executorService.submit(runnable);
		//예외가 발생하더라도 쓰레드를 없애지 않는다.
		
		}
		
		executorService.shutdown();

	}

}
