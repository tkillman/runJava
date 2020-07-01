package runJava.ch17.ex05;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


//////////**************** 배치 관리자중 GridLayout 사용******************
public class FrameEvent extends Frame implements WindowListener {
	
	public FrameEvent(){
		
		setLayout(new GridLayout(4, 2)); ////////****************중요*********
		
		add(new Button("버튼1"));
		add(new Button("버튼2"));
		add(new Button("버튼3"));
		add(new Button("버튼4"));
		add(new Button("버튼5"));
		add(new Button("버튼6"));
		add(new Button("버튼7"));
		add(new Button("버튼8"));
		
		setSize(300,200);
		setVisible(true);
		addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		
			dispose(); // 자원 해체
			System.exit(0); // 프로세스를 강제 종료시켜 윈도가 닫힌다.
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
