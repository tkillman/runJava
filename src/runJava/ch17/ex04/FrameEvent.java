package runJava.ch17.ex04;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


//////////**************** ��ġ �������� BorderLayout ���******************

public class FrameEvent extends Frame implements WindowListener {
	
	public FrameEvent(){
		
		
		setLayout(new BorderLayout());
		add(new Button("��ư1"), BorderLayout.EAST);
		add(new Button("��ư2"), BorderLayout.WEST);
		add(new Button("��ư3"), BorderLayout.SOUTH);
		add(new Button("��ư4"), BorderLayout.NORTH);
		add(new Button("��ư5"), BorderLayout.CENTER);
		
		
		
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
