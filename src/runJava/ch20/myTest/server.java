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


//?********** ������ : ��Ȯ�� ���ϴ� �������� ������ ������� ������ ���� �߻�.*******
// ** ���� 2�� Ŭ���̾�Ʈ 1�� ����Ǿ�� ��, ����1�� Ŭ���̾�Ʈ2�� ����Ǿ�� ��......

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
							System.out.println("����1�� ������ ����");
							OutputStream outputStream = socket.getOutputStream();

							InputStream inputStream = System.in;
							InputStreamReader isr = new InputStreamReader(inputStream);
							BufferedReader br = new BufferedReader(isr);
							String sendMsg = br.readLine();
							
							
							//�Է� ���� �� ���ֱ�
							//System.out.println(sendMsg);
							
							
							outputStream.write(sendMsg.getBytes());
							outputStream.flush();
							outputStream.close();
							System.out.println("���� 1 ���� ����");
							socket.close();
							
						}

					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}

				} // run �޼ҵ�
			}; // Runnable

			Runnable runnable2 = new Runnable() {

				@Override
				public void run() {
					try {
						while (true) {
						
							Socket socket = serverSocket.accept();
							System.out.println("����2�� ������ ����");
							
							
							InputStream inputStream = socket.getInputStream();
							
							byte[] byteArr = new byte[200];
							
							int size = inputStream.read(byteArr);
							
							String reMsg = new String(byteArr, 0, size);
							
							
							//���� �޼��� ���
							System.out.println(reMsg);	
							//System.out.println("���� �޼��� ���");
							inputStream.close();
							socket.close();
							System.out.println("����2 ���� ����");
						}

					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}

				} // run �޼ҵ�
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
