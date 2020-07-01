package runJava.ch20.myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ser {

	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(5002);

			Socket s = ss.accept();

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

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}
			}; // runnable 종료
			Thread t = new Thread(runnable);
			t.start();

			Runnable runnable2 = new Runnable() {

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
						}
					}
				}
			}; // runnable2 정의 끝

			Thread tt = new Thread(runnable2);
			tt.start();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
