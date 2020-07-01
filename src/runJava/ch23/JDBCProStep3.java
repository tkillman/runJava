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

public class JDBCProStep3 extends JFrame implements ActionListener {

	JPanel panWest; // 왼쪽에 텍스 필드
	JPanel panSouth; // 아래쪽에 버튼 
	JPanel p1,p2,p3,p4,p5; // panWest에 위치시킬 Jpanel들
	JTextField txtNo, txtName, txtEmail, txtTel; // text를 입력 할 수 있는 공간
	JButton btnTotal, btnAdd, btnDel, btnSearch, btnCancel; // 누를 수 있는 버튼 생성
	JTable table; // table
	
	// 상태 변화를 위한 변수 선언
	
	private static final int NONE=0;//
	private static final int ADD=1; // ADD 발생
	private static final int DELETE=2; // delete 
	private static final int SEARCH=3;//
	private static final int TOTAL=4;//
	private static final int CANCLE=5;
	int cmd= NONE;//
	
	String driver = "oracle.jdbc.driver.OracleDriver"; //driver 명시
	String url= "jdbc:oracle:thin:@localhost:1521:xe";  // 오라클 주소 명시
	String user= "hr"; //유저 아이디
	String pwd = "hr"; // 유저 비밀번호
	Connection con= null; // 연결 객체 con 생성
	Statement stmt = null; // 기술 객체 stmt 생성
	ResultSet rs= null; // 결과값 객체 rs 생성
	
	PreparedStatement pstmtInsert= null; //업데이트 시킬 statement 객체 pstmtInsert 생성
	PreparedStatement pstmtDelete= null; // 삭제 시킬 statement 객체 pstmtDelete 생성
	
	String sqlInsert = "insert into tbl_customers values(?,?,?,?)"; // 추가 시킬 쿼리문 String sqlInsert 변수 정의 
	String sqlDelete = "delete from tbl_customers where name=?"; // 삭제 시킬 쿼리문 String sqlDelete 변수 정의
	
	
	
	//새롭게 추가한 테이블 형식으로 database 표현하기
	MyModel model; // 내가 추가한 테이블 객체
	
	//전체를 볼 statement 객체 pstmtTotal 생성 , 전체를 볼 statement 객체 pstmtTotalScroll 생성
	PreparedStatement pstmtTotal, pstmtTotalScroll;
	
	
	//검색을 할 statement 객체 pstmtSearch , pstmtSearchScroll 생성
	PreparedStatement pstmtSearch, pstmtSearchScroll;
	
	// 전체를 볼 쿼리문 선언 , 검색할 쿼리문 선언
	private String sqlTotal = "select * from tbl_customers";
	private String sqlSearch = "select * from tbl_customers where name=?";
	
	
	
	//생성자
	public JDBCProStep3(){ //컴포넌트 붙이는 메소드
		panWest = new JPanel(new GridLayout(5, 0)); // 전체 5행 0열의 바둑판 모양 생성
		p1= new JPanel(new FlowLayout(FlowLayout.RIGHT)); // 오른쪽에 p1 패널 위치
		p1.add(new JLabel("번  호")); // p1에 번호라는 이름을 붙임
		p1.add(txtNo = new JTextField(12)); // JTextField 컴포넌트 객체 생성
		panWest.add(p1); // p1을 panWest 위에 추가

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
		
		add(panWest, "West"); // 전체 프레임에서 왼쪽으로 붙임
		
		// 화면 아래에 버튼 붙이기
		
		panSouth = new JPanel(); // 아래쪽에 패널 인스턴스 할당
		panSouth.add(btnTotal = new JButton("전체 보기")); // 버튼 컴포넌트 추가
		panSouth.add(btnAdd = new JButton("추   가")); // 버튼 컴포넌트 추가
		panSouth.add(btnDel = new JButton("삭제"));// 버튼 컴포넌트 추가
		panSouth.add(btnSearch = new JButton("검  색"));// 버튼 컴포넌트 추가
		panSouth.add(btnCancel = new JButton("취 소"));// 버튼 컴포넌트 추가
		add(panSouth, "South"); // 전체 프레임에서 아래쪽에 붙임
		
		//이벤트 처리
		
		btnTotal.addActionListener(this); //버튼마다의 이벤트 처리 리스너를 붙여준다.
		btnAdd.addActionListener(this); //버튼마다의 이벤트 처리 리스너를 붙여준다.
		btnDel.addActionListener(this); 
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
		
		//빈 테이블의 객체 생성
		add(new JScrollPane(table=new JTable()), "Center"); 
		// container 클래스의 add 메소드 실행: 가운데 Jtable jframe의 테이블을 가운데에 설정해서 붙인다. 
		
		
		
		//종료 버튼이 클릭되면 윈도우가 닫히도록 한다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//메인 창 출력
		setBounds(100,100,700,300);
		setVisible(true);
		
		dbConnect(); //db에 연결
		
	}
	
	private void dbConnect(){
		
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pwd);
			stmt = con.createStatement();
			pstmtInsert = con.prepareStatement(sqlInsert); // 연결값을 preparedstatment 객체 값으로 할당
			pstmtDelete = con.prepareStatement(sqlDelete); //
			pstmtTotalScroll = con.prepareStatement(sqlTotal, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			pstmtSearchScroll = con.prepareStatement(sqlSearch, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			pstmtTotal = con.prepareStatement(sqlTotal);
			pstmtSearch = con.prepareStatement(sqlSearch);
			
			
			
			init();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //이벤트 처리 메소드
		
		Object obj = e.getSource(); // 발생한 이벤트를 구분하는 객체
		
		
		if(obj == btnAdd){ // 발생한 이벤트가 btnAdd 일 때 
			
			if(cmd !=ADD){ //초기값이 ADD 상태가 아니면 
				setText(ADD); // 입력 가능 상태로 만듬 
				return;
				
			}
			
			setTitle(e.getActionCommand()); // 전체 frame의 창 이름을 '추가'로 바꾼다.
			add(); // add 메소드 실행
			
		} else if(obj==btnDel){
			if(cmd !=DELETE){
				setText(DELETE);//이름값만 입력가능 상태
				return;
				
			}
			
			setTitle(e.getActionCommand()); // 전체 frame의 창 이름을 '삭제'로 바꾼다.
			del();
			
		}else if(obj==btnSearch){
			if(cmd !=SEARCH){
				setText(SEARCH);//이름값만 입력가능 상태
				return;
				
			}
			
			setTitle(e.getActionCommand()); // 전체 frame의 창 이름을 '검색'로 바꾼다.
			search(); // search 메소드 실행
			
		} else if(obj==btnTotal){
			
			setTitle(e.getActionCommand()); // 전체 보기
			total();
			setText(NONE); 
			init();
		
		} else if(obj ==btnCancel){
			setTitle(e.getActionCommand());
			cancel();
			setText(NONE); 
			init();
		}
		
		setText(NONE); 
		init();
		
	}

	private void init(){
		txtNo.setText(""); txtNo.setEditable(false); //초기 창을 빈 창으로 만들고 입력이 불가능하게
		txtName.setText(""); txtName.setEditable(false); 
		txtEmail.setText(""); txtEmail.setEditable(false);
		txtTel.setText(""); txtTel.setEditable(false);
	}
	
	
	private void setText(int command){
		switch (command) {
		case ADD:
			txtNo.setEditable(true); //입력가능 상태로 바꾼다.
			txtName.setEditable(true);//입력가능 상태로 바꾼다.
			txtEmail.setEditable(true);//입력가능 상태로 바꾼다.
			txtTel.setEditable(true);//입력가능 상태로 바꾼다.
			break;

		case DELETE:
		case SEARCH:
			txtName.setEditable(true); //이름값만 입력가능 상태
			break;
			
		}
		setButton(command); // 버튼 비활성화
		
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
			
			String strNo = txtNo.getText(); //컴포넌트에 입력한 txt에 입력한 값을 String 형태로 바꾼다.
			String strName = txtName.getText();
			String strEmail = txtEmail.getText();
			String strTel = txtTel.getText();
			
			if(strNo.length()<1||strName.length()<1){
				
				JOptionPane.showMessageDialog(null, "번호와 이름란은 필수 입력란입니다.");
				return;
			}
			
			pstmtInsert.setInt(1, Integer.parseInt(strNo)); // 첫번째 값을 데이터베이스 code 에 입력
			pstmtInsert.setString(2, strName);
			pstmtInsert.setString(3, strEmail);
			pstmtInsert.setString(4, strTel);
			pstmtInsert.executeUpdate(); // 실행
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		JOptionPane.showMessageDialog(null, "추가 성공"); //기본적인 새로운 null값 frame에 추가성공을 띄운다.
	}
	
	private void del(){ //삭제 메소드
		try {
			String strName= txtName.getText(); //삭제 이름값을 String형태로 바꾼다.
			
			if(strName.length() <1){ //삭제 이름이 없을 경우
				JOptionPane.showMessageDialog(null, "이름은 필수 입력란입니다.");
				return;
			}
			pstmtDelete.setString(1, strName); // 쿼리문에 strName값을 입력
			pstmtDelete.executeUpdate(); // 실행
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(null, "삭제 성공");
		
		
	}
	
	private void total(){ //전체 검색
		try {
			
			ResultSet rsScroll = pstmtTotalScroll.executeQuery();  
			//쿼리실행값을 ResultSet 클래스의 rsScroll 객체로 받는다.
			ResultSet rs= pstmtTotal.executeQuery();
			
				model= new MyModel();
				model.getRowCount(rsScroll);
				model.setData(rs);
				table.setModel(model);
				table.updateUI();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	private void search(){
		
		String strName = txtName.getText();
		
		if(strName.length() <1){
			JOptionPane.showMessageDialog(null, "이름은 필수 입력란입니다.");
			return;
		}
		
		try {
			pstmtSearchScroll.setString(1, strName); // SearchScroll에 strName값을 준다
			ResultSet rsScroll = pstmtSearchScroll.executeQuery(); // 쿼리 결과값을 rsScroll로 받는다.
			pstmtSearch.setString(1, strName);
			ResultSet rs = pstmtSearch.executeQuery();
		
				model= new MyModel();
				model.getRowCount(rsScroll);
				model.setData(rs);
				table.setModel(model);
				table.updateUI();
				
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void cancel(){
		
		
		
	}
	
	public static void main(String[] args) {
		
		new JDBCProStep3();
		
	}

}
