package hanJangHee.day1118;

import java.io.*;

class RandomAccessFileEX {
	public static void main(String[] args){
		RandomAccessFile ra = null;
		try{
			ra = new RandomAccessFile("e:\\random.txt", "rw");
			String receive = "hello";
			ra.seek(ra.length());
			ra.write(receive.getBytes());
			byte[] buf = new byte[(int) ra.length()];
			ra.seek(0);
			ra.read(buf);
			System.out.println("ó�� ���� ���� : ");
		    System.out.println(new String(buf));
		    ra.seek(2);
		    ra.read(buf);
		    System.out.println("�ٽ� ���� ���� : ");
		    System.out.println(new String(buf));
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			try{
				if(ra != null) ra.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}

}
