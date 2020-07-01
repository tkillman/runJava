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
	
		System.out.println("ServerTask 객체 생성");
		this.s=s;
		this.st=st;
		receive();
	}

	
	void receive() {

		System.out.println("서버 receive 메소드 호출됨");

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

				
			} //run 메소드
		};// runnable 종료

	Thread t = new Thread(runnable);
	t.start();
	
}// receive() 메소드 종료

}
