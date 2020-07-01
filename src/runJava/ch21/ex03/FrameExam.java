package runJava.ch21.ex03;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FrameExam extends JFrame {
	
	MainPanel mainPan;
	
	public FrameExam() {
		mainPan = new MainPanel();
		add(mainPan, BorderLayout.CENTER);
		
		// 종료 버튼이 클릭되면 윈도우가 닫히도록 한다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
		
		
	}

}
