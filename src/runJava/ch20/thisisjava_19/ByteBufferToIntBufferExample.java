package runJava.ch20.thisisjava_19;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;


//*********ByteBufferToIntBufferExample
// ByteBuffer<-> IntBuffer
// int[] 배열을 warp() 메소드 호출해서 IntBuffer 객체 생성 가능
//IntBuffer를  ByteBuffer의 putInt() 메소드를 통해 대입 가능
// ByteBuffer의 메소드 asIntBuffer()로 IntBuffer 객체 생성 가능. 

public class ByteBufferToIntBufferExample {
	
	public static void main(String[] args) {
		
		
		int[] writeData = {10,20};
		
		IntBuffer writeIntBuffer = IntBuffer.wrap(writeData);
		
		ByteBuffer writeByteBuffer = ByteBuffer.allocate(writeIntBuffer.capacity()*4);
		
		
		for(int i=0; i<writeIntBuffer.capacity();i++){
			writeByteBuffer.putInt(writeIntBuffer.get(i));
		}
		
		writeByteBuffer.flip();
		
		ByteBuffer readByteBuffer = writeByteBuffer;
		IntBuffer readIntBuffer = readByteBuffer.asIntBuffer(); //** 중요!!**//
		
		int[] readData = new int[readIntBuffer.capacity()];
 		
		readIntBuffer.get(readData);
		
		System.out.println("배열 복원 : " + Arrays.toString(readData));

	}
	
}
