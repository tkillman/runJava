package runJava.ch19.ex02;

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
					
				} //windowClosing �޼ҵ� �� 
				} // ���� ���� Ŭ���� ���� ��
				
				);
	
	}
	
	public void print(Graphics g) {
		// TODO Auto-generated method stub
		
		
		g.drawString("���� ���̷���", 50, 50);
		Font f1= new Font("����ü", Font.BOLD, 15);
		Font f2= new Font("�ü�ü", Font.ITALIC +Font.BOLD, 20);
		g.setFont(f1);
		g.drawString("���ǹ��̷���", 50, 90);
		g.setFont(f2);
		g.drawString("���ǹ��̷���", 50, 140);
	}

}
