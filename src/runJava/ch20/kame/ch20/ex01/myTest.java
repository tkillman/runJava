package runJava.ch20.kame.ch20.ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/////// ************** flush()�� ���ؼ�****************//////////
public class myTest {
	
	public static void main(String[] args) {
		int data=0;
		
		try {
			FileInputStream fis= new FileInputStream("C:\\java_workspace\\Ch20\\mem.dat");
			OutputStream myOut= System.out;
			
			while((data=fis.read())!=-1){
				
				myOut.write(data);
				myOut.flush();
				// ��� ��Ʈ���� ���ο� ���� ���۰� �־ �����Ͱ� ��µǱ� ���� ���ۿ� �׿��ִٰ� ������� ��µȴ�.
				//���α׷����� ���̻� ����� �����Ͱ� ���ٸ� flush()�޼ҵ带 ���������� ȣ���Ͽ� �ش�.
				
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
