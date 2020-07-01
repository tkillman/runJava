package runJava.ch20.kame.ch20.ex01;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;


/////////************ ������ Ÿ��(int, boolean,byte,char,short,long,String)�� ó���ϱ� ���� 
//////// ***DataInputStream �� DataOutputStream ****
/////// DataoutStream �ֿ� �޼ҵ� writeUTF(mem_name),writeBoolean(mem_gender),write(mem_age) 
//DataInputStream�� �ֿ� �޼ҵ�
/*
 * DataInputStream(inputStream input) DataInputStream ��ü ����
 * 
 * int read(byte buffer[], int off, int len) len���� ����Ʈ�� �о ����Ʈ �迭 buffer�� off ��ġ�� ����
 * int read(byte buffer[]) ����Ʈ �迭 ũ�⸸ŭ ����Ʈ�� ��ȯ
 * void readFully(byte buffer[]) ��Ʈ������ buffer ũ�⸸ŭ�� ����Ʈ�� �о buffer �迭�� ����
 * void readFully(byte buffer[],int off, int len)
 * byte readByte()
 * char readChar()
 * short readShort()
 * int readInt()
 * long readLong()
 * double readDouble()
 * float readFloat()
 * String readUTF()
 * */


public class Ch20Ex07 {
	
	public static void main(String[] args) {
		
		String mem_name=null;
		String mem_id= null;
		String mem_pwd=null;
		boolean mem_gender= true;
		int mem_age=0;
		String mem_phone=null;
		String temp = null;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		File f= new File("C:\\java_workspace\\Ch20\\mem2.dat");
		
		try {
			
			FileOutputStream fos= new FileOutputStream(f,true);
			DataOutputStream dos= new DataOutputStream(fos);
			
			System.out.println("--ȸ������ �Է��ϱ�--");
			System.out.print("�̸�>>>>");
			mem_name=br.readLine();
			System.out.print("���̵�>>>>");
			mem_id=br.readLine();
			System.out.print("��й�ȣ>>>>");
			mem_pwd=br.readLine();
			System.out.print("����>>>>");
			temp=br.readLine();
			if(temp.equals("����")){
				mem_gender=true;
			} else {mem_gender=false;}
			
			System.out.print("����>>>>");
			temp=br.readLine();
			mem_age= Integer.parseInt(temp);
			
			System.out.print("��ȭ��ȣ>>>>");
			mem_phone=br.readLine();
			
			dos.writeUTF(mem_name);
			dos.writeUTF(mem_id);
			dos.writeUTF(mem_pwd);
			dos.writeBoolean(mem_gender);
			dos.writeInt(mem_age);
			dos.writeUTF(mem_phone);
			dos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	

}
