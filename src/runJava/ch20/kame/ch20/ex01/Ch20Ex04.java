package runJava.ch20.kame.ch20.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/////////*************** FileInputStream�� read() �޼ҵ�--------->> data = ��ǲ��Ʈ�� ���۷�������.write;
////////************* OutputStream �� write(data) �޼ҵ�
/////// **** ������ ���� �ҷ��ͼ� ������ ǥ���ϰ� �Ѵ�.

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
