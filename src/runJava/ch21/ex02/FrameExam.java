package runJava.ch21.ex02;
import java.awt.BorderLayout;

import javax.swing.JFrame;


/////////// ���̾ƿ� ����
////////// http://m.blog.naver.com/originalckj/20168632463

public class FrameExam extends JFrame {
	
	MainPanel mainPan;
	
	public FrameExam() {
		mainPan = new MainPanel();
		add(mainPan, BorderLayout.CENTER); // ���� �г��� ������â �߰��� ��ġ
		
		// ���� ��ư�� Ŭ���Ǹ� �����찡 �������� �Ѵ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
		
		
	}

}
