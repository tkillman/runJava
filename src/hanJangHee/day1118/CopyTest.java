package hanJangHee.day1118;

import java.io.*;
import java.util.Scanner;

class CopyTest {
	public static void main(String[] args){
		System.out.println("���� ��� : ");
		String path = new Scanner(System.in).next();
		copy(path);
	}
	
	public static void copy(String filePath){
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		byte[] readbyte;
		
		try{
			File o = new File(filePath);
			String copyFile = o.getName();
			File f = new File("e:\\"+ copyFile);
			
			fis = new FileInputStream(o);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(f);
			bos = new BufferedOutputStream(fos);
			
			readbyte = new byte[fis.available()];
			
			while(bis.read(readbyte) != -1){
				  bos.write(readbyte);
			}
			
			if(f.length() == 0){
				System.out.println("���� �ȵ�");
				f.delete();
			}else{
				System.out.println("���� ����");
			}
		}catch(FileNotFoundException fe){
			System.out.println("���� ���� " + fe.getMessage());
				
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			try{
				bos.close();
				bis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
