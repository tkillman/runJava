package runJava.ch06;

////////****************** 배열의 초기화********************

public class Ch06Ex02 {
	
	public static void main(String[] args) {
		
		int[] a = {80,90,75,100,95};
		int tot = 0;
		double avg;
		int i;
		
		for(i=0;i<5;i++){
			tot+=a[i];
			
		}
		
		System.out.println("전체 합계 : "+tot);
		
		avg=tot/5;
		System.out.println("평균 :"+avg);
		
		
	}

}
