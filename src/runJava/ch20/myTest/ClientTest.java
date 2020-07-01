package runJava.ch20.myTest;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {

	public static void main(String[] args) {

		try {
			Socket s = new Socket("localhost", 5001);
			ClientTask ct = new ClientTask();
			ct.add(s);
			ct.send();
			ct.receive();
			

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
