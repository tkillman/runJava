package hanJangHee.day1117;

import java.util.*;
import java.io.*;

class ScannerFileEx {
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(new File("e:\\scan.txt"));
			while(scan.hasNextDouble()){
				System.out.printf("½ºÄµ double : %,.2f %n", scan.nextDouble());
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			if(scan != null)
				scan.close();
			}
		}
	}


