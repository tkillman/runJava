package runJava.ch14.thisisjava_12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//******** ResultByRunnableExample , �۾� ó�� ����� �ܺ� ��ü�� ���� *********////////
// ****** 1. ������Ǯ ����
// ****   2.������ ��ü Ŭ���� ���� 
// *** 3. ������ �۾��� ������ Ŭ���� �����ϰ� ���� ��ü�� �����ڿ��� �޴´�.
//*** 4. ������ �۾��� ������Ǯ�� �־ �����ϰ� ������� �޴´�.
// ***


public class ResultByRunnableExample {
	
	public static void main(String[] args) {
		// 1. ������Ǯ ����
		ExecutorService executorService = Executors.newFixedThreadPool(2);
			
		// *** 3. ������ �۾��� ������ Ŭ���� �����ϰ� ���� ��ü�� �����ڿ��� �޴´�.
		Result result = new Result();
		Task task1 = new Task(result);
		Task task2 = new Task(result);
		
		System.out.println("�۾� ó�� ��û");
		Future<Result> future1 =executorService.submit(task1, result);
		Future<Result> future2 =executorService.submit(task2, result);
		
		
		try {
			//*** 4. ������ �۾��� ������Ǯ�� �־ �����ϰ� ������� �޴´�.
			result = future1.get(); //�۾� 1�� ������ �� �۾� ó�� ��� result�� ��ȯ
			result = future2.get(); // �۾� 2�� ������ �� result�� ��ȯ �۾� 1�� ���� result�� ������ �۾� 2�� ����Ʊ� ������ ���� result ��ü�� ��ȯ
			
			System.out.println(result.num);
			System.out.println("�۾� ó�� �Ϸ�");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		executorService.shutdown();
	} //���� �޼ҵ� ����

	
}// ���� Ŭ�� ����


class Task implements Runnable{
	Result result;
	// *** 3. ������ �۾��� ������ Ŭ���� �����ϰ� ���� ��ü�� �����ڿ��� �޴´�.
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

//2.������ ��ü Ŭ���� ���� 
class Result{
	int num;
	
	synchronized void addValue(int size){
		num+=size;
	}
}
