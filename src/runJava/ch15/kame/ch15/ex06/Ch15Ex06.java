package runJava.ch15.kame.ch15.ex06;

////********* Wrapper 클래스**************
// 기본 자료형은 스택 영역에 저장되는데 이를 힙 영역에 저장하고 싶을때
// Wrapper 클래스를 사용한다. 
// 스택 영역의 기본 자료형이 힙 영역에 자동으로 저장되는 것을 오토박싱
// 반대 상황을 오토 언박싱이라고 한다.

public class Ch15Ex06 {
	public static void main(String[] args) {
		
		Integer intA = new Integer(10);
		// Integer 클래스에 생성자의 인자로 10을 갖는 intA 객체 생성
		Integer intB = new Integer("20");
		//Integer 클래스에 생성자로 String 인자 20을 갖는 intB 객체 생성
		
		int a = intA.intValue();
		// Integer 클래스의 intValue() 메소드 호출
		// int 값을 반환하는 메소드
		int b = intB.intValue();
		
		System.out.println(a +"를 2진수로"+Integer.toBinaryString(a));
		System.out.println(a +"를 8진수로"+Integer.toOctalString(a));
		System.out.println(a +"를 2진수로"+Integer.toHexString(a));

		int c = Integer.parseInt("255");
		int d = Integer.parseInt("11111111",2);
		
		System.out.println("문자열 상수 255를 10진수로 인식:"+c);
		System.out.println("문자열 상수 11111111를 2진수로 인식:"+d);
		
	}
	

}
