package runJava.ch20.thisisjava_19;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

///*********** FileSystemExample *****************
// 운영체제의 파일 시스템의 정보를 얻을 수 있는 FileSystem 클래스~ getDefault() 메소드를 통해 구현객체 생성

public class FileSystemExample {
	
	public static void main(String[] args) {
		
		// getDefault 메소드를 통해서 객체 생성 가능
		FileSystem fileSystem = FileSystems.getDefault();
		
		for(FileStore store : fileSystem.getFileStores()){
			
			
			System.out.println("드라이버 명 : " + store.name());
			System.out.println("파일 시스템 : " + store.type());
			
			try {
				System.out.println("전체 공간 : " + store.getTotalSpace() + "바이트 ");
			
			
				System.out.println("사용 중인 공간 " + (store.getTotalSpace() - store.getUnallocatedSpace()));
				
				System.out.println("사용 가능한 공간 " + store.getUsableSpace());
			
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		} //for each문 종료
		
		
		System.out.println("파일 구분자" +fileSystem.getSeparator());
		System.out.println();
		
		
		
		for(Path path : fileSystem.getRootDirectories()){
			System.out.println(path.toString());
			
		}
		
		
		
		
	}
	
	

}
