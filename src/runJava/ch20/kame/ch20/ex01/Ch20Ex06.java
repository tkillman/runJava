package runJava.ch20.kame.ch20.ex01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

//////////***************** ���� ��Ʈ�� (���� ������)************////////////
//** InputStreamReader  -->> ����Ʈ ��Ʈ���� ���� ��Ʈ������ ��ȯ
// System.in�� �Է� ����� ����Ʈ �ڵ�

//		InputStreamReader(System.in) --> ����Ʈ �ڵ带 ���ڷ� �ٲ۴�.
// BufferedReader Ŭ������ readLine �޼ҵ带 �̿��ؼ� ���� ������ ���ڿ��� �Է¹޾� ó�� ����.


// ******** ���Ͽ� �Է�************
public class Ch20Ex06 {
	
	public static void main(String[] args) {
		String mem_name=null;
		String mem_id= null;
		String mem_pwd=null;
		String mem_gender= null;
		String mem_age=null;
		String mem_phone=null;
		
		// isr �Է¹��� �����͸� ���ڷ� ����
 		// isr�� �����͸� ó���ϱ� ���� BufferredReader
		// FileWriter Ŭ������ write() �޼ҵ�� ���Ͽ� �Է��� �����ϰ�
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		File f=new File("C:\\java_workspace\\Ch20\\mem.dat");
		
		try {
			
			//���������� ���뿡 �߰��� ������ �� ���ְ� ����� ��.
			FileWriter fw= new FileWriter(f, true); 
			
			
			System.out.println("--ȸ������ �Է��ϱ�--");
			System.out.print("�̸�>>>>");
			mem_name=br.readLine();
			System.out.print("���̵�>>>>");
			mem_id=br.readLine();
			System.out.print("��й�ȣ>>>>");
			mem_pwd=br.readLine();
			System.out.print("����>>>>");
			mem_gender=br.readLine();
			System.out.print("����>>>>");
			mem_age=br.readLine();
			System.out.print("��ȭ��ȣ>>>>");
			mem_phone=br.readLine();
			
			fw.write(mem_name); fw.write("\r\n");
			fw.write(mem_id); fw.write("\r\n");
			fw.write(mem_pwd); fw.write("\r\n");
			fw.write(mem_gender); fw.write("\r\n");
			fw.write(mem_age); fw.write("\r\n");
			fw.write(mem_phone); fw.write("\r\n");
			fw.close();
			//fw.close �Ǿ�� �����Ͱ� �Էµǰ� ������.
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
