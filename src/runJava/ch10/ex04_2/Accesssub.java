package runJava.ch10.ex04_2;
import runJava.ch10.ex04.AccessSuper;


// ********* 접근 지정자*****************
// 다른 패키지 , 다른 클래스, 서브 클래스


public class Accesssub extends AccessSuper {

	
	void showAccesssub(){
		System.out.println("클래스 AccessSuper의 show 메소드");
		/*System.out.println(m_pri);  // X
		System.out.println(m_def);*/ // x
		System.out.println("다른 패키지 + 하위 클래스에서 protected 호출"+m_pro); // o
		System.out.println("다른 패키지 + 하위 클래스에서 public 호출"+m_pub); // o
		System.out.println("-----------------");
		
	// 패키지가 달라지면 default까지 못 쓴다.	
		
	}
	

}
