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
					System.out.println("Ŭ���̾�Ʈ�� ���� ����1");
					
					OutputStream outputStream = socket.getOutputStream();
					
					
					
					InputStream inputStream = System.in;
					InputStreamReader isr = new InputStreamReader(inputStream);
					BufferedReader br = new BufferedReader(isr);
					String sendMsg = br.readLine();
					
					
					
					//�Է� ���� ��
					//System.out.println(sendMsg);
					
					
					
					outputStream.write(sendMsg.getBytes());
					outputStream.flush();
					outputStream.close();
					socket.close();
					System.out.println("Ŭ���̾�Ʈ 1 ���� ����");
					//System.out.println("���� ����");	
				
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			} //run �޼ҵ�
		}; // Runnable ����
		
		Runnable runnable2 = new Runnable() {

			@Override
			public void run() {
				while(true){
				try {

					Socket socket = new Socket("127.0.0.1", 5001);
					System.out.println("Ŭ���̾�Ʈ ���� ����2");
					
					InputStream inputStream = socket.getInputStream();
					
					byte[] byteArr = new byte[200];
					int size = inputStream.read(byteArr);
					
					String reMsg = new String(byteArr, 0, size);
					
					//�Է� ���� �� ���
					System.out.println(reMsg);						
					//System.out.println("���� �޼��� ���");
					
					inputStream.close();
					socket.close();
					System.out.println("Ŭ���̾�Ʈ ���� 2 ����");
				} catch (IOException e) {
					// TODO Auto-generated catch bloock
					e.printStackTrace();
				}
				}
			} //run �޼ҵ�
		}; // Runnable2 ����
		executorService.submit(runnable2);
			executorService.submit(runnable);	
	}// ���� �޼ҵ� ����

} // Ŭ���� ����
