package runJava.ch14.thisisjava_12;

import java.util.Map;
import java.util.Set;

/// ********* ThreadInfoExample , AutoSaveThread *******************
// Thread�� �׷� ���¸� ���� ���.

public class ThreadInfoExample {

	public static void main(String[] args) {

		AutoSaveThread ast = new AutoSaveThread();
		ast.setName("AutoSaveThread");
		ast.setDaemon(true); // ���� �����尡 ����Ǹ� �ڵ����� ����

		ast.start();

		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();  
		//���ư��� ��羲������ ������ map Ÿ�� (Ű:Thread, �� : StackTraceElements[] )�� ��ȯ
																			

		Set<Thread> threads = map.keySet();

		for (Thread t : threads) {

			System.out.println("Thread �̸� : " + t.getName());
			System.out.println(t.isDaemon()? "����" : "��");
			System.out.println("Thread �׷� �̸� : " + t.getThreadGroup().getName());
		}

	}

}
