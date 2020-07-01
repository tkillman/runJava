package runJava.ch20.myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//?********** 문제점 : 정확히 원하는 방향으로 소켓이 연결되지 않으면 문제 발생.*******
// ** 서버 2와 클라이언트 1이 연결되어야 함, 서버1과 클라이언트2가 연결되어야 함......

public class server {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(5001);

			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					try {
						while (true) {
							
					
							Socket socket = serverSocket.accept();
							System.out.println("서버1에 소켓이 들어옴");
							OutputStream outputStream = socket.getOutputStream();

							InputStream inputStream = System.in;
							InputStreamReader isr = new InputStreamReader(inputStream);
							BufferedReader br = new BufferedReader(isr);
							String sendMsg = br.readLine();
							
							
							//입력 받은 것 써주기
							//System.out.println(sendMsg);
							
							
							outputStream.write(sendMsg.getBytes());
							outputStream.flush();
							outputStream.close();
							System.out.println("서버 1 소켓 닫힘");
							socket.close();
							
						}

					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}

				} // run 메소드
			}; // Runnable

			Runnable runnable2 = new Runnable() {

				@Override
				public void run() {
					try {
						while (true) {
						
							Socket socket = serverSocket.accept();
							System.out.println("서버2에 소켓이 들어옴");
							
							
							InputStream inputStream = socket.getInputStream();
							
							byte[] byteArr = new byte[200];
							
							int size = inputStream.read(byteArr);
							
							String reMsg = new String(byteArr, 0, size);
							
							
							//받은 메세지 출력
							System.out.println(reMsg);	
							//System.out.println("받은 메세지 출력");
							inputStream.close();
							socket.close();
							System.out.println("서버2 소켓 닫힘");
						}

					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}

				} // run 메소드
			}; // Runnable2

			
			ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
			executorService.submit(runnable2);
			executorService.submit(runnable);
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
