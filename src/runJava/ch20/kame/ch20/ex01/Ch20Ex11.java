package runJava.ch20.kame.ch20.ex01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



public class Ch20Ex11 {

	
	// ***** ��ü ������ ������ ���� Externalizable �������̽� implements 
	// writeObject() �޼ҵ� ���
	
	public static void main(String[] args) {
		Member  mem=new Member("�����", "dong", "1234", true, 24, "010-8449-0556");
		
		File f= new File("C:\\java_workspace\\Ch20\\mem4.dat");
		
		try {
			//���Ͽ� �߰� �Է�
			FileOutputStream fos= new FileOutputStream(f,true);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			
			//Externalizable�� ��ӹ��� ��ü�� ����
			oos.writeObject(mem);
			oos.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
