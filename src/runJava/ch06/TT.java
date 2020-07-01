package runJava.ch06;


public class TT {
	static int result;

	public static int sb(int a){
		

		if(a>3){
			
			result = a*3;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sb(1));
		
	}
	

}
