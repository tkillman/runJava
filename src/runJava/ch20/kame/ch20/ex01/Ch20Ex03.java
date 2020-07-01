package runJava.ch20.kame.ch20.ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


/////////
////////************* FileOutputStream 의 write(data) 메소드
////// ********* 파일에 내가 입력한 값을 output 한다.

public class Ch20Ex03 {

	public static void main(String[] args) {
		int data=0;
		InputStream myln= System.in;
		
		FileOutputStream fos= null;
	
		try {
			fos = new FileOutputStream("C:\\java_workspace\\ch20\\test.dat");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("데이터를 입력하세요 입력할 데이터가 없으면 ctrl+z");
		try {
			while((data=myln.read())!=-1){
				
				fos.write(data);
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
	}
	
}
