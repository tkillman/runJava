package runJava.ch10.ex04_2;

import runJava.ch10.ex06.Point3D;

//******** 상속에서의 생성자***********
//1. 생성자는 상속되지 않는 유일한 멤버 변수이다.
//2. 서브 클래스의 인스턴스가 생성될 때 자신의 생성자가 호출되면 슈퍼 클래스의 생성자가
// 	 연속적으로 자동 호출된다.(이때 자동 호출되는 생성자는 매개변수가 없는 디폴트 생성자의 형태이다.)
//3. 수퍼클래스의 생성자가 먼저 실행되고 서브 클래스의 생성자가 실행된다.

public class Ch10Ex06 {

	
	public static void main(String[] args) {
		
		
		Point3D pt = new Point3D();
		
		// 3D의 생성자를 호출했는데 2D의 생성자도 같이 생성되었다.
		
	}
}
