package runJava.ch06;


///***************** 형식 매개변수와 실 매개변수******************

public class Ch06Ex05 {
	
	
	static void sum(int a , int b){/// 형식 매개변수
		int c;
		c=a+b;
		System.out.println("a + b =" +c);
		
	}

	public static void main(String[] args) {
		int a=10; int b=20;
		sum(a,b); //실 매개변수
		sum(4,5); // 실 매개변수
	}
	
}
