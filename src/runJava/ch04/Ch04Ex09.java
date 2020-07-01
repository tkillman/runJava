package runJava.ch04;

public class Ch04Ex09 {

	//*****do while문******* 
	
	public static void main(String[] args) {
		int total =0;
		int i=1;
		
		do{
			total+=i;
			i++;
			
			
		//그냥 while문이었다면 i가 1보다 크지 않기 때문에 반복문이 실행되지 않지만
		//do while문이기 때문에 반복문이 한번 실행되고 i값이 2가 되면서
		//반복문이 실행된다.
		}while(i>1 && i<10);
		
		System.out.println(total);
		
		
		/*while(i>1 && i<10){
			total+=i;
			i++;
		}
		System.out.println(total);
		*/
		
		
	}
	
}
