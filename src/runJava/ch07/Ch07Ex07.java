package runJava.ch07;

// varargs ¸¦ ÀÌ¿ë ...

public class Ch07Ex07 {
	
	static void prn(int ...num){
		
		for(int i=0;i<num.length;i++){
			
			System.out.print(num[i] +"\t");
			
		}
			System.out.println("");
	}
	
	public static void main(String[] args) {
		
		prn(10,20,30);
		prn(10,20);
		prn(10);
		
	}

}
