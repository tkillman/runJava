package runJava.ch14.thisisjava_12;


////******* AutoSaveThread, DaemonExample ****////
//setDaemon 메소드 실행 시 그 메소드를 부른 쓰레드에 속해져서 그 쓰레드가 꺼질경우 다른 쓰레드도 같이 꺼진다.

public class DaemonExample {
	
	public static void main(String[] args) {
		
		AutoSaveThread ast = new AutoSaveThread();
		
		ast.setDaemon(true); //!!! 항상 데몬으로 설정은 쓰레드를 실행하기 전에 세팅해주어야 한다.
		
		ast.start(); // 
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(ast.isDaemon()); // 데몬 상태인가를 true, false로 반환
		System.out.println("메인 메소드가 종료됨");
		
		
		
		
	}
	
	

}
