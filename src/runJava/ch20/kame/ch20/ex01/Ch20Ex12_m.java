package runJava.ch20.kame.ch20.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ch20Ex12_m {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File file = new File("C://java_workspace//ch20//mem.dat");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		member_m m;
		
		m = (member_m) ois.readObject();
		ois.close();
		
		System.out.println(m);
		
		
		
		
		
		
	}
	

}
