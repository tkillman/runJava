package runJava.ch18.ex07;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/////////************* ���� Ŭ������ ����****************

public class FrameOnly extends Frame {
	
	public FrameOnly(){
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(
				new WindowAdapter() { public void windowClosing(WindowEvent e){
					dispose();
					System.exit(0);
					
				} //windowClosing �޼ҵ� �� 
				} // ���� ���� Ŭ���� ���� ��
				
				); // addWindowListener �޼ҵ� ��
	}// FrameOnly ������ ��
} // FrameOnly Ŭ���� ���� ��
