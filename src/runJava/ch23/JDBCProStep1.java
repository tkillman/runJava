package runJava.ch23;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JDBCProStep1 extends JFrame implements ActionListener {

	JPanel panWest; // 왼쪽에 텍스 필드
	JPanel panSouth; // 아래쪽에 버튼 
	JPanel p1,p2,p3,p4,p5;
	JTextField txtNo, txtName, txtEmail, txtTel;
	JButton btnTotal, btnAdd, btnDel, btnSearch, btnCancel;
	JTable table;
	// 상태 변화를 위한 변수 선언
	
	private static final int NONE=0;
	private static final int ADD=1;
	private static final int DELETE=2;
	private static final int SEARCH=3;
	private static final int TOTAL=4;
	int cmd= NONE;
	
	public JDBCProStep1(){ //컴포넌트 붙이는 메소드
		panWest = new JPanel(new GridLayout(5, 0));
		p1= new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(new JLabel("번  호"));
		p1.add(txtNo = new JTextField(12));
		panWest.add(p1);

		p2= new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(new JLabel("이  름"));
		p2.add(txtName = new JTextField(12));
		panWest.add(p2);
		
		p3= new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p3.add(new JLabel("이 메 일"));
		p3.add(txtEmail = new JTextField(12));
		panWest.add(p3);
		
		p4= new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p4.add(new JLabel("전 화 번 호"));
		p4.add(txtTel = new JTextField(12));
		panWest.add(p4);
		
		p5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p5.add(new JLabel(""));
		panWest.add(p5);
		
		add(panWest, "West");
		
		// 화면 아래에 버튼 붙이기
		
		panSouth = new JPanel();
		panSouth.add(btnTotal = new JButton("전체 보기"));
		panSouth.add(btnAdd = new JButton("추   가"));
		panSouth.add(btnDel = new JButton("삭제"));
		panSouth.add(btnSearch = new JButton("검  색"));
		panSouth.add(btnCancel = new JButton("취 소"));
		add(panSouth, "South");
		
		//이벤트 처리
		
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this); 
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
		
		//빈 테이블의 객체 생성
		add(new JScrollPane(table=new JTable()), "Center");
		
		//종료 버튼이 클릭되면 윈도우가 닫히도록 한다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//메인 창 출력
		setBounds(100,100,700,300);
		setVisible(true);
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		
		if(obj == btnAdd){
			
			if(cmd !=ADD){
				setText(ADD);
				return;
				
			}
			
			setTitle(e.getActionCommand()); //추가
			
		} else if(obj==btnDel){
			if(cmd !=DELETE){
				setText(DELETE);
				return;
				
			}
			
			setTitle(e.getActionCommand()); // 삭제
		
		}else if(obj==btnSearch){
			if(cmd !=SEARCH){
				setText(SEARCH);
				return;
				
			}
			
			setTitle(e.getActionCommand()); // 검색
		
		} else if(obj==btnTotal){
			if(cmd !=TOTAL){
				setText(TOTAL);
				return;
				
			}
			
			setTitle(e.getActionCommand()); // 전체 보기
		
		}
		
		setText(NONE);
		init();
		
	}

	private void init(){
		txtNo.setText(""); txtNo.setEditable(false);
		txtName.setText(""); txtName.setEditable(false);
		txtEmail.setText(""); txtEmail.setEditable(false);
		txtTel.setText(""); txtTel.setEditable(false);
	}
	
	
	private void setText(int command){
		switch (command) {
		case ADD:
			txtNo.setEditable(true);
			txtName.setEditable(true);
			txtEmail.setEditable(true);
			txtTel.setEditable(true);
			break;

		case DELETE:
		case SEARCH:
			txtName.setEditable(true);
			break;
			
		}
		setButton(command);
		
	} // setText 메소드 끝
	
	
	private void setButton(int command){
		//취소 버튼을 제외하고 어떤 버튼이 눌리더라도 모든 버튼이 비 활성화
		
		btnTotal.setEnabled(false);
		btnAdd.setEnabled(false);
		btnDel.setEnabled(false);
		btnSearch.setEnabled(false);
		
		switch (command) {
		case ADD:
			btnAdd.setEnabled(true);
			cmd=ADD;
			break;
			
		case DELETE:
			btnDel.setEnabled(true);
			cmd=DELETE;
			break;
		
		case SEARCH:
			btnSearch.setEnabled(true);
			cmd=SEARCH;
			break;	
			
		case TOTAL:
			btnTotal.setEnabled(true);
			cmd=TOTAL;
			break;
		
		case NONE:
			btnAdd.setEnabled(true);
			btnDel.setEnabled(true);
			btnSearch.setEnabled(true);
			btnTotal.setEnabled(true);
			btnCancel.setEnabled(true);
			cmd=NONE;
			break;
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		new JDBCProStep1();
		
	}

}
