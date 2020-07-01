package runJava.ch21.ex03;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


///////////////********** JOptionPane 클래스 사용
//		주요 메소드인 showXXXDialog의 매개변수 탐구
/*//// Static void showXXXDialog(
							Component ParentComponentcon, //대화상자를 소유한 부모 컴포넌트
							Object message, // 출력할 메세지
							String title, // 제목줄에 보여질 내용
							int messageType, //대화상자 아래쪽에 출력될 옵션 버튼
							icon i) 대화상자 왼쪽에 출력될 옵션버튼*/

public class MainPanel extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	
	JTextField txtName,txtId,txtPwd,txtAge;
	JButton btnadd, btnCancel;
	
	public MainPanel(){
		
		//7행 1열짜리 그리드 레이아웃을 배치 관리자로 설정
		setLayout(new GridLayout(7, 1 ));
		add(new JLabel("")); //여백을 위해서 레이블 추가
		
		JPanel p01 = new JPanel();
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
		
		btnadd.addActionListener(this);
		btnCancel.addActionListener(this);
		
	}

	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub


		String msg="";
		if(e.getSource()==btnadd){
			msg+="이름 :"+ txtName.getText();
			msg+="\n 아이디" + txtId.getText();
			msg+="\n 패스워드" +txtPwd.getText();
			msg+="\n 나이"+txtAge.getText();
			
		}else if(e.getSource()==btnCancel){
			
			msg="입력한 내용을 취소합니다.";		
		}
	
		JOptionPane.showMessageDialog(this, msg); // 
		txtName.setText("");
		txtId.setText("");
		txtPwd.setText("");
		txtAge.setText("");
	
		
		
	}
}

