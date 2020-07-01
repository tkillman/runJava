package runJava.ch14.thisisjava_12;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

///********* ResultByCallableExample , 리턴값이 존재하는 작업 완료 통보*********////////
// 1. Callable 정의
// 2. ExecutorService에 submit 한 것을 Future로 받음
// 3. Future 객체의 get() 메소드로 받는다.




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
		}; //callable 정의 끝 
		
		Future<Integer> future = executorService.submit(callable);
		
		
		try {
			int sum = future.get();
			System.out.println("작업결과"+sum +" 작업 완료");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("작업 쓰레드가 interrupted 됨");
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("코드에 예외가 발생");
		}
		
		executorService.shutdown();
	}//메인 메소드 종료
	

} //클래스 종료
