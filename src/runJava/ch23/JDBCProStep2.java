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

//////////************ ������ ������Ʈ*********************
// executeUpdate �޼ҵ�� PrepareStatement ��ü
// 1. PreparedStatement ��ü�� ���� 
// 		PreparedStatement pstmt = con.prepareStatement(sql);
//		PreparedStatement �޼ҵ��� ���ڷ� ���Ǵ� sql���� ���� �������� �ʰ� ����ǥ��
//		"Insert into tbl_customers values(?,?,?,?,?);"
// 2. ?�� ������ ���ڿ� ���� �ش�.
// setXXX(int ����, ���� �����ͳ� ����);
//	pstmt.setXXX(2,"donggyu");
// 3. SQL���� ������ ���� select�̸� executeQuery()�� ResultSet�� ���
// 	  ������Ʈ�̸� executeUpdate() �� ���� ����� ����� ���� int ���·� ��ȯ�ȴ�.

public class JDBCProStep2 extends JFrame implements ActionListener {

	JPanel panWest; // ���ʿ� �ؽ� �ʵ�
	JPanel panSouth; // �Ʒ��ʿ� ��ư 
	JPanel p1,p2,p3,p4,p5;
	JTextField txtNo, txtName, txtEmail, txtTel;
	JButton btnTotal, btnAdd, btnDel, btnSearch, btnCancel;
	JTable table;
	// ���� ��ȭ�� ���� ���� ����
	
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
	
	
	
	
	
	
	
	public JDBCProStep2(){ //������Ʈ ���̴� �޼ҵ�
		panWest = new JPanel(new GridLayout(5, 0));
		p1= new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(new JLabel("��  ȣ"));
		p1.add(txtNo = new JTextField(12));
		panWest.add(p1);

		p2= new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(new JLabel("��  ��"));
		p2.add(txtName = new JTextField(12));
		panWest.add(p2);
		
		p3= new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p3.add(new JLabel("�� �� ��"));
		p3.add(txtEmail = new JTextField(12));
		panWest.add(p3);
		
		p4= new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p4.add(new JLabel("�� ȭ �� ȣ"));
		p4.add(txtTel = new JTextField(12));
		panWest.add(p4);
		
		p5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p5.add(new JLabel(""));
		panWest.add(p5);
		
		add(panWest, "West");
		
		// ȭ�� �Ʒ��� ��ư ���̱�
		
		panSouth = new JPanel();
		panSouth.add(btnTotal = new JButton("��ü ����"));
		panSouth.add(btnAdd = new JButton("��   ��"));
		panSouth.add(btnDel = new JButton("����"));
		panSouth.add(btnSearch = new JButton("��  ��"));
		panSouth.add(btnCancel = new JButton("�� ��"));
		add(panSouth, "South");
		
		//�̺�Ʈ ó��
		
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this); 
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
		
		//�� ���̺��� ��ü ����
		add(new JScrollPane(table=new JTable()), "Center");
		
		//���� ��ư�� Ŭ���Ǹ� �����찡 �������� �Ѵ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//���� â ���
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
			
			setTitle(e.getActionCommand()); //�߰�
			add();
			
		} else if(obj==btnDel){
			if(cmd !=DELETE){
				setText(DELETE);
				return;
				
			}
			
			setTitle(e.getActionCommand()); // ����
			del();
			
		}else if(obj==btnSearch){
			if(cmd !=SEARCH){
				setText(SEARCH);
				return;
				
			}
			
			setTitle(e.getActionCommand()); // �˻�
		
		} else if(obj==btnTotal){
			if(cmd !=TOTAL){
				setText(TOTAL);
				return;
				
			}
			
			setTitle(e.getActionCommand()); // ��ü ����
		
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
		
	} // setText �޼ҵ� ��
	
	
	private void setButton(int command){
		//��� ��ư�� �����ϰ� � ��ư�� �������� ��� ��ư�� �� Ȱ��ȭ
		
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
				
				JOptionPane.showMessageDialog(null, "��ȣ�� �̸����� �ʼ� �Է¶��Դϴ�.");
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
		JOptionPane.showMessageDialog(null, "�߰� ����");
	}
	
	private void del(){
		try {
			String strName= txtName.getText();
			if(strName.length() <1){
				JOptionPane.showMessageDialog(null, "�̸��� �ʼ� �Է¶��Դϴ�.");
				return;
			}
			pstmtDelete.setString(1, strName);
			pstmtDelete.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(null, "���� ����");
		
		
	}
	
	
	public static void main(String[] args) {
		
		new JDBCProStep2();
		
	}

}
