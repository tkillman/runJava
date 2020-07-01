package runJava.ch10.ex04_2;

//************접근 지정자*****************

/****요약 정리***
		1.클래스  2.같은패키지 3.하위클래스	4. 다른패키지
private     0
default     0         0
protected   0		  0       0	
public      0         0       0          0

0가 쳐진부분에서는 접근 가능.*/

// 보는 방법 : 먼저 패키지가 같은가를 비교한다. 2,4번을 확인 후 1,3번을 확인한다.

public class ch10Ex04 {

	public static void main(String[] args) {
		Accesssub obj= new Accesssub();
		
		obj.showAccessSuper();
		obj.showAccesssub();
	
		System.out.println("클래스 ch10Ex04의 메인 메소드");
		/*System.out.println(obj.m_pri);  // X
		System.out.println(obj.m_def); // x
		System.out.println(obj.m_pro);*/ // x
		System.out.println("다른 패키지 , 하위 클래스가 아닌 곳에서 public 호출"+obj.m_pub); // o
		System.out.println("-----------------");
		
		
	}

}
