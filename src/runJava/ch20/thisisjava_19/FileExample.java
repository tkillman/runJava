package runJava.ch20.thisisjava_19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//********* FileExample *****************
// ������ �Ӽ��� ���� �� �ִ� Files Ŭ����



public class FileExample {

	public static void main(String[] args) {
		
		Path path = Paths.get("src/thisisjava_19/FileExample.java");
		
		System.out.println("���丮 ���� : " + Files.isDirectory(path)); //���丮�� �ƴϴ�.
		System.out.println("���� ���� : " + Files.isRegularFile(path)); //�����̴�.
		
		try {
			System.out.println("������ ���� �ð� : " + Files.getLastModifiedTime(path));
			System.out.println("���� ũ�� : " + Files.size(path));
			System.out.println("������  :" + Files.getOwner(path) );
			System.out.println("���� ���� ���� : " + Files.isHidden(path));
			System.out.println("�б� ���� ���� : " + Files.isReadable(path));
			System.out.println("���� ���� ���� : " + Files.isWritable(path));
			
			
			
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
