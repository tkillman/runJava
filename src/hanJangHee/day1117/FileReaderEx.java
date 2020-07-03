package hanJangHee.day1117;

import java.io.*;

class FileReaderEx {
	public static void main(String[] args){
		FileReader fr = null;
		try{
			fr = new FileReader("e:\\fileout.txt");
			int readChar;
			while((readChar = fr.read()) != -1){
				System.out.print((char) readChar);
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			try{
			if(fr != null) fr.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
	}

}
}
}