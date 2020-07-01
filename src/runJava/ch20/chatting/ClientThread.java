package runJava.ch20.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
/**
 * 서버에서 넘어오는 데이터를 계속 읽는 스레드
 */
public class ClientThread extends Thread{
 
 private Socket socket; //서버에 연결된 소켓
 private BufferedReader br = null; // inputStream
 
 public ClientThread(Socket s){
  this.socket = s;
 }
 
 //run()을 구현할때 메소드 호출, 트라이캐치
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
 
   //서버에서 받은 메세지를 br로 읽을 준비
   
   while(true){
    String str = br.readLine(); //서버에서 받은 메세지
    
    if(str == null){
     break;
    }
    
    System.out.println(str); //서버에서 받은 메세지를 표현
   
   }
  }catch(IOException e){
   
	  System.out.println("종료!!");
 
  }finally{
   if (br != null)
    br.close();
   if (socket != null)
    socket.close(); 
  }
 } 
}