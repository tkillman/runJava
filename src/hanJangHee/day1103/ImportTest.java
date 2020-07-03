package hanJangHee.day1103;

import java.text.SimpleDateFormat;

class ImportTest {

	public static void main(String[] args){
		
		java.util.Date d = new java.util.Date();
		//System.out.println(d);
		SimpleDateFormat f
		=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a z");
		
		String date = f.format(d);
		System.out.println(date);
		
	}
	
	
}
