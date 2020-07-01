package runJava.ch06;

///************* return의 쓰임새************
// 1. 메소드의 결과값을 반환 
//2. 현재실행시점에서 더이상 문장을 진행하지 않고 메소드를 빠져나온다.


public class Ch06Ex06 {
	
	static int abs(int x){
		int y;
		if(x<0)
		y=-x;
		else 
			y=x;
		return y;
		
	}

	public static void main(String[] args) {
		int a=-5, result; // int형 자료 result 특이한 정의방식이네
		
		result = abs(a);
		
		System.out.println(a+"의 절대값은  :" +result +"이다.");
		
		System.out.println(10 +"의 절대값은 : " +abs(10) +"이다.");
	}
	
}
