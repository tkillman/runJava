
package runJava.ch20.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread{
 private Socket socket; // Client ����
 private TestServer ts; // ���� ��ü
 private BufferedReader br = null; // ���پ� �д� inputstream reader // Ŭ���̾�Ʈ�� ���� �޼���
 private PrintWriter pw = null; // ���ִ� outputstream //Ŭ���̾�Ʈ���� ���� �޼���
 private String userIP = null; // ����� ip
 
 
 
 ServerThread(Socket s, TestServer ts){ //������
  this.socket = s; // Ŭ���̾�Ʈ ������ �޴´�.
  this.ts = ts; // ���� ��ü�� �޴´�.
  userIP = socket.getInetAddress().toString(); //userIp�� ����.
 }
 
 /**
  * �����尡 ����� deleteThread()�ؼ�
  * ���Ϳ� ����� �ڽ��� �����Ѵ�.
  */
 
 public void run(){
  /**
   * client���� ���� �޼����� broadCasting()ȣ���ؼ� 
   * ��ü client�� ���޵ǰ� �Ѵ�.
   */
  try{
  
	  service();
  }catch(IOException e){
 
	  System.out.println("**"+userIP+"�� ���� ����.");
  }finally{
   
	  //�������� Vector�� �ڽ��� �����带 ����
   ts.deleteThread(this);
  }
 }
 
 private void service() throws IOException{
  /**
   * TestServer�� broadCasting()���� �� �����忡 �����
   * Ŭ���̾�Ʈ���� �޼����� ������ ���ؼ� ȣ���ϴ� �޼���
   */
  try{
   br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // �������� ���� �޼���
   pw = new PrintWriter(socket.getOutputStream(), true);//Ŭ���̾�Ʈ���� ������ �޼���
   String str = null;
   
   while(true){
    str = br.readLine(); //�������� ��� �޼����� ����
    
    if(str == null){
     System.out.println(userIP+"���� ������ �����߽��ϴ�.");
     break;
    }
    
   
    ts.broadCasting("["+userIP+"]"+str); 
    //��� �������� �ѷ��ִ� ������ �������� ����
    
  //  pw.println(str);
    //������ Ŭ���̾�Ʈ���Ե� �޼����� ������
   }
   
  }
  
  finally{
   if (pw != null)
    pw.close();
   if (br != null)
    br.close();
   if (socket != null)
    socket.close();
  }
 }
 /**
  * TestServer
  */
 
 public void sendMessage(String message){
  
	 pw.println(message); //Ŭ���̾�Ʈ�鿡�� �޼����� �Ѹ���. 
 }
}
