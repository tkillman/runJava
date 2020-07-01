
package runJava.ch20.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread{
 private Socket socket; // Client 소켓
 private TestServer ts; // 서버 객체
 private BufferedReader br = null; // 한줄씩 읽는 inputstream reader // 클라이언트가 보낸 메세지
 private PrintWriter pw = null; // 써주는 outputstream //클라이언트에게 보낼 메세지
 private String userIP = null; // 사용자 ip
 
 
 
 ServerThread(Socket s, TestServer ts){ //생성자
  this.socket = s; // 클라이언트 소켓을 받는다.
  this.ts = ts; // 서버 객체를 받는다.
  userIP = socket.getInetAddress().toString(); //userIp를 얻어낸다.
 }
 
 /**
  * 스레드가 종료시 deleteThread()해서
  * 벡터에 저장된 자신을 삭제한다.
  */
 
 public void run(){
  /**
   * client에서 읽은 메세지를 broadCasting()호출해서 
   * 전체 client에 전달되게 한다.
   */
  try{
  
	  service();
  }catch(IOException e){
 
	  System.out.println("**"+userIP+"님 접속 종료.");
  }finally{
   
	  //종료직전 Vector에 자신의 스레드를 삭제
   ts.deleteThread(this);
  }
 }
 
 private void service() throws IOException{
  /**
   * TestServer의 broadCasting()에서 각 스레드에 연결된
   * 클라이언트에게 메세지를 보내기 위해서 호출하는 메서드
   */
  try{
   br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 서버에서 읽은 메세지
   pw = new PrintWriter(socket.getOutputStream(), true);//클라이언트에게 보내는 메세지
   String str = null;
   
   while(true){
    str = br.readLine(); //서버에서 계속 메세지를 읽음
    
    if(str == null){
     System.out.println(userIP+"님이 연결을 종료했습니다.");
     break;
    }
    
   
    ts.broadCasting("["+userIP+"]"+str); 
    //모든 유저에게 뿌려주는 역할은 서버에서 수행
    
  //  pw.println(str);
    //접속한 클라이언트에게도 메세지를 보내줌
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
  
	 pw.println(message); //클라이언트들에게 메세지를 뿌린다. 
 }
}
