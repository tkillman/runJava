package runJava.ch20.kame.ch20.ex01;
import java.io.IOException;

/////////////// ************** InputStream의 read() 메소드 사용******************
//read 메소드는 더 이상 읽을 값이 없으면 -1을 리턴


//InputStream : 1byte 씩 읽어올 수 있는 스트림 객체 생성
//OutputStream :  1byte 씩 내보낼  수 있는 스트림 객체 생성

// 한글은 2byte 라서  2byte씩 읽어 올 수 있는 객체 생성해주는 클래스
//Reader   
//Writer 





public class Ch20Ex01 {
	
	public static void main(String[] args) {
		int data=0;
		System.out.println("데이터를 입력하세요. 끝내려면 ctrl+z를 누르세요");
		
		try {
			while((data=System.in.read())!=-1){
				System.out.print((char)data);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
