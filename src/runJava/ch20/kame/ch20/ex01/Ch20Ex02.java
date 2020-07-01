package runJava.ch20.kame.ch20.ex01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



/*InputStream의 주요 메소드
 * int read() 한 바이트를 읽는다.
 * int read(byte b[]) 바이트 배열을 읽고 byte 배열에 저장한다.
 * int read(byte b[], int off, int len) 바이트 배열의 주어진 위치에 주어진 길이만큼 읽는다.
 * 
 * OutputStream
 * void close() 스트림을 닫는다.
 * void flush() 출력 스트림이 가지고 있는 버퍼의 내용을 모두 출력 스트림으로 내보낸다.
 * int write(byte[] b, int off, int len) b 배열의 off 위치부터 len 만큼 출력한다.
 * void write(byte[] b) 바이트 배열로 출력한다.
 * void write( int b) 한 바이트로 출력한다.
 * */

public class Ch20Ex02 {
	
	public static void main(String[] args) {
		int data=0;
		
		InputStream myln = System.in;
		OutputStream myOut= System.out;
		
		System.out.print("데이터를 입력하세요 . 끝내려면 ctrl +z");
		try {
			
			while((data=myln.read())!=-1){
				
				myOut.write(data);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}

}
