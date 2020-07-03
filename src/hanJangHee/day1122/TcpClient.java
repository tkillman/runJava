package hanJangHee.day1122;

import java.net.*;
import java.io.*;

class TcpClient {
	public static void main(String[] args){
		try{
			String serverIp = "192.168.20.18";
			
			System.out.println("������ �������Դϴ�. ����IP : " + serverIp);
			Socket socket = new Socket(serverIp, 7777);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("�����κ��� ���� �޼��� :" + dis.readUTF());
			System.out.println("������ �����մϴ�.");
			
			dis.close();
			socket.close();
			System.out.println("������ ����Ǿ����ϴ�.");
		}catch(ConnectException ce){
			ce.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
