package runJava.ch20.kame.ch20.ex01;

import java.io.File;
import java.util.Date;


////////////// ******************** File Ŭ������ �ֿ� �޼ҵ�� **********/////////

public class Ch20Ex05 {
	public static void main(String[] args) {
		
		File file= null;
		byte [] byteFileName = new byte[100];
		String fileName;
		System.out.print("���ϸ� �Է�-->");
		
		try {
			System.in.read(byteFileName);
			fileName = new String(byteFileName).trim();
			file = new File(fileName);
			
			System.out.println("������"+file.getAbsolutePath());
			System.out.println("ǥ�ذ��"+file.getCanonicalPath());
			System.out.println("�ֱ� ������"+new Date(file.lastModified()));
			System.out.println("����ũ��"+file.length() +"Chkb");
			System.out.println("�б�Ӽ�"+file.canRead());
			System.out.println("������"+file.canWrite());
			System.out.println("���� ���"+file.getParent());
			System.out.println("����Ӽ�"+file.isHidden());
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
	}

}
