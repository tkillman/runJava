package runJava.ch17.ex01;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


////////********** ���� �̺�Ʈ ó��************

public class FrameEvent extends Frame implements WindowListener {
	
	public FrameEvent(){
		setSize(300,200);
		setVisible(true);
		addWindowListener(this); // ���⼭ this�� �ڱ� �ڽ��� �߻���Ų ��ü�� ó���ϰڴٴ� �ǹ�
	}

		// �������̽� WindowListener �� �������̵� �޼ҵ�� �ݵ�� ���� �� �ۿ� ����. 
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
