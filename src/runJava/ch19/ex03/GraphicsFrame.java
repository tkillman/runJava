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
					
				} //windowClosing �޼ҵ� �� 
				} // ���� ���� Ŭ���� ���� ��
				
				);
	
	}
	
	public void print(Graphics g) {
		// TODO Auto-generated method stub
		
		super.print(g);
		g.drawString("���� ���̷���", 50, 50);
		Font f1= new Font("����ü", Font.BOLD, 15);
		Font f2= new Font("�ü�ü", Font.ITALIC +Font.BOLD, 20);
		g.setFont(f1);
		Color c= new Color(255, 0, 0);
		g.setColor(c);
		g.drawString("���ǹ��̷���", 50, 90);
		g.setFont(f2);
		g.setColor(Color.blue);
		g.drawString("���ǹ��̷���", 50, 140);
		
		
	}

}
