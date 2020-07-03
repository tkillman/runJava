package hanJangHee.day1121;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WindowEventEx1 extends Frame implements WindowListener{
	
	public static void main(String[] args){
		new WindowEventEx1();
	}
	
	WindowEventEx1(){
		super("window Event!!");
		
		addWindowListener(this);
		Label l = new Label("window Event Test.", Label.CENTER);
		add(l);
		setBounds(300,300,300,300);;
		setVisible(true);
	}
	
	public void windowActivated(WindowEvent e){}
	
	public void windowClosed(WindowEvent e){}
	
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent e) {}

	public void windowDeiconified(WindowEvent e) {}

	public void windowIconified(WindowEvent e) {}

	public void windowOpened(WindowEvent e) {}
}
