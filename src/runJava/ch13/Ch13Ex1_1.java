package runJava.ch13;

public class Ch13Ex1_1 {

	public static void main(String[] args) {

		
		try {
			String c= null;
			System.out.print(c.toString()); 
			// null을 문자열로 바꿔서 출력해라.. 오류
			
		} catch (NullPointerException e) {

			System.out.println("예외가 발생하여 Exception 객체가 잡음");
			System.out.println(e);
		} catch(Exception e){ 
			// 만일 위의 catch문의 조건절과 조건이 바껴있다면 컴파일 에러 발생!! 왜??
		//하위 클래스가 더 구체적인 내용을 내포하고 있기 때문에 하위 클래스의 예외 처리를 먼저 고려해주어야 한다.
		//만약 상위 클래스의 예외처리를 맨 앞에 고려한다면 아래의 catch문은 실행되지도 못한다.	
			
			
			System.out.println(e);
			
		}//catch 종료
		
		
		System.out.println("정상종료");
	} // try 종료

}
