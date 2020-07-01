package runJava.ch20.kame.ch20.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


////************** 객체의 직렬화 **************///////
//DataInputStream의 경우 데이터를 일렬로 불러와야하는 단점이 있다.
//이 데이터들을 한 곳에 모아서 객체화 시켜서 받아오는 ObjectInputStream 형태 read 메소드


public class Ch20Ex10 {
	
	public static void main(String[] args) {
		String mem_name=null;
		String mem_id= null;
		String mem_pwd=null;
		boolean mem_gender= true;
		int mem_age=0;
		String mem_phone=null;
		
		
		File f= new File("C:\\java_workspace\\Ch20\\mem3.dat");
		
		try {
			FileInputStream fis= new FileInputStream(f);
			ObjectInputStream ois= new ObjectInputStream(fis);
			
			mem_name=ois.readUTF();
			mem_id=ois.readUTF();
			mem_pwd=ois.readUTF();
			mem_gender=ois.readBoolean();
			mem_age=ois.readInt();
			mem_phone=ois.readUTF();
			ois.close();
			
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



