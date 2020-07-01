package runJava.ch20.kame.ch20.ex01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



/*InputStream�� �ֿ� �޼ҵ�
 * int read() �� ����Ʈ�� �д´�.
 * int read(byte b[]) ����Ʈ �迭�� �а� byte �迭�� �����Ѵ�.
 * int read(byte b[], int off, int len) ����Ʈ �迭�� �־��� ��ġ�� �־��� ���̸�ŭ �д´�.
 * 
 * OutputStream
 * void close() ��Ʈ���� �ݴ´�.
 * void flush() ��� ��Ʈ���� ������ �ִ� ������ ������ ��� ��� ��Ʈ������ ��������.
 * int write(byte[] b, int off, int len) b �迭�� off ��ġ���� len ��ŭ ����Ѵ�.
 * void write(byte[] b) ����Ʈ �迭�� ����Ѵ�.
 * void write( int b) �� ����Ʈ�� ����Ѵ�.
 * */

public class Ch20Ex02 {
	
	public static void main(String[] args) {
		int data=0;
		
		InputStream myln = System.in;
		OutputStream myOut= System.out;
		
		System.out.print("�����͸� �Է��ϼ��� . �������� ctrl +z");
		try {
			
			while((data=myln.read())!=-1){
				
				myOut.write(data);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}

}
