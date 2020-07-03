package hanJangHee.day1117;

import java.io.*;
import java.util.*;

class ScannerReadableEx {
	public static void main(String[] args){
		Scanner scan = null;
		FileReader fr = null;
		try{
			fr = new FileReader("e:\\scan.txt");
			scan = new Scanner(fr);
			while(scan.hasNextDouble()){
				System.out.printf("½ºÄµ double : %,.2f %n", scan.nextDouble());
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			try{
				if(fr != null) fr.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			if(scan != scan) scan.close();
		}
	}

}
