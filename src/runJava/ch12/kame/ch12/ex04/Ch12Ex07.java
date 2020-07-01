package runJava.ch12.kame.ch12.ex04;

//인터페이스 ColorShape를 implements 받는  ColorCircle 클라스

// 인터페이스가 인터페이스를 상속 받을 때는 extends 사용
 
public class Ch12Ex07 {

		public static void main(String[] args) {
			
			ColorCircle ref= new ColorCircle();
			ref.setColor(Color.GREEN);
			ref.draw();
		}
}


