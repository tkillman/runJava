package hanJangHee.day1117;

import java.io.*;

class PrintWriterSecondEx {
	public static void main(String[] args){
		PrintWriter pw = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try{
			fos = new FileOutputStream("e:\\printWriterSecond.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos, true);
			pw.println("�ȳ��ϼ���!!");
			pw.println("�� �����׿�.");
			pw.println(100.0);
			pw.println(new Boolean(true));
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			try{
				if(fos != null) fos.close();
				if(bos != null) bos.close();
				if(pw != null) pw.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}
}
