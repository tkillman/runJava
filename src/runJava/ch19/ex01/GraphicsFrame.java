package runJava.ch19.ex01;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//////////************* Frame�� print() �޼ҵ�********************
public class GraphicsFrame extends Frame {

	public GraphicsFrame() {
		setSize(300,200);
		setVisible(true);
		
		
		addWindowListener(
				new WindowAdapter() { public void windowClosing(WindowEvent e){
					dispose();
					System.exit(0);
					
				} //windowClosing �޼ҵ� �� 
				} // ���� ���� Ŭ���� ���� ��
				
				);
		
		
	}
	
	public void print(Graphics g) {
		// TODO Auto-generated method stub
		
		g.drawString("���� ���̷���", 50, 50);
	}

}
