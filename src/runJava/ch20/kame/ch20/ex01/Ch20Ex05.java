package runJava.ch20.kame.ch20.ex01;

import java.io.File;
import java.util.Date;


////////////// ******************** File 클래스의 주요 메소드들 **********/////////

public class Ch20Ex05 {
	public static void main(String[] args) {
		
		File file= null;
		byte [] byteFileName = new byte[100];
		String fileName;
		System.out.print("파일명 입력-->");
		
		try {
			System.in.read(byteFileName);
			fileName = new String(byteFileName).trim();
			file = new File(fileName);
			
			System.out.println("절대경로"+file.getAbsolutePath());
			System.out.println("표준경로"+file.getCanonicalPath());
			System.out.println("최근 수정일"+new Date(file.lastModified()));
			System.out.println("파일크기"+file.length() +"Chkb");
			System.out.println("읽기속성"+file.canRead());
			System.out.println("쓰기경로"+file.canWrite());
			System.out.println("파일 경로"+file.getParent());
			System.out.println("숨김속성"+file.isHidden());
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
	}

}
