package runJava.ch17.ex05;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


//////////**************** ��ġ �������� GridLayout ���******************
public class FrameEvent extends Frame implements WindowListener {
	
	public FrameEvent(){
		
		setLayout(new GridLayout(4, 2)); ////////****************�߿�*********
		
		add(new Button("��ư1"));
		add(new Button("��ư2"));
		add(new Button("��ư3"));
		add(new Button("��ư4"));
		add(new Button("��ư5"));
		add(new Button("��ư6"));
		add(new Button("��ư7"));
		add(new Button("��ư8"));
		
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
