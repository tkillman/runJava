package hanJangHee.day1122;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class TcpIpServer {
	public static void main(String[] args){
		ServerSocket serverSocket = null;
		
		try{
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + "������ �غ�Ǿ����ϴ�.");
		}catch(IOException e){
			e.printStackTrace();
		}
		
		while(true){
			try{
				System.out.println(getTime() + "�����û�� ��ٸ��ϴ�.");
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + "�κ��� �����û�� ���Խ��ϴ�.");
				
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime() + "�����͸� �����߽��ϴ�.");
				
				dos.close();
				socket.close();
				
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	static String getTime(){
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}

}
