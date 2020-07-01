package runJava.ch20.myTest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ServerTest {
	static Vector<Socket> vector = new Vector<>();
	static ServerTest sTest = new ServerTest();
	
	
	
	public static void main(String[] args) {
		ServerSocket ss;
		
		
		try {
			ss = new ServerSocket(5001);
			
			while (true) {
				Socket s = ss.accept();
				System.out.println("서버에 접속함" + s.getRemoteSocketAddress());
				ServerTask st = new ServerTask();
				
				st.add(s,sTest);
				vector.add(s);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.interrupted();
		}

	} // 메인 메소드 종료
	
	static void send(String data) {

		System.out.println("서버 send 메소드 호출됨");

		for (Socket s : vector) {

			try {
				OutputStream os = s.getOutputStream();
				data+=s.getRemoteSocketAddress();
				os.write(data.getBytes());
				os.flush();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	} // send(String data) 메소드 종료

} // 클래스 종료