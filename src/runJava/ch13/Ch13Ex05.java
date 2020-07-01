package runJava.ch13;


///********************* finally 사용 예제********************////
public class Ch13Ex05 {

	public static void main(String[] args) {

		
		try {
			
			System.out.println(">>try 구문 : 예외를 감지<<");
			String c= null;
		//	System.out.print(c.toString()); 
			// null을 문자열로 바꿔서 출력해라.. 오류
			
		} catch (NullPointerException e) {

			System.out.println("예외가 발생하여 Exception 객체가 잡음");
			System.out.println(e);
		
		} finally{
			System.out.println(">>finally 구문<<");
			System.out.println("try/catch 구문에 대한 정리를 한다. <<");
			System.out.println("예외에 상관없이 반드시 수행한다.");
			
			
		}
		
		System.out.println("정상종료");
	}

}
