package runJava.ch14.thisisjava_12;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


// * CallbackExample , 콜백 방식의 작업 완료 통보 받기


public class CallbackExample {
	
	ExecutorService executorService;
	
	public CallbackExample() {
		executorService = Executors.newFixedThreadPool(3);
	}
	
	CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
		
		@Override
		public void failed(Throwable exc, Void attachment) {
			
			System.out.println("failed 실행"+exc);
		}
		
		@Override
		public void completed(Integer result, Void attachment) {
			
			System.out.println("completed 실행" + "결과값 " + result);
		}
	}; //callback 정의
	
	public void dowork(String x, String y){
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
			
				try {
					int intx = Integer.parseInt(x);
					int inty = Integer.parseInt(y);
					int result = intx+inty;
					callback.completed(result,null);
					
				} catch (Exception e) {
					// TODO: handle exception
					callback.failed(e, null);
				}
				
				
				
			}
		}; //runnable 정의
		
		executorService.submit(runnable);
		
		
	} //do 메소드

	public void finish(){
		executorService.shutdown();
	}
	public static void main(String[] args) {
		
		CallbackExample example = new CallbackExample();
		
		example.dowork("3", "3");
		example.dowork("삼", "삼");
		example.finish();
		
	}
	
	

}
