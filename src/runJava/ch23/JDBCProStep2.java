package runJava.ch23;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.*;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

//////////************ 데이터 업데이트*********************
// executeUpdate 메소드와 PrepareStatement 객체
// 1. PreparedStatement 객체를 생성 
// 		PreparedStatement pstmt = con.prepareStatement(sql);
//		PreparedStatement 메소드의 인자로 사용되는 sql문은 값을 지정하지 않고 물음표로
//		"Insert into tbl_customers values(?,?,?,?,?);"
// 2. ?로 지정된 인자에 값을 준다.
// setXXX(int 순서, 실제 데이터나 변수);
//	pstmt.setXXX(2,"donggyu");
// 3. SQL문의 종류에 따라 select이면 executeQuery()로 ResultSet을 얻고
// 	  업데이트이면 executeUpdate() 로 실행 제대로 변경된 값은 int 형태로 반환된다.

public class JDBCProStep2 extends JFrame implements ActionListener {

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
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url= "jdbc:oracle:thin:@localhost:1521:xe"; 
	String user= "hr";
	String pwd = "hr";
	Connection con= null;
	Statement stmt = null;
	PreparedStatement pstmtInsert= null;
	PreparedStatement pstmtDelete= null;
	
	String sqlInsert = "insert into tbl_customers values(?,?,?,?)";
	String sqlDelete = "delete from tbl_customers where name=?";
	
	
	ResultSet rs= null;
	
	
	
	
	
	
	
	public JDBCProStep2(){ //컴포넌트 붙이는 메소드
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
		
		dbConnect();
		
	}
	
	private void dbConnect(){
		
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pwd);
			stmt = con.createStatement();
			pstmtInsert = con.prepareStatement(sqlInsert);
			pstmtDelete = con.prepareStatement(sqlDelete);
			init();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
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
			add();
			
		} else if(obj==btnDel){
			if(cmd !=DELETE){
				setText(DELETE);
				return;
				
			}
			
			setTitle(e.getActionCommand()); // 삭제
			del();
			
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
	
	private void add(){
		try {
			
			String strNo = txtNo.getText();
			String strName = txtName.getText();
			String strEmail = txtEmail.getText();
			String strTel = txtTel.getText();
			
			if(strNo.length()<1||strName.length()<1){
				
				JOptionPane.showMessageDialog(null, "번호와 이름란은 필수 입력란입니다.");
				return;
				
			}
			pstmtInsert.setInt(1, Integer.parseInt(strNo));
			pstmtInsert.setString(2, strName);
			pstmtInsert.setString(3, strEmail);
			pstmtInsert.setString(4, strTel);
			pstmtInsert.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		JOptionPane.showMessageDialog(null, "추가 성공");
	}
	
	private void del(){
		try {
			String strName= txtName.getText();
			if(strName.length() <1){
				JOptionPane.showMessageDialog(null, "이름은 필수 입력란입니다.");
				return;
			}
			pstmtDelete.setString(1, strName);
			pstmtDelete.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(null, "삭제 성공");
		
		
	}
	
	
	public static void main(String[] args) {
		
		new JDBCProStep2();
		
	}

}
