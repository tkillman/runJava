package hanJangHee.day1123;

import java.net.*;
import java.io.*;

class UdpClient {
	public void start() throws IOException, UnknownHostException{
		DatagramSocket datagramSocket = new DatagramSocket();
		InetAddress serverAddress = InetAddress.getByName("192.168.20.14");
		
		byte[] msg = new byte[100];
		
		DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 7777);
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		System.out.println("current server time :" + new String(inPacket.getData()));
		
		datagramSocket.close();
	}
	public static void main(String[] args){
		try{
			new UdpClient().start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
