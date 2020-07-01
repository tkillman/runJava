package runJava.ch20.kame.ch20.ex01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


///***************** File의 데이터 값을 읽어오기.*********
// DataInputStream read() 메소드

public class Ch20Ex08 {
	
	public static void main(String[] args) {
		String mem_name=null;
		String mem_id= null;
		String mem_pwd=null;
		boolean mem_gender= true;
		int mem_age=0;
		String mem_phone=null;
		String temp = null;
		
		File f= new File("C:\\java_workspace\\Ch20\\mem2.dat");
		
		try {
			FileInputStream fis= new FileInputStream(f);
			DataInputStream dis= new DataInputStream(fis);
			
			mem_name=dis.readUTF();
			mem_id=dis.readUTF();
			mem_pwd=dis.readUTF();
			mem_gender=dis.readBoolean();
			mem_age=dis.readInt();
			mem_phone=dis.readUTF();
			dis.close();
			
			System.out.println(mem_name);
			System.out.println(mem_id);
			System.out.println(mem_pwd);
			System.out.println(mem_gender);
			System.out.println(mem_age);
			System.out.println(mem_phone);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
