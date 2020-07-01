package runJava.ch20.thisisjava_19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//********* FileExample *****************
// 파일의 속성을 읽을 수 있는 Files 클래스



public class FileExample {

	public static void main(String[] args) {
		
		Path path = Paths.get("src/thisisjava_19/FileExample.java");
		
		System.out.println("디렉토리 여부 : " + Files.isDirectory(path)); //디렉토리가 아니다.
		System.out.println("파일 여부 : " + Files.isRegularFile(path)); //파일이다.
		
		try {
			System.out.println("마지막 수정 시간 : " + Files.getLastModifiedTime(path));
			System.out.println("파일 크기 : " + Files.size(path));
			System.out.println("소유자  :" + Files.getOwner(path) );
			System.out.println("숨김 파일 여부 : " + Files.isHidden(path));
			System.out.println("읽기 가능 여부 : " + Files.isReadable(path));
			System.out.println("쓰기 가능 여부 : " + Files.isWritable(path));
			
			
			
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
