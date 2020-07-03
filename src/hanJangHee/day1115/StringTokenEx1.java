package hanJangHee.day1115;

import java.util.StringTokenizer;

class StringTokenEx1 {
	
	StringTokenizer st;
	public StringTokenEx1(String str, String delim){
		System.out.println("str : " + str);
		st = new StringTokenizer(str, delim, true);
		
	}
	
	public void print(){
		System.out.println("Token coutn :" + st.countTokens());
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println("----------------------------");
	}
	
	public static void main(String[] args){
		
		StringTokenEx1 st2 = new StringTokenEx1("2005/08/15","/");
		st2.print();
	}

}
