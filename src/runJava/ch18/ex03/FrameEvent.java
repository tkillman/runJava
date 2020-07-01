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


////////////////*************** ������ �̺�Ʈ + ��ư �̺�Ʈ�� �߻����Ѽ� �ڱⰡ ó���� �� �ֵ��� ********


public class FrameEvent extends Frame implements WindowListener, ActionListener {
	
	Panel p01, p02;
	Label dis;
	Button btn01, btn02;
	
	public FrameEvent() throws HeadlessException {
		setLayout(new BorderLayout());
		
		p01 = new Panel();
		p02 = new Panel();
		
		dis = new Label("��� : �ƹ��͵� ������ �ʾҴ�.");
		
		btn01= new Button("��ư1");
		btn02 = new Button("��ư2");
		
		p01.add(dis);
		
		p02.add(btn01);
		p02.add(btn02);
		
		add(p01, BorderLayout.NORTH);
		add(p02, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
		addWindowListener(this); /// ������ â�� ������ �̺�Ʈ�� ó��
		
		btn01.addActionListener(this); // ��ư�� ������ �̺�Ʈ�� ó��
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
	public void actionPerformed(ActionEvent e) { // ��ư�� ������ �� �̺�Ʈ ����
		// TODO Auto-generated method stub
		dis.setText("��� :"+ e.getActionCommand()+"�� ������");

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) { //�����찡 ���� �� �̺�Ʈ ����
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
