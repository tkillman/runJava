package runJava.ch07;


//************* 참조형 변수와 기본 변수의 차이점.
public class Ch07Ex11 {
	
	public static void main(String[] args) {
		
		int a =3;
		int b =a;
		b =5;
		System.out.println(a); //기본형 변수는 값이 복제되어 들어가기 때문에 b값이 변해도 a에는 변화가 없다.
		
		
		Point p1 = new Point();
		Point p2 = p1;
		p1.x =3; 
		p2.x =5;
		
		System.out.println(p1.x); 
		//참조형 변수의 경우는 new 연산자를 통해 메모리 할당은 한번밖에 되지 않았기 때문에
	    // p2의 값에 변화를 주면 p1의 값도 변하게 된다.	
	}
}
