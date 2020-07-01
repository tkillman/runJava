package runJava.ch20.kame.ch20.ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class Ch20Ex11_m {
	
	
	public static void main(String[] args) {
		
		
		member_m m = new member_m("±èµ¿±Ô", "tka", "1234", 34, true);
		
		
		try {
			File file = new File("C://java_workspace//ch20//mem.dat");
			
			FileOutputStream fos = new FileOutputStream(file);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(m);
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
