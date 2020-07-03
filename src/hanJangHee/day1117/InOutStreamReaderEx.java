package hanJangHee.day1117;

import java.io.*;

class InOutStreamReaderEx {
	public static String consoleInput(String input) throws IOException{
		System.out.println(input + " : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String message = br.readLine();
		return message;
	}
	
	public static void main(String[] args) throws IOException{
		String id = consoleInput("id");
		String password = consoleInput("password");
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		out.write("id : " + id + " , password : " + password);
		out.close();
	}
	

}
