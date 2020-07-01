package runJava.ch13;


//*************** 예외 처리******************

// 맨 위의 catch구문에서 예외가 처리되면 로직을 빠져나가기 때문에 맨 위쪽에 구체적인 예외 상황을 적어줘야 오류가 안 난다.

public class Ch13Ex01 {

	public static void main(String[] args) {

		
		try {
			String c= null;
			System.out.print(c.toString()); 
			// null을 문자열로 바꿔서 출력해라.. 오류
			
		} catch (NullPointerException e) {

			System.out.println("예외가 발생하여 Exception 객체가 잡음");
			System.out.println(e);
		}
		System.out.println("정상종료");
	}

}
