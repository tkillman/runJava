package runJava.ch08;


///////////// ******************Static 멤버변수의 이해(정적 필드)***************************
// static 변수는 클래스가 공유하기 때문에 그 값이 계속 증가하지만 그냥 변수는 객체별로 똑같다. *********

public class Ch08Ex03 {
	
	public static void main(String[] args) {
		System.out.println("Account.total :" +Account.total );
		
		Account acc01= new Account(10);
		
		System.out.println("acc01.total :" +acc01.total);
		System.out.println("acc01.count :" +acc01.count);
		
		Account acc02 = new Account(10);
		System.out.println("acc02.total :" +acc02.total);
		System.out.println("acc02.count :" +acc02.count);
		
		Account acc03 = new Account(10);
		System.out.println("acc03.total :" +acc03.total);
		System.out.println("acc03.count :" +acc03.count);
	}

}
