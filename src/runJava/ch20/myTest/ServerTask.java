package runJava.ch20.myTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Vector;

public class ServerTask {
	
	Socket s;
	ServerTest st;
	
	void add(Socket s,ServerTest st) {
	
		System.out.println("ServerTask ��ü ����");
		this.s=s;
		this.st=st;
		receive();
	}

	
	void receive() {

		System.out.println("���� receive �޼ҵ� ȣ���");

		Runnable runnable = new Runnable() {

			@Override
			public void run() {


					try {   
						while (true) {

							InputStream is = s.getInputStream();
					
							byte[] byteArr = new byte[100];
							int size = is.read(byteArr);
							String data = new String(byteArr, 0, size);
							st.send(data);
						}

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				
			} //run �޼ҵ�
		};// runnable ����

	Thread t = new Thread(runnable);
	t.start();
	
}// receive() �޼ҵ� ����

}
