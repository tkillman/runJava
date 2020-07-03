package hanJangHee.day1116;

import java.io.*;

class FileOutputStreamEx {
	public static void main(String[] args){
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("e://fileout.txt");
			
			String message = "Hello FileOutputStream!!";
			fos.write(message.getBytes());
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			try{
				if(fos != null)
					fos.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}

}
