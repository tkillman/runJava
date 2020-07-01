package runJava.ch20.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
/**
 * �������� �Ѿ���� �����͸� ��� �д� ������
 */
public class ClientThread extends Thread{
 
 private Socket socket; //������ ����� ����
 private BufferedReader br = null; // inputStream
 
 public ClientThread(Socket s){
  this.socket = s;
 }
 
 //run()�� �����Ҷ� �޼ҵ� ȣ��, Ʈ����ĳġ
 public void run(){
  
	 try {
   service();
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
 
 private void service() throws IOException{
  try{
   br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
 
   //�������� ���� �޼����� br�� ���� �غ�
   
   while(true){
    String str = br.readLine(); //�������� ���� �޼���
    
    if(str == null){
     break;
    }
    
    System.out.println(str); //�������� ���� �޼����� ǥ��
   
   }
  }catch(IOException e){
   
	  System.out.println("����!!");
 
  }finally{
   if (br != null)
    br.close();
   if (socket != null)
    socket.close(); 
  }
 } 
}