package runJava.ch20.thisisjava_19;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

///*********** FileSystemExample *****************
// �ü���� ���� �ý����� ������ ���� �� �ִ� FileSystem Ŭ����~ getDefault() �޼ҵ带 ���� ������ü ����

public class FileSystemExample {
	
	public static void main(String[] args) {
		
		// getDefault �޼ҵ带 ���ؼ� ��ü ���� ����
		FileSystem fileSystem = FileSystems.getDefault();
		
		for(FileStore store : fileSystem.getFileStores()){
			
			
			System.out.println("����̹� �� : " + store.name());
			System.out.println("���� �ý��� : " + store.type());
			
			try {
				System.out.println("��ü ���� : " + store.getTotalSpace() + "����Ʈ ");
			
			
				System.out.println("��� ���� ���� " + (store.getTotalSpace() - store.getUnallocatedSpace()));
				
				System.out.println("��� ������ ���� " + store.getUsableSpace());
			
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		} //for each�� ����
		
		
		System.out.println("���� ������" +fileSystem.getSeparator());
		System.out.println();
		
		
		
		for(Path path : fileSystem.getRootDirectories()){
			System.out.println(path.toString());
			
		}
		
		
		
		
	}
	
	

}
