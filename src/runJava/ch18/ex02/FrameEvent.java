package runJava.ch18.ex02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


////////////// *************** �̺�Ʈ �ҽ� ��ü ó���ϱ� ****************/////////


public class FrameEvent extends Frame implements WindowListener {

		Panel p01,p02;
		Label dis;
		Button btn01, btn02;
		
		public FrameEvent(){
			
			setLayout(new BorderLayout()); // �г� ��ü ����
			
			//�г� ��ü ����
			p01 = new Panel();
			p02 = new Panel();
			
			//���̺� ��ü ����		
			dis = new Label("��� : �ƹ��� ��ư�� ������ �ʾҴ�.");
			
			//��ư ��ü ����
			btn01= new Button("��ư 1");
			btn02= new Button("��ư2");
			
			//�гο� ���̺��� �߰�
			p01.add(dis);
			p02.add(btn01);
			p02.add(btn02);
			
			add(p01, BorderLayout.NORTH);
			add(p02, BorderLayout.CENTER);
			
			pack();
			setVisible(true);
			addWindowListener(this);
		
			BtnHandler handler = new BtnHandler();
			btn01.addActionListener(handler);
			btn02.addActionListener(handler);
		
		
		}
	
		
		
		@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
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