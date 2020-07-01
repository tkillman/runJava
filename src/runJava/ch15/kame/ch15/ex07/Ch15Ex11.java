package runJava.ch15.kame.ch15.ex07;


//**************StringBuffer 클래스의 다양한 메소드들 ************
// ********* 특징  : StringBuffer의 객체 값은 변화한다.
public class Ch15Ex11 {
	
	public static void main(String[] args) {
		StringBuffer str= new StringBuffer();
		int len = str.length(); // 글자수를 알려준다.
		int size = str.capacity(); // 메모리 크기를 알려준다.
		
		System.out.println(str+"/"+len+"/"+size);
		
		
		str.append("누구든지 사랑하기 위해선"); // 문자열 추가
		len = str.length();
		size= str.capacity();
		System.out.println(str+"/"+len+"/"+size);
		
		
		str.append("한 번쯤의 증오의 가슴이어야 했다.");
		len = str.length();
		size= str.capacity();
		System.out.println(str+"/"+len+"/"+size);
	}
	

}
