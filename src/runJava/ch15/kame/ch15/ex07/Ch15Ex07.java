package runJava.ch15.kame.ch15.ex07;



////************* String 변수를 바로 선언하는 경우의 특이점 ************
//// ******* 바로 String 값을 줄 경우 인스턴스는 하나만 생성된다.

public class Ch15Ex07 {


	//******new 연산자를 사용하지 않고 같은 내용의 문자열 상수를 사용해 인스턴스를 만든 경우 한번만 메모리를 할당************
	public static void main(String[] args) {
		
		
		String str1= "해피 바이러스";
		String str2= "해피 바이러스";
		
		if(str1==str2){
			System.out.println("str1과 str2가 동일 인스턴스를 참조");
			
		} else {System.out.println("str1과 str2가 다른 인스턴스를 참조");}
		
	}
	
	
}
