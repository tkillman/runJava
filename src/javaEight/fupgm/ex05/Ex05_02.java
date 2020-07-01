package javaEight.fupgm.ex05;

//MyFunction<T1,T2,T3,R>을 구현해서 Ex05_01을 만들어보세요.

public class Ex05_02 {
	
	public static void main(String[] args) {
		
		MyFunction<Integer, Integer, Integer, String> myf = 
				(Integer t1, Integer t2, Integer t3) -> String.valueOf(t1 + t2 + t3);
			
		System.out.println(myf.apply(1, 3, 6));
	}
	
}
