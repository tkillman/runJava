package runJava.ch15.kame.ch15.ex07;

//************String 클래스의 다양한 메소드들*********
// ******** 특징 String의 객체값은 변하질 않는다.

public class Ch15Ex10 {
	

	public static void main(String[] args) {
		
		String str= new String("해피");
		System.out.println(str); // 해피 출력
		
		// String 클래스의 concat() 메소드 : 다음 문자에 붙여서 출력
		String str1=str.concat("바이러스");
		System.out.println(str1); //해피바이러스 출력
		
		
		//length() 메소드: 해피 바이러스 길이 출력==> 6글자
		int len= str1.length();
		System.out.println(len); // 6 출력
		
		
		// charAt(int a) 메소드: a 번째 문자를 출력
		char ch= str1.charAt(2); 
		System.out.println(ch); // 해피바 0,1,2
		
		//indexOf(문자) 메소드 : 문자가 몇번째에 위치해 있는지 위치 출력
 		int pos=str1.indexOf(ch);
		System.out.println(pos);
		
		// substring(int a) 메소드 : 3번째부터 출력 해피바이 0,1,2,3
		String str2= str1.substring(3);
		System.out.println(str2);
		
		
		// substring(int a, int b) 메소드: 2번째부터 3번째까지 출력 해피바이러 0,1,2,3,4
		String str3=str1.substring(2, 4);
		System.out.println(str3);
	}
	
}
