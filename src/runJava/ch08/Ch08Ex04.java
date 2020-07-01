package runJava.ch08;



///////////*******Static 변수 이해(정적 메소드)*************
// 클래스명.메소드 호출 가능 --> 클래스들 끼리 공유해야 할 메소드일 경우
// 정적 메소드에서는 this나  인스턴스 변수를 사용할 수 없다.


public class Ch08Ex04 {

	public static void main(String[] args) {
		
		Account.showTotal(); 

		Account acc01 = new Account(10);
		Account.showTotal();
		acc01.showTotal();

		Account acc02 = new Account(20);
		Account.showTotal();
		acc02.showTotal();
		
	}

}
