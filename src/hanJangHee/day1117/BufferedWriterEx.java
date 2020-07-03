package hanJangHee.day1117;

import java.io.*;

class BufferedWriterEx {
	public static void main(String[] args){
		FileWriter fw = null;
		BufferedWriter bw = null;
		try{
			fw = new FileWriter("e:\\bufferedWriter.txt", true);
			bw = new BufferedWriter(fw);
			bw.write("BufferedWriter 테스트입니다.");
			bw.newLine();
			bw.write("안녕하세요" + System.getProperty("line.separator"));
			bw.flush();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			try{
				if(fw != null) fw.close();
				if(bw != null) bw.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}

}
