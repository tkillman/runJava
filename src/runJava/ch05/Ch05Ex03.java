package runJava.ch05;

public class Ch05Ex03 {

	///// *******이중 반복문**********
	public static void main(String[] args) {
		int result;
		for(int i=2;i<10;i++){
			System.out.println("----"+i+"단-----");
			for(int j=1;j<10;j++){
				
				result =i*j;
				System.out.println(i +"*"+j+"="+result);
			}
		}
		
		
	}
	
	
}
