package runJava.ch20.kame.ch20.ex01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



public class Ch20Ex11 {

	
	// ***** 객체 단위로 보내기 위한 Externalizable 인터페이스 implements 
	// writeObject() 메소드 사용
	
	public static void main(String[] args) {
		Member  mem=new Member("고양이", "dong", "1234", true, 24, "010-8449-0556");
		
		File f= new File("C:\\java_workspace\\Ch20\\mem4.dat");
		
		try {
			//파일에 추가 입력
			FileOutputStream fos= new FileOutputStream(f,true);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			
			//Externalizable을 상속받은 객체를 보냄
			oos.writeObject(mem);
			oos.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
