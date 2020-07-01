package runJava.ch07;


//******** 메소드의 다형성을 설명 **************
// 메소드 오버로딩 : 매개변수가 다른 경우

public class Ch07Ex05 {
	
	public static void main(String[] args) {
		float f= -2.5f;
		
		System.out.println(f +"의 절대값은 :" + Math.abs(f));
		
		double d= -3.4;
		System.out.println(d +"의 절대값은 :" + Math.abs(d));
		
		int i = -100;
		System.out.println(i +"의 절대값은 :" + Math.abs(i));
		
		long l = -200L;
		System.out.println(l +"의 절대값은 :" + Math.abs(l));
		
	}

}
