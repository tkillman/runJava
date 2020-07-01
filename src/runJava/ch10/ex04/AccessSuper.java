package runJava.ch10.ex04;

//****************** 접근 지시자의 사용**********************

// 같은 클래스, 같은 패키지 안
public class AccessSuper {

	private int m_pri=10;
	int m_def=20;
	protected int m_pro=30;
	public int m_pub=40;
	
	
	
	public void showAccessSuper(){
		
		System.out.println("클래스 AccessSuper의 show 메소드");
		System.out.println("같은 패키지,같은 클래스 내에서 private 호출 :" +m_pri); 
		System.out.println("같은 패키지,같은 클래스 내에서 default 호출 :"+m_def);
		System.out.println("같은 패키지,같은 클래스 내에서 protected 호출 :"+m_pro);
		System.out.println("같은 패키지,같은 클래스 내에서 public 호출 :"+m_pub);
		System.out.println("-----------------");
		
	}
}
