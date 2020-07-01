package runJava.ch13;


//// ************** throw절로 예외 발생시키기*****************

// throw는 사용자가 직접 예외를 발생시키고 싶을 때 사용하는 키워드

public class Ch13Ex07 {

	public static void throwException(){
		
		try {
			
			System.out.println(">>throwException 함수호출<<");
			throw new Exception("사용자가 예외 발생시킴");
			
		} catch (Exception e) {
			System.out.println(">>cathch 구문 : 예외를 처리한다. <<");
			System.out.println(e);
		
		} 
		
	} // throwException 메소드 종료
	
	public static void main(String[] args) {
		System.out.println(">>main 함수에서 예외를 발생시키는 함수 호출<<");
		
		throwException(); // 예외 발생 함수
		System.out.println(">>정상종료<<");
	}
	
}
