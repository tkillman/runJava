package runJava.ch21.ex02;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


////*********** 스윙 JLabel ,JTextField, JButton 사용***********
// JLabel ---> 프레임창 안에 이름표 스티커
// JTextFiled ---> 프레임 창 안에 텍스트 입력 박스
// JButton --> 텍스트 입력창 안에 누를 수 있는 단추


public class MainPanel extends JPanel{
	
	JTextField txtName,txtId,txtPwd,txtAge;
	JButton btnadd, btnCancel;
	
	public MainPanel(){
		//7행 1열짜리 그리드 레이아웃을 배치 관리자로 설정
		setLayout(new GridLayout(7, 1 ));
		
		add(new JLabel("")); //여백을 위해서 레이블 추가 --->
		
		JPanel p01 = new JPanel(); // 
		p01.add(new JLabel("이   름 :",JLabel.RIGHT));
		p01.add(txtName= new JTextField(20));
		add(p01);
		
		JPanel p02 = new JPanel();
		p02.add(new JLabel("아 이 디 :",JLabel.RIGHT));
		p02.add(txtId= new JTextField(20));
		add(p02);
		
		JPanel p03 = new JPanel();
		p03.add(new JLabel("패 스 워 드:",JLabel.RIGHT));
		p03.add(txtPwd= new JTextField(20));
		add(p03);
		
		JPanel p04 = new JPanel();
		p04.add(new JLabel("나 이:",JLabel.RIGHT));
		p04.add(txtAge= new JTextField(20));
		add(p04);
		
		JPanel p05 = new JPanel();
		p05.add(btnadd= new JButton("가입하기"));
		p05.add(btnCancel= new JButton("다시 쓰기"));
		add(p05);
		
				
		
	}
	
	
	

}
