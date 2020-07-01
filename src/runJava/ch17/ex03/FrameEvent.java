package runJava.ch17.ex03;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


///// ************ Frame�� ��ġ������***************

//FlowLayout, BorderLayout, GridLayout, CardLayout, GridBagLayout
/*1. ��ġ �����ڸ� ����
		FlowLayout layout = new FlowLayout();
  2. ��ġ �����ڸ� �����ӿ� ����Ѵ�.
  		Frame f = new Frame();
  		f.setLayout(layout);
  3. ������Ʈ�� �߰��Ѵ�.
  		Button bt01 = new Button();
  		f.add(bt01);*/

//////////**************** ��ġ �������� FlowLayout ���******************
public class FrameEvent extends Frame implements WindowListener {
	
	public FrameEvent(){
		
		setLayout(new FlowLayout());//22222222222222222222222222222222222
		add(new Button("��ư 1"));  // 333333333333333333333
		add(new Button("��ư 2"));
		add(new Button("��ư 3"));
		add(new Button("��ư 4"));
		add(new Button("��ư 5"));
		
		
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
		
			dispose(); // �ڿ� ��ü
			System.exit(0); // ���μ����� ���� ������� ������ ������.
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
