package runJava.ch18.ex06;

import java.awt.Frame;
import java.awt.event.WindowAdapter;


/// ****** ���� Ŭ������ �̿��� ExitHandler ��ü ����

public class FrameOnly extends Frame{
	
	public FrameOnly(){
		setSize(300, 200);
		setVisible(true);
		addWindowListener(new ExitHandler());
		
	}
	
	/// ****** ���� Ŭ������ �̿��� ExitHandler ��ü ����
	class ExitHandler extends WindowAdapter{
		
		public void windowClosing(java.awt.event.WindowEvent e) {
			dispose();
			System.exit(0);
		}// windowClosing �޼ҵ� ��
		
	}// ExitHandler ���� ��

}// FrameOnly Ŭ���� ���� ��
