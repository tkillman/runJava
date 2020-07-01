package runJava.ch20.thisisjava_19;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;


//********* ByteBufferToStringExample *******
// ByteBuffer <-> String 인코딩, 디코딩


public class ByteBufferToStringExample {
	
	public static void main(String[] args) { 
		
		Charset charset = Charset.forName("UTF-8"); //인코딩 종류
		
		// 인코딩
		String data = "안녕하세요";
		ByteBuffer byteBuffer = charset.encode(data);
		
		
		//디코딩
		data = charset.decode(byteBuffer).toString();
		
		System.out.println("문자열 복원 : " + data);
	
	}
	
}
