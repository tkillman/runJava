package runJava.ch21.ex02;
import java.awt.BorderLayout;

import javax.swing.JFrame;


/////////// 레이아웃 종류
////////// http://m.blog.naver.com/originalckj/20168632463

public class FrameExam extends JFrame {
	
	MainPanel mainPan;
	
	public FrameExam() {
		mainPan = new MainPanel();
		add(mainPan, BorderLayout.CENTER); // 메인 패널을 프레임창 중간에 배치
		
		// 종료 버튼이 클릭되면 윈도우가 닫히도록 한다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
		
		
	}

}
