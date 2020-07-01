package runJava.ch18.ex01;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


////// ********* Panel 사용***************
/// 패널 : 컴포넌트(라벨,텍스트박스,버튼 등) 들을 관리하기 편하게 모아놓은 것.
//f.add(컴포넌트) --> f.add(패널, 배치위치)

public class FrameEvent extends Frame implements WindowListener {

		Panel p01,p02;
		Label dis;
		Button btn01, btn02;
		
		public FrameEvent(){
			
			setLayout(new BorderLayout()); // 패널 객체 생성
			
			//패널 객체 생ㅇ성
			p01 = new Panel();
			p02 = new Panel();
			
			//레이블 객체 생성		
			dis = new Label("결과 : 아무런 버튼도 눌리지 않았다.");
			
			//버튼 객체 생성
			btn01= new Button("버튼 1");
			btn02= new Button("버튼2");
			
			//패널에 레이블을 추가
			p01.add(dis);
			p02.add(btn01);
			p02.add(btn02);
			
			add(p01, BorderLayout.NORTH); // f.add(컴포넌트) --> f.add(패널, 배치위치)
			add(p02, BorderLayout.CENTER);
			
			pack();
			setVisible(true);
			addWindowListener(this);
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
