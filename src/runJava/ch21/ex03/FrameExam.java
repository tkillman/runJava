package runJava.ch21.ex03;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FrameExam extends JFrame {
	
	MainPanel mainPan;
	
	public FrameExam() {
		mainPan = new MainPanel();
		add(mainPan, BorderLayout.CENTER);
		
		// ���� ��ư�� Ŭ���Ǹ� �����찡 �������� �Ѵ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
		
		
	}

}
