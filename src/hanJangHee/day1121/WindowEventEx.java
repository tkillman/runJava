package hanJangHee.day1121;

import java.awt.*;
import java.awt.event.*;

class WindowEventEx extends Frame{
	public WindowEventEx(){
		super("WindowEvent �׽�Ʈ");
		
		Label exit = new Label("�������� ���� ��ư�� ���� �ּ���");
		
		add(exit);
		
		setBounds(300,300,200,200);
		setVisible(true);
		
		addWindowListener(new WindowEventHandler1());
	}
	
	public static void main(String[] args){
		new WindowEventEx();
	}

}

class WindowEventHandler1 extends WindowAdapter{
	
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}
