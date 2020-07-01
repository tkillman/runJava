package runJava.ch14.thisisjava_12;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


// * CallbackExample , �ݹ� ����� �۾� �Ϸ� �뺸 �ޱ�


public class CallbackExample {
	
	ExecutorService executorService;
	
	public CallbackExample() {
		executorService = Executors.newFixedThreadPool(3);
	}
	
	CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
		
		@Override
		public void failed(Throwable exc, Void attachment) {
			
			System.out.println("failed ����"+exc);
		}
		
		@Override
		public void completed(Integer result, Void attachment) {
			
			System.out.println("completed ����" + "����� " + result);
		}
	}; //callback ����
	
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
		}; //runnable ����
		
		executorService.submit(runnable);
		
		
	} //do �޼ҵ�

	public void finish(){
		executorService.shutdown();
	}
	public static void main(String[] args) {
		
		CallbackExample example = new CallbackExample();
		
		example.dowork("3", "3");
		example.dowork("��", "��");
		example.finish();
		
	}
	
	

}
