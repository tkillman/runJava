package runJava.ch20.soket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			
			Socket conSock = new Socket(); // ������ ������ �� ����� ���� ����
			InetSocketAddress conAddr = new InetSocketAddress("127.0.0.1", 1818);
			conSock.connect(conAddr); // ������ ������ �ּҷ� ���� 
			
			OutputStream sender = conSock.getOutputStream(); //�������� �����͸� �������� �� �ʿ���.
			InputStream receive = conSock.getInputStream();// ���Ͽ��� �����͸� ���������� �� �ʿ���.
			
			
			
			byte [] recvBuf = new byte[100];//���ŵ����͸� ���� ������� 
			int size =receive.read(recvBuf); //���Ͽ��� ���ŵ����� ��������
			
			
			String recvMsg = new String(recvBuf,0,size); // byte�迭�� String���� ��ȯ�ϴ� �۾�
			
			
			System.out.println(recvMsg); //�����°� ����ϱ�
			
			String sendBuf ="Nice to meet you^^"; // ������ ���� �ȳ�޼���
			sender.write(sendBuf.getBytes());	//������ �޽��� ������
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}