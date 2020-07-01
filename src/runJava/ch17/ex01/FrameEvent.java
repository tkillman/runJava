package runJava.ch17.ex01;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


////////********** 종료 이벤트 처리************

public class FrameEvent extends Frame implements WindowListener {
	
	public FrameEvent(){
		setSize(300,200);
		setVisible(true);
		addWindowListener(this); // 여기서 this는 자기 자신이 발생시킨 객체를 처리하겠다는 의미
	}

		// 인터페이스 WindowListener 의 오버라이딩 메소드들 반드시 있을 수 밖에 없다. 
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
