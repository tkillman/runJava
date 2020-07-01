package runJava.ch20.thisisjava_19;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

///************** ComputerByteOrderExample
// 앞쪽 바이트부터 처리 Big endian , 뒤쪽 바이트부터 처리 Little endian


public class ComputerByteOrderExample {
	
	public static void main(String[] args) {
		
		
		System.out.println("운영 체제 종류 : " + System.getProperty("os.name"));
		
		
		System.out.println("네이티브의 바이트 해석 순서 : " + ByteOrder.nativeOrder());
		
		ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100).order(ByteOrder.nativeOrder());
		
		
		
	}
	

}
