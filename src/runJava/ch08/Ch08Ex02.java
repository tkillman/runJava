package runJava.ch08;


/////////// *************** this() 생성자의 이해***********************
/// Point1.java 와 함께 볼 것.

public class Ch08Ex02 {
	
	public static void main(String[] args) {
		Point1 pt01 = new Point1(10,20); //생성자로 매개변수 두개를  준 메소드 실행
		pt01.showPoint();
		
		
		//매개변수가 없는 디폴트 생성자는 자동적으로 호출되는데 이때 this(10,10)이 실행되고
		// x값을 30으로 변경시키므로 인해서 결과값은 30,10이 나오게 된다.
		Point1 pt02 = new Point1(30); 
		pt02.showPoint();
		
		
		// 디폴트 생성자로 인해 10,10이 호출된다.
		Point1 pt03 = new Point1();
		pt03.showPoint();
		
	}

}
