package runJava.ch20.kame.ch20.ex01;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;


/////////************ 데이터 타입(int, boolean,byte,char,short,long,String)을 처리하기 위한 
//////// ***DataInputStream 과 DataOutputStream ****
/////// DataoutStream 주요 메소드 writeUTF(mem_name),writeBoolean(mem_gender),write(mem_age) 
//DataInputStream의 주요 메소드
/*
 * DataInputStream(inputStream input) DataInputStream 객체 생성
 * 
 * int read(byte buffer[], int off, int len) len개의 바이트를 읽어서 바이트 배열 buffer의 off 위치에 저장
 * int read(byte buffer[]) 바이트 배열 크기만큼 바이트를 반환
 * void readFully(byte buffer[]) 스트림에서 buffer 크기만큼의 바이트를 읽어서 buffer 배열에 저장
 * void readFully(byte buffer[],int off, int len)
 * byte readByte()
 * char readChar()
 * short readShort()
 * int readInt()
 * long readLong()
 * double readDouble()
 * float readFloat()
 * String readUTF()
 * */


public class Ch20Ex07 {
	
	public static void main(String[] args) {
		
		String mem_name=null;
		String mem_id= null;
		String mem_pwd=null;
		boolean mem_gender= true;
		int mem_age=0;
		String mem_phone=null;
		String temp = null;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		File f= new File("C:\\java_workspace\\Ch20\\mem2.dat");
		
		try {
			
			FileOutputStream fos= new FileOutputStream(f,true);
			DataOutputStream dos= new DataOutputStream(fos);
			
			System.out.println("--회원정보 입력하기--");
			System.out.print("이름>>>>");
			mem_name=br.readLine();
			System.out.print("아이디>>>>");
			mem_id=br.readLine();
			System.out.print("비밀번호>>>>");
			mem_pwd=br.readLine();
			System.out.print("성별>>>>");
			temp=br.readLine();
			if(temp.equals("남자")){
				mem_gender=true;
			} else {mem_gender=false;}
			
			System.out.print("나이>>>>");
			temp=br.readLine();
			mem_age= Integer.parseInt(temp);
			
			System.out.print("전화번호>>>>");
			mem_phone=br.readLine();
			
			dos.writeUTF(mem_name);
			dos.writeUTF(mem_id);
			dos.writeUTF(mem_pwd);
			dos.writeBoolean(mem_gender);
			dos.writeInt(mem_age);
			dos.writeUTF(mem_phone);
			dos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	

}
