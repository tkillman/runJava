package runJava.ch20.thisisjava_19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


///***************FilesCopyMEthodExample
////********* Files의 copy 메소드를 통한 복사
public class FilesCopyMEthodExample {
	
	
	public static void main(String[] args) throws IOException{
		
		Path from = Paths.get("src/thisisjava_19/Koala.jpg");
		Path to = Paths.get("src/thisisjava_19/Koala3.jpg");
		
		Files.copy(from, to,StandardCopyOption.REPLACE_EXISTING);
		System.out.println("파일 복사 성공");
		
	}
	
	
	
}
