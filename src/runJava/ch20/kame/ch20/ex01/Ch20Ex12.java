package runJava.ch20.kame.ch20.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


//***** 객체 단위로 받기  

public class Ch20Ex12 {

		public static void main(String[] args) {

			Member mem= null;
			File f= new File("C:\\java_workspace\\Ch20\\mem4.dat");
			
			try {
				
				FileInputStream fis= new FileInputStream(f);
				ObjectInputStream ois= new ObjectInputStream(fis);
				
				mem= (Member)ois.readObject();
				ois.close();
				
				System.out.println(mem);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		}
}
