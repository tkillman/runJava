package runJava.ch19.ex01;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//////////************* Frame의 print() 메소드********************
public class GraphicsFrame extends Frame {

	public GraphicsFrame() {
		setSize(300,200);
		setVisible(true);
		
		
		addWindowListener(
				new WindowAdapter() { public void windowClosing(WindowEvent e){
					dispose();
					System.exit(0);
					
				} //windowClosing 메소드 끝 
				} // 내부 무명 클래스 정의 끝
				
				);
		
		
	}
	
	public void print(Graphics g) {
		// TODO Auto-generated method stub
		
		g.drawString("해피 바이러스", 50, 50);
	}

}
