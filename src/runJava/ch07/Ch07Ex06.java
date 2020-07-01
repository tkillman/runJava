package runJava.ch07;

// ************** 메소드 오버로딩***************
// 매개변수의 갯수가 다른 경우,데이터 타입이 다른 경우


public class Ch07Ex06 {
	
	static void prn(int x, int y, int z){
		
		System.out.println(x+"+"+y+"+"+z);
		
	}
	
	static void prn(int x, int y){
		
		System.out.println(x +"+"+ y);
	}
	
	public static void main(String[] args) {
		
		prn(10,20,30);
		prn(10,20);
		
	}
	
	
}
