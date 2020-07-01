package runJava.ch18.ex03;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


////////////////*************** 윈도우 이벤트 + 버튼 이벤트를 발생시켜서 자기가 처리할 수 있도록 ********


public class FrameEvent extends Frame implements WindowListener, ActionListener {
	
	Panel p01, p02;
	Label dis;
	Button btn01, btn02;
	
	public FrameEvent() throws HeadlessException {
		setLayout(new BorderLayout());
		
		p01 = new Panel();
		p02 = new Panel();
		
		dis = new Label("결과 : 아무것도 눌리지 않았다.");
		
		btn01= new Button("버튼1");
		btn02 = new Button("버튼2");
		
		p01.add(dis);
		
		p02.add(btn01);
		p02.add(btn02);
		
		add(p01, BorderLayout.NORTH);
		add(p02, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
		addWindowListener(this); /// 윈도우 창이 닫히는 이벤트를 처리
		
		btn01.addActionListener(this); // 버튼을 누르는 이벤트를 처리
		btn02.addActionListener(this);
	}

	public FrameEvent(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public FrameEvent(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public FrameEvent(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void actionPerformed(ActionEvent e) { // 버튼이 눌렸을 때 이벤트 생성
		// TODO Auto-generated method stub
		dis.setText("결과 :"+ e.getActionCommand()+"이 눌렀음");

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) { //윈도우가 닫힐 때 이벤트 생성
		// TODO Auto-generated method stub
		dispose();
		System.exit(0);
		

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
