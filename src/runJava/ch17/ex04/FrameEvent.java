package runJava.ch17.ex04;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


//////////**************** 배치 관리자중 BorderLayout 사용******************

public class FrameEvent extends Frame implements WindowListener {
	
	public FrameEvent(){
		
		
		setLayout(new BorderLayout());
		add(new Button("버튼1"), BorderLayout.EAST);
		add(new Button("버튼2"), BorderLayout.WEST);
		add(new Button("버튼3"), BorderLayout.SOUTH);
		add(new Button("버튼4"), BorderLayout.NORTH);
		add(new Button("버튼5"), BorderLayout.CENTER);
		
		
		
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
