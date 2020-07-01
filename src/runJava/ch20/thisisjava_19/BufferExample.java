package runJava.ch20.thisisjava_19;

import java.nio.Buffer;
import java.nio.ByteBuffer;


///******** BufferExample *********
//Buffer의 위치 속성
//position -- 현재 읽거나 쓰는 위치 값 ,0부터 시작 limit보다 커질 수 없다.
//limit -- 버퍼에서 읽거나 쓸 수 있는 위치의 한계 capacity보다 작거나 같은 값
//capacity -- 버퍼의 최대 데이터 개수
//mark -- reset() 메소드 실행시 돌아오는 위치를 지정하는 인덱스, mark() 메소드로 지정 가능

//flip() 메소드 -- position을 0으로 보내고 limit를 position위치로 보낸다.

public class BufferExample {
	
	public static void main(String[] args) {
		
		System.out.println("7 바이트 크기로 버퍼  생성");
		ByteBuffer buffer = ByteBuffer.allocateDirect(7);
		
		printState(buffer);
		
		buffer.put((byte)10);
		buffer.put((byte)11);
	
		System.out.println("2바이트 저장 후");
		printState(buffer);
		
		buffer.put((byte)12);
		buffer.put((byte)13);
		buffer.put((byte)14);
		
		System.out.println("3바이트 저장 후");
		printState(buffer);
		
		
		buffer.flip();
		System.out.println("flip 실행 후");
		printState(buffer);
		
		
		
		
		System.out.println("3바이트를 읽은 후"); //상대적 읽기
		buffer.get(new byte[3]);
		printState(buffer);
		
		
		System.out.println("----------현재 위치를 마크 해 놓음");
		buffer.mark();
		printState(buffer);
		
		System.out.println("2바이트를 읽은 후"); //상대적 읽기
		buffer.get(new byte[2]);
		printState(buffer);
		
		
		
		System.out.println("- position을 마크 위치로 옮김.");
		buffer.reset();
		printState(buffer);
		
		System.out.println("rewind()를 실행 후");
		buffer.rewind();
		printState(buffer);
		
		
		System.out.println("clear()를 실행 후");
		buffer.clear();
		printState(buffer);
		
		
		
	} //메인 메소드 종료
	
	
	
	public static void printState(Buffer buffer){
		
		System.out.print("\tposition :" + buffer.position() +",");
		System.out.print("\tlimit :" + buffer.limit() +" , ");
		System.out.println("\tcapacity : " + buffer.capacity());
		
	}
	
	
	

}

