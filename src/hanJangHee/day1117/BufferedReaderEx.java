package hanJangHee.day1117;

import java.io.*;

class BufferedReaderEx {
	public static void main(String[] args){
		FileReader fr = null;
		BufferedReader br = null;
		try{
			fr = new FileReader("e:\\test.txt");
			br = new BufferedReader(fr);
			String msg;
			while((msg = br.readLine()) != null){
				System.out.println(msg);
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			try{
			if(fr != null) fr.close();
			if(br != null) br.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}

}

}