package runJava.ch13;

//************ 예외 처리 미루기  *************
//************ throws ***************
// throw : 사용자가 예외를 발생 시킴 ,    
//			throw new 예외_클라스();
// throws : 발생된 예외를 호출한 객체로 처리를 미룬다.
//			public void 메서드이름(매개변수) throws Exception{}

public class Ch13Ex08 {

	public static void throwException() throws Exception{ // 예외 발생 구문이 있음에도 처리해 주지 않고 throws를 통해 메인 메소드로 넘겨버림
		
		System.out.println(">>throwException 함수 호출<<");
		
		throw new Exception("사용자가 예외를 발생시킴"); //예외 발생 구문
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println(">>main 함수에서 예외를 발생시키는 함수(throwException()) 호출<<");
			throwException();
		//예외 발생 메소드를 호출한 곳에서 예외를 처리하고있다.	
			
		} catch (Exception e) {
			
			System.out.println(">>catch 구문 : 예외를 처리한다. <<");
			System.out.println(e);
			
		}
		System.out.println(">>정상종료<<");		
	}

}
