package runJava.ch20.myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTask {

	Socket s;

	void add(Socket s) {
		this.s = s;
		System.out.println("��ü ����");
		
	}

	void send() {
	
		System.out.println("Ŭ���̾�Ʈ send �޼ҵ� ȣ���");
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						OutputStream os = s.getOutputStream();

						InputStream is = System.in;
						InputStreamReader isr = new InputStreamReader(is);
						BufferedReader br = new BufferedReader(isr);
						String data = br.readLine();

						os.write(data.getBytes());
						os.flush();

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						break;
					}

				}

			}
		}; //runnable ��
		
		Thread t = new Thread(runnable);
		t.start();
	} //send �޼ҵ� ��

	void receive() {
		System.out.println("Ŭ���̾�Ʈ receive �޼ҵ� ȣ���");
		Runnable runnable = new Runnable() {

			@Override
			public void run() {

				while (true) {
					try {
						InputStream is = s.getInputStream();
						byte[] byteArr = new byte[100];
						int size = is.read(byteArr);
						String data = new String(byteArr, 0, size);
						System.out.println(data);

					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
						break;
					}

				}

			}
		};// runnable ���� ��

		Thread t = new Thread(runnable);
		t.start();
	}// receive() �޼ҵ� ����

}
