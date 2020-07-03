package hanJangHee.day1116;

import java.io.*;

class FileInputStreamEx {
	public static void main(String[] args){
		FileInputStream fis = null;
		byte _read[] = new byte[100];
		byte console[] = new byte[100];
		try{
			System.out.println("ÆÄÀÏ¸í : ");
			System.out.println(console);
			String file = new String(console).trim();
			fis = new FileInputStream(file);
			fis.read(_read,0,_read.length);
			System.out.println(new String(_read).trim());
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			try{if(fis != null)
				fis.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}

}
