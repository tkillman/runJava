package runJava.ch04;

public class Ch04Ex09 {

	//*****do while��******* 
	
	public static void main(String[] args) {
		int total =0;
		int i=1;
		
		do{
			total+=i;
			i++;
			
			
		//�׳� while���̾��ٸ� i�� 1���� ũ�� �ʱ� ������ �ݺ����� ������� ������
		//do while���̱� ������ �ݺ����� �ѹ� ����ǰ� i���� 2�� �Ǹ鼭
		//�ݺ����� ����ȴ�.
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
