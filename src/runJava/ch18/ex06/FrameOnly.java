package runJava.ch18.ex06;

import java.awt.Frame;
import java.awt.event.WindowAdapter;


/// ****** 내부 클래스를 이용한 ExitHandler 객체 생성

public class FrameOnly extends Frame{
	
	public FrameOnly(){
		setSize(300, 200);
		setVisible(true);
		addWindowListener(new ExitHandler());
		
	}
	
	/// ****** 내부 클래스를 이용한 ExitHandler 객체 생성
	class ExitHandler extends WindowAdapter{
		
		public void windowClosing(java.awt.event.WindowEvent e) {
			dispose();
			System.exit(0);
		}// windowClosing 메소드 끝
		
	}// ExitHandler 정의 끝

}// FrameOnly 클래스 정의 끝
