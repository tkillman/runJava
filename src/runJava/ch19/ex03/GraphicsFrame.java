package runJava.ch19.ex03;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
		
		super.print(g);
		g.drawString("해피 바이러스", 50, 50);
		Font f1= new Font("바탕체", Font.BOLD, 15);
		Font f2= new Font("궁서체", Font.ITALIC +Font.BOLD, 20);
		g.setFont(f1);
		Color c= new Color(255, 0, 0);
		g.setColor(c);
		g.drawString("해피바이러스", 50, 90);
		g.setFont(f2);
		g.setColor(Color.blue);
		g.drawString("해피바이러스", 50, 140);
		
		
	}

}
