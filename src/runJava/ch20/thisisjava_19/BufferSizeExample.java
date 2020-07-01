package runJava.ch20.thisisjava_19;

import java.nio.ByteBuffer;



///********** BufferSizeExample *****************
//** 넌다이렉트 버퍼 : 생성방법 - allocate() ,사용 메모리 공간은 JVM      
// ** 다이렉트 버퍼 : 생성방법- allcateDirect() , 사용 메모리 공간은 운영체제 , 버퍼 크기가 크고 입출력 성능이 높다.







public class BufferSizeExample {

	public static void main(String[] args) {

		ByteBuffer directBuffer = ByteBuffer.allocateDirect(200 * 1024 * 1024);

		System.out.println("다이렉트 버퍼가 생성되었습니다.");
		
		
		//넌 다이렉트는 오류가 난다.
		ByteBuffer nonDirectBuffer = ByteBuffer.allocate(200*1024*1024);
		System.out.println("넌 다이렉트 버프가 생성되었습니다.");
		
	}

}
