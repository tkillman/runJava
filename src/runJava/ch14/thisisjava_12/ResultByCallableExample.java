package runJava.ch14.thisisjava_12;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

///********* ResultByCallableExample , ���ϰ��� �����ϴ� �۾� �Ϸ� �뺸*********////////
// 1. Callable ����
// 2. ExecutorService�� submit �� ���� Future�� ����
// 3. Future ��ü�� get() �޼ҵ�� �޴´�.




public class ResultByCallableExample {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Callable<Integer> callable = new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				int sum=0;
				for(int i=1;i<=10;i++){
					sum+=i;
				}
				return sum;
			}
		}; //callable ���� �� 
		
		Future<Integer> future = executorService.submit(callable);
		
		
		try {
			int sum = future.get();
			System.out.println("�۾����"+sum +" �۾� �Ϸ�");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�۾� �����尡 interrupted ��");
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ڵ忡 ���ܰ� �߻�");
		}
		
		executorService.shutdown();
	}//���� �޼ҵ� ����
	

} //Ŭ���� ����
