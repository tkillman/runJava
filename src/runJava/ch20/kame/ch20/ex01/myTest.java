package runJava.ch20.kame.ch20.ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/////// ************** flush()에 대해서****************//////////
public class myTest {
	
	public static void main(String[] args) {
		int data=0;
		
		try {
			FileInputStream fis= new FileInputStream("C:\\java_workspace\\Ch20\\mem.dat");
			OutputStream myOut= System.out;
			
			while((data=fis.read())!=-1){
				
				myOut.write(data);
				myOut.flush();
				// 출력 스트림은 내부에 작은 버퍼가 있어서 데이터가 출력되기 전에 버퍼에 쌓여있다가 순서대로 출력된다.
				//프로그램에서 더이상 출력할 데이터가 없다면 flush()메소드를 마지막으로 호출하여 준다.
				
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
