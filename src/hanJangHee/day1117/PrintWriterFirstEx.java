package hanJangHee.day1117;

import java.io.*;

class PrintWriterFirstEx {
	public static void main(String[] args){
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try{
			fw = new FileWriter("e:\\printWriterFirst.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true);
			pw.println("�ȳ��ϼ���");
			pw.print("�ݰ����ϴ�");
			pw.println(100);
			pw.println(new Integer("1000"));
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			try{
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if(pw != null) pw.close();
					}catch(IOException ioe){
						ioe.printStackTrace();
					}
		}
	}

}
