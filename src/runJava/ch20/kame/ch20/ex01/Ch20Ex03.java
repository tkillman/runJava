package runJava.ch20.kame.ch20.ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


/////////
////////************* FileOutputStream �� write(data) �޼ҵ�
////// ********* ���Ͽ� ���� �Է��� ���� output �Ѵ�.

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
		
		System.out.println("�����͸� �Է��ϼ��� �Է��� �����Ͱ� ������ ctrl+z");
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
