package runJava.ch20.thisisjava_19;

import java.nio.ByteBuffer;


//**** CompactExample **
//compact() 메소드 -- 읽지 않은 데이터를 0 인덱스부터 복사


public class CompactExample {
	
	public static void main(String[] args) {
		System.out.println("7 바이트 크기로 버퍼 생성 ");
		ByteBuffer buffer = ByteBuffer.allocateDirect(7);
		
		
		buffer.put((byte)10);
		buffer.put((byte)11);
		buffer.put((byte)12);
		buffer.put((byte)13);
		buffer.put((byte)14);
		buffer.flip(); //데이터를 읽기 위해 위치 속성값 변경 , limit 값 변경
		
		
		System.out.println("3바이트를 읽음");
		buffer.get(new byte[3]);
		printState(buffer);
		
		
		System.out.println("compact() 실행 후 "); // 읽지 않은 데이터는 0 인덱스부터 복사
		buffer.compact();
		printState(buffer); 
		
		
		
		
	} //메인 메소드 종료
	
	public static void printState(ByteBuffer buffer){ // ByteBuffer에만 get 메소드 사용 가능
		
		System.out.print(buffer.get(0) +", ");
		System.out.print(buffer.get(1) +", ");
		System.out.print(buffer.get(2) +", ");
		System.out.print(buffer.get(3) +", ");
		System.out.println(buffer.get(4) +", ");
		System.out.print("position : " + buffer.position() + ",");
		System.out.print("limit : " + buffer.limit() + ",");
		System.out.println("capacity : " + buffer.capacity() );
		
		
		
	}
	
	
	
	

}
