package runJava.ch20.thisisjava_19;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;


//********* ByteBufferToStringExample *******
// ByteBuffer <-> String ���ڵ�, ���ڵ�


public class ByteBufferToStringExample {
	
	public static void main(String[] args) { 
		
		Charset charset = Charset.forName("UTF-8"); //���ڵ� ����
		
		// ���ڵ�
		String data = "�ȳ��ϼ���";
		ByteBuffer byteBuffer = charset.encode(data);
		
		
		//���ڵ�
		data = charset.decode(byteBuffer).toString();
		
		System.out.println("���ڿ� ���� : " + data);
	
	}
	
}
