package runJava.ch13;


// ******** 예외처리**********

public class Ch13Ex04 {

	
	public static void main(String[] args) {
		
		try {
			String c= null;
			System.out.println(c.toString());
			
		} catch (Exception e) {
			System.out.println("예외 처리 구문");
			System.out.println(">>e<<");
			System.out.println(e); // e.toString();과 동일
			System.out.println(">>e.toString()<<");
			System.out.println(e.toString()); // exception을 표현하라.
			System.out.println(">>>e.getMessage()<<<");
			System.out.println(e.getMessage()); //exception이 받은 메세지를 출력하라.
			System.out.println(">>e.printStackTrace()<<");
			e.printStackTrace(); // e의 예외상황을 단계별로 출력해라.
		}
		
	}
	
	
}
