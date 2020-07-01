package runJava.ch14.thisisjava_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

///********** NoResultExample , 리턴값이 없는 작업 완료 통보 ***********////



public class NoResultExample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {

					sum += i;

				}
				System.out.println("결과값은 : " + sum);
			}
		}; // runnable 정의 끝

		Future future = executorService.submit(runnable);
		

		try {
			
			future.get();
			System.out.println("작업 처리 완료");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("작업 처리 예외 발생함");
		}

		executorService.shutdown();
	}// 메인 메소드 종료

}
