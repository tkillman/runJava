package runJava.ch14.thisisjava_12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//******** ResultByRunnableExample , 작업 처리 결과를 외부 객체에 저장 *********////////
// ****** 1. 쓰레드풀 생성
// ****   2.공유할 객체 클래스 설계 
// *** 3. 쓰레드 작업을 수행할 클래스 설계하고 공유 객체를 생성자에서 받는다.
//*** 4. 쓰레드 작업을 쓰레드풀에 넣어서 수행하고 결과값을 받는다.
// ***


public class ResultByRunnableExample {
	
	public static void main(String[] args) {
		// 1. 쓰레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(2);
			
		// *** 3. 쓰레드 작업을 수행할 클래스 설계하고 공유 객체를 생성자에서 받는다.
		Result result = new Result();
		Task task1 = new Task(result);
		Task task2 = new Task(result);
		
		System.out.println("작업 처리 요청");
		Future<Result> future1 =executorService.submit(task1, result);
		Future<Result> future2 =executorService.submit(task2, result);
		
		
		try {
			//*** 4. 쓰레드 작업을 쓰레드풀에 넣어서 수행하고 결과값을 받는다.
			result = future1.get(); //작업 1이 끝났을 때 작업 처리 결과 result를 반환
			result = future2.get(); // 작업 2이 끝났을 때 result를 반환 작업 1이 끝난 result를 가지고 작업 2가 수행됐기 때문에 최종 result 객체가 반환
			
			System.out.println(result.num);
			System.out.println("작업 처리 완료");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		executorService.shutdown();
	} //메인 메소드 종료

	
}// 메인 클라스 종료


class Task implements Runnable{
	Result result;
	// *** 3. 쓰레드 작업을 수행할 클래스 설계하고 공유 객체를 생성자에서 받는다.
	public Task(Result result) {
	this.result =result;
	}
	
	
	@Override
	public void run() {
		int size=0;
		for(int i=1;i<=10;i++){
			size+=i;
		}
		result.addValue(size);
		
	}
	
}

//2.공유할 객체 클래스 설계 
class Result{
	int num;
	
	synchronized void addValue(int size){
		num+=size;
	}
}
