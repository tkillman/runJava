package runJava.ch06;

////////****************** �迭�� �ʱ�ȭ********************

public class Ch06Ex02 {
	
	public static void main(String[] args) {
		
		int[] a = {80,90,75,100,95};
		int tot = 0;
		double avg;
		int i;
		
		for(i=0;i<5;i++){
			tot+=a[i];
			
		}
		
		System.out.println("��ü �հ� : "+tot);
		
		avg=tot/5;
		System.out.println("��� :"+avg);
		
		
	}

}
