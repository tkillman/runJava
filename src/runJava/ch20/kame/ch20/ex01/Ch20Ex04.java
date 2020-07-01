package runJava.ch20.kame.ch20.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/////////*************** FileInputStream의 read() 메소드--------->> data = 인풋스트림 래퍼런스변수.write;
////////************* OutputStream 의 write(data) 메소드
/////// **** 파일의 값을 불러와서 나한테 표현하게 한다.

public class Ch20Ex04 {
	
	public static void main(String[] args) {
		int data=0;
		FileInputStream fis= null;
		OutputStream myOut = System.out;
		
		try {
			fis = new FileInputStream("C:\\java_workspace\\ch20\\test.dat");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			while((data=fis.read())!=-1){
				
				myOut.write(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
