package runJava.ch17.ex03;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


///// ************ Frame에 배치관리자***************

//FlowLayout, BorderLayout, GridLayout, CardLayout, GridBagLayout
/*1. 배치 관리자를 생성
		FlowLayout layout = new FlowLayout();
  2. 배치 관리자를 프레임에 등록한다.
  		Frame f = new Frame();
  		f.setLayout(layout);
  3. 컴포넌트를 추가한다.
  		Button bt01 = new Button();
  		f.add(bt01);*/

//////////**************** 배치 관리자중 FlowLayout 사용******************
public class FrameEvent extends Frame implements WindowListener {
	
	public FrameEvent(){
		
		setLayout(new FlowLayout());//22222222222222222222222222222222222
		add(new Button("버튼 1"));  // 333333333333333333333
		add(new Button("버튼 2"));
		add(new Button("버튼 3"));
		add(new Button("버튼 4"));
		add(new Button("버튼 5"));
		
		
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
