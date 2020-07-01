package runJava.ch18.ex04;

import java.awt.Frame;




public class FrameOnly extends Frame {
	
	public FrameOnly(){
		
		setSize(300,200);
		setVisible(true);
		
		ExitHandler handler = new ExitHandler();
		addWindowListener(handler);
	}
	

}
