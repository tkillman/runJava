package runJava.ch20.thisisjava_19;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

///************** ComputerByteOrderExample
// ���� ����Ʈ���� ó�� Big endian , ���� ����Ʈ���� ó�� Little endian


public class ComputerByteOrderExample {
	
	public static void main(String[] args) {
		
		
		System.out.println("� ü�� ���� : " + System.getProperty("os.name"));
		
		
		System.out.println("����Ƽ���� ����Ʈ �ؼ� ���� : " + ByteOrder.nativeOrder());
		
		ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100).order(ByteOrder.nativeOrder());
		
		
		
	}
	

}
