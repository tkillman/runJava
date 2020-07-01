package runJava.ch14.thisisjava_12;

import java.util.Map;
import java.util.Set;

/// ********* ThreadInfoExample , AutoSaveThread *******************
// Thread의 그룹 상태를 보는 방법.

public class ThreadInfoExample {

	public static void main(String[] args) {

		AutoSaveThread ast = new AutoSaveThread();
		ast.setName("AutoSaveThread");
		ast.setDaemon(true); // 메인 쓰레드가 종료되면 자동으로 종료

		ast.start();

		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();  
		//돌아가는 모든쓰레드의 정보가 map 타입 (키:Thread, 값 : StackTraceElements[] )를 반환
																			

		Set<Thread> threads = map.keySet();

		for (Thread t : threads) {

			System.out.println("Thread 이름 : " + t.getName());
			System.out.println(t.isDaemon()? "데몬" : "주");
			System.out.println("Thread 그룹 이름 : " + t.getThreadGroup().getName());
		}

	}

}
