package runJava.ch14.thisisjava_12;


////******* AutoSaveThread, DaemonExample ****////
//setDaemon �޼ҵ� ���� �� �� �޼ҵ带 �θ� �����忡 �������� �� �����尡 ������� �ٸ� �����嵵 ���� ������.

public class DaemonExample {
	
	public static void main(String[] args) {
		
		AutoSaveThread ast = new AutoSaveThread();
		
		ast.setDaemon(true); //!!! �׻� �������� ������ �����带 �����ϱ� ���� �������־�� �Ѵ�.
		
		ast.start(); // 
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(ast.isDaemon()); // ���� �����ΰ��� true, false�� ��ȯ
		System.out.println("���� �޼ҵ尡 �����");
		
		
		
		
	}
	
	

}
