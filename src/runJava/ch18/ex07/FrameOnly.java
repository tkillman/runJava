package runJava.ch18.ex07;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/////////************* 무명 클래스로 설계****************

public class FrameOnly extends Frame {
	
	public FrameOnly(){
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(
				new WindowAdapter() { public void windowClosing(WindowEvent e){
					dispose();
					System.exit(0);
					
				} //windowClosing 메소드 끝 
				} // 내부 무명 클래스 정의 끝
				
				); // addWindowListener 메소드 끝
	}// FrameOnly 생성자 끝
} // FrameOnly 클래스 정의 끝
