package runJava.ch20.kame.ch20.ex01;
import java.io.IOException;

/////////////// ************** InputStream�� read() �޼ҵ� ���******************
//read �޼ҵ�� �� �̻� ���� ���� ������ -1�� ����


//InputStream : 1byte �� �о�� �� �ִ� ��Ʈ�� ��ü ����
//OutputStream :  1byte �� ������  �� �ִ� ��Ʈ�� ��ü ����

// �ѱ��� 2byte ��  2byte�� �о� �� �� �ִ� ��ü �������ִ� Ŭ����
//Reader   
//Writer 





public class Ch20Ex01 {
	
	public static void main(String[] args) {
		int data=0;
		System.out.println("�����͸� �Է��ϼ���. �������� ctrl+z�� ��������");
		
		try {
			while((data=System.in.read())!=-1){
				System.out.print((char)data);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
