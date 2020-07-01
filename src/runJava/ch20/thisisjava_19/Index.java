package runJava.ch20.thisisjava_19;

public class Index {
	
	/*
	 * NIO 장점 : 1.채널방식 2. 버퍼 3. 비동기방식 4.블로킹/넌블로킹 둘다 지원 
	 * 		   : 사용 목적? 연결 클라이언트가 많고 전송되는 용량이 적고 입출력 작업이 빨리 끝나는 경우
	 * 
	 */
	/////***************** PathExample**********************//
	// Path는 IO기반 File 클래스와 유사 , get()메소드를 통해 객체를 구할 수 있다.
	
	///*********** FileSystemExample *****************
	// 운영체제의 파일 시스템의 정보를 얻을 수 있는 FileSystem 클래스~getDefault() 메소드를 통해 구현객체 생성
	
	//********* FileExample *****************
	// 파일의 속성을 읽을 수 있는 Files 클래스
	
	//************* DirectoryExample 
	// 디렉토리와 파일을 생성하고 디렉토리의 내용을 출력하는 예제
	
	//**************** WathchServiceExample*****************
	// WatchService 인터페이스는 newWatchService()메소드를 통해 구현객체를 얻을 수 있다.


	///********** BufferSizeExample *****************
	//** 넌다이렉트 버퍼 : 생성방법 - allocate() ,사용 메모리 공간은 JVM      
	// ** 다이렉트 버퍼 : 생성방법- allcateDirect() , 사용 메모리 공간은 운영체제 , 버퍼 크기가 크고 입출력 성능이 높다.
	
	//********* DirectBufferCapacityExample 
	//다이렉트 버퍼 저장 용량 확인
	
	
	///************** ComputerByteOrderExample
	// 앞쪽 바이트부터 처리 Big endian , 뒤쪽 바이트부터 처리 Little endian
	
	///******** BufferExample *********
	//Buffer의 위치 속성
	//position -- 현재 읽거나 쓰는 위치 값 ,0부터 시작 limit보다 커질 수 없다.
	//limit -- 버퍼에서 읽거나 쓸 수 있는 위치의 한계 capacity보다 작거나 같은 값
	//capacity -- 버퍼의 최대 데이터 개수
	//mark -- reset() 메소드 실행시 돌아오는 위치를 지정하는 인덱스, mark() 메소드로 지정 가능

	//flip() 메소드 -- position을 0으로 보내고 limit를 position위치로 보낸다.
	

	//**** CompactExample **
	//compact() 메소드 -- 읽지 않은 데이터를 0 인덱스부터 복사
	
	

	//********* ByteBufferToStringExample *******
	// ByteBuffer <-> String 인코딩, 디코딩
	
	//*********ByteBufferToIntBufferExample
	// ByteBuffer<-> IntBuffer
	// int[] 배열을 warp() 메소드 호출해서 IntBuffer 객체 생성 가능
	//IntBuffer를  ByteBuffer의 putInt() 메소드를 통해 대입 가능
	// ByteBuffer의 메소드 asIntBuffer()로 IntBuffer 객체 생성 가능.
	
	// ** FileChannelWriteExample
	// FileChannel의 정적 메소드인 open을 통해서 객체 생성 가능.
	//파일에 데이터를 쓰는 write() 메소드 , int를 반환
	

	//*****************FileChannelReadExample
	//파일 읽어오기
	
	// ********* FileCopyExample ************
	// Channel을 두개 동시에 열어서 한쪽에서는 입력만 받고 다른 쪽에서는 출력만 담당하면 복사가 된다.

	
	///***************FilesCopyMEthodExample
	////********* Files의 copy 메소드를 통한 복사
	
	
	//////************ AsynchronousFileChannelWriteExample	
	//FileChannel의 read()나 write() 메소드는 블로킹이 되기 때문에 이를 해결하기 위한 채널
	//비동기로 파일 생성 및 쓰기
	//write(버퍼 객체,버퍼 인덱스,첨부 객체, 콜백 메소드를 가진 객체)

	
	
	
	
	
}


