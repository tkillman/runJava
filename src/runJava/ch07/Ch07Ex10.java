package runJava.ch07;


// ********** 매개변수가 있는 생성자를 정의하는 경우 컴파일러가 자동적으로 만들어주던 
// 매개변수가 없는 생성자를 안 만들어주므로 자신이 정의해야함을 꼭 기억하자!!

public class Ch07Ex10 {

	public static void main(String[] args) {
		
		//Point2 pt02=new Point2();
		//프로그래머가 매개변수 있는 생성자를 만들어서
		//자동 제공되던 매개변수 없는 생성자가 생기지 않게 된다.
		//프로그래머가 직접 매개변수가 없는 생성자를 정의해주어야한다.
		
		Point2 pt02 = new Point2(10,20);
		
		pt02.showPoint();
		
	}

}
