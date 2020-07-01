package runJava.ch19.ex04;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

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
	
		g.setColor(Color.black);
		g.drawLine(10,20,30,40);	
		
		g.drawRect(250, 100,100, 100);
		
	
		g.fillOval(450, 100, 100, 100);
		
		int x[] = new int[]{650,600,700};
		int y[]= new int[]{100,200,200};
		g.drawPolygon(x,y,x.length);
		
	}

		
}
