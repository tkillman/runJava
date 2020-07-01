package runJava.ch20.kame.ch20.ex01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

//////////***************** 문자 스트림 (문자 단위로)************////////////
//** InputStreamReader  -->> 바이트 스트림을 문자 스트림으로 변환
// System.in의 입력 방식은 바이트 코드

//		InputStreamReader(System.in) --> 바이트 코드를 문자로 바꾼다.
// BufferedReader 클래스는 readLine 메소드를 이용해서 한줄 단위로 문자열을 입력받아 처리 가능.


// ******** 파일에 입력************
public class Ch20Ex06 {
	
	public static void main(String[] args) {
		String mem_name=null;
		String mem_id= null;
		String mem_pwd=null;
		String mem_gender= null;
		String mem_age=null;
		String mem_phone=null;
		
		// isr 입력받은 데이터를 문자로 변형
 		// isr의 데이터를 처리하기 위해 BufferredReader
		// FileWriter 클래스의 write() 메소드로 파일에 입력이 가능하게
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		File f=new File("C:\\java_workspace\\Ch20\\mem.dat");
		
		try {
			
			//원래파일의 내용에 추가로 내용을 쓸 수있게 만드는 것.
			FileWriter fw= new FileWriter(f, true); 
			
			
			System.out.println("--회원정보 입력하기--");
			System.out.print("이름>>>>");
			mem_name=br.readLine();
			System.out.print("아이디>>>>");
			mem_id=br.readLine();
			System.out.print("비밀번호>>>>");
			mem_pwd=br.readLine();
			System.out.print("성별>>>>");
			mem_gender=br.readLine();
			System.out.print("나이>>>>");
			mem_age=br.readLine();
			System.out.print("전화번호>>>>");
			mem_phone=br.readLine();
			
			fw.write(mem_name); fw.write("\r\n");
			fw.write(mem_id); fw.write("\r\n");
			fw.write(mem_pwd); fw.write("\r\n");
			fw.write(mem_gender); fw.write("\r\n");
			fw.write(mem_age); fw.write("\r\n");
			fw.write(mem_phone); fw.write("\r\n");
			fw.close();
			//fw.close 되어야 데이터가 입력되고 끝난다.
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
