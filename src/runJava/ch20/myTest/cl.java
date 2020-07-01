package runJava.ch20.myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class cl {

	public static void main(String[] args) {
		
			ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				while(true){
				try {

					Socket socket = new Socket("127.0.0.1", 5001);
					System.out.println("클라이언트가 연결 성공1");
					
					OutputStream outputStream = socket.getOutputStream();
					
					
					
					InputStream inputStream = System.in;
					InputStreamReader isr = new InputStreamReader(inputStream);
					BufferedReader br = new BufferedReader(isr);
					String sendMsg = br.readLine();
					
					
					
					//입력 받은 것
					//System.out.println(sendMsg);
					
					
					
					outputStream.write(sendMsg.getBytes());
					outputStream.flush();
					outputStream.close();
					socket.close();
					System.out.println("클라이언트 1 소켓 닫음");
					//System.out.println("소켓 닫음");	
				
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			} //run 메소드
		}; // Runnable 종료
		
		Runnable runnable2 = new Runnable() {

			@Override
			public void run() {
				while(true){
				try {

					Socket socket = new Socket("127.0.0.1", 5001);
					System.out.println("클라이언트 연결 성공2");
					
					InputStream inputStream = socket.getInputStream();
					
					byte[] byteArr = new byte[200];
					int size = inputStream.read(byteArr);
					
					String reMsg = new String(byteArr, 0, size);
					
					//입력 받은 것 출력
					System.out.println(reMsg);						
					//System.out.println("받은 메세지 출력");
					
					inputStream.close();
					socket.close();
					System.out.println("클라이언트 소켓 2 닫음");
				} catch (IOException e) {
					// TODO Auto-generated catch bloock
					e.printStackTrace();
				}
				}
			} //run 메소드
		}; // Runnable2 종료
		executorService.submit(runnable2);
			executorService.submit(runnable);	
	}// 메인 메소드 종료

} // 클래스 종료
