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

	JPanel panWest; // ���ʿ� �ؽ� �ʵ�
	JPanel panSouth; // �Ʒ��ʿ� ��ư 
	JPanel p1,p2,p3,p4,p5; // panWest�� ��ġ��ų Jpanel��
	JTextField txtNo, txtName, txtEmail, txtTel; // text�� �Է� �� �� �ִ� ����
	JButton btnTotal, btnAdd, btnDel, btnSearch, btnCancel; // ���� �� �ִ� ��ư ����
	JTable table; // table
	
	// ���� ��ȭ�� ���� ���� ����
	
	private static final int NONE=0;//
	private static final int ADD=1; // ADD �߻�
	private static final int DELETE=2; // delete 
	private static final int SEARCH=3;//
	private static final int TOTAL=4;//
	private static final int CANCLE=5;
	int cmd= NONE;//
	
	String driver = "oracle.jdbc.driver.OracleDriver"; //driver ���
	String url= "jdbc:oracle:thin:@localhost:1521:xe";  // ����Ŭ �ּ� ���
	String user= "hr"; //���� ���̵�
	String pwd = "hr"; // ���� ��й�ȣ
	Connection con= null; // ���� ��ü con ����
	Statement stmt = null; // ��� ��ü stmt ����
	ResultSet rs= null; // ����� ��ü rs ����
	
	PreparedStatement pstmtInsert= null; //������Ʈ ��ų statement ��ü pstmtInsert ����
	PreparedStatement pstmtDelete= null; // ���� ��ų statement ��ü pstmtDelete ����
	
	String sqlInsert = "insert into tbl_customers values(?,?,?,?)"; // �߰� ��ų ������ String sqlInsert ���� ���� 
	String sqlDelete = "delete from tbl_customers where name=?"; // ���� ��ų ������ String sqlDelete ���� ����
	
	
	
	//���Ӱ� �߰��� ���̺� �������� database ǥ���ϱ�
	MyModel model; // ���� �߰��� ���̺� ��ü
	
	//��ü�� �� statement ��ü pstmtTotal ���� , ��ü�� �� statement ��ü pstmtTotalScroll ����
	PreparedStatement pstmtTotal, pstmtTotalScroll;
	
	
	//�˻��� �� statement ��ü pstmtSearch , pstmtSearchScroll ����
	PreparedStatement pstmtSearch, pstmtSearchScroll;
	
	// ��ü�� �� ������ ���� , �˻��� ������ ����
	private String sqlTotal = "select * from tbl_customers";
	private String sqlSearch = "select * from tbl_customers where name=?";
	
	
	
	//������
	public JDBCProStep3(){ //������Ʈ ���̴� �޼ҵ�
		panWest = new JPanel(new GridLayout(5, 0)); // ��ü 5�� 0���� �ٵ��� ��� ����
		p1= new JPanel(new FlowLayout(FlowLayout.RIGHT)); // �����ʿ� p1 �г� ��ġ
		p1.add(new JLabel("��  ȣ")); // p1�� ��ȣ��� �̸��� ����
		p1.add(txtNo = new JTextField(12)); // JTextField ������Ʈ ��ü ����
		panWest.add(p1); // p1�� panWest ���� �߰�

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
		
		add(panWest, "West"); // ��ü �����ӿ��� �������� ����
		
		// ȭ�� �Ʒ��� ��ư ���̱�
		
		panSouth = new JPanel(); // �Ʒ��ʿ� �г� �ν��Ͻ� �Ҵ�
		panSouth.add(btnTotal = new JButton("��ü ����")); // ��ư ������Ʈ �߰�
		panSouth.add(btnAdd = new JButton("��   ��")); // ��ư ������Ʈ �߰�
		panSouth.add(btnDel = new JButton("����"));// ��ư ������Ʈ �߰�
		panSouth.add(btnSearch = new JButton("��  ��"));// ��ư ������Ʈ �߰�
		panSouth.add(btnCancel = new JButton("�� ��"));// ��ư ������Ʈ �߰�
		add(panSouth, "South"); // ��ü �����ӿ��� �Ʒ��ʿ� ����
		
		//�̺�Ʈ ó��
		
		btnTotal.addActionListener(this); //��ư������ �̺�Ʈ ó�� �����ʸ� �ٿ��ش�.
		btnAdd.addActionListener(this); //��ư������ �̺�Ʈ ó�� �����ʸ� �ٿ��ش�.
		btnDel.addActionListener(this); 
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
		
		//�� ���̺��� ��ü ����
		add(new JScrollPane(table=new JTable()), "Center"); 
		// container Ŭ������ add �޼ҵ� ����: ��� Jtable jframe�� ���̺��� ����� �����ؼ� ���δ�. 
		
		
		
		//���� ��ư�� Ŭ���Ǹ� �����찡 �������� �Ѵ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//���� â ���
		setBounds(100,100,700,300);
		setVisible(true);
		
		dbConnect(); //db�� ����
		
	}
	
	private void dbConnect(){
		
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pwd);
			stmt = con.createStatement();
			pstmtInsert = con.prepareStatement(sqlInsert); // ���ᰪ�� preparedstatment ��ü ������ �Ҵ�
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
	public void actionPerformed(ActionEvent e) { //�̺�Ʈ ó�� �޼ҵ�
		
		Object obj = e.getSource(); // �߻��� �̺�Ʈ�� �����ϴ� ��ü
		
		
		if(obj == btnAdd){ // �߻��� �̺�Ʈ�� btnAdd �� �� 
			
			if(cmd !=ADD){ //�ʱⰪ�� ADD ���°� �ƴϸ� 
				setText(ADD); // �Է� ���� ���·� ���� 
				return;
				
			}
			
			setTitle(e.getActionCommand()); // ��ü frame�� â �̸��� '�߰�'�� �ٲ۴�.
			add(); // add �޼ҵ� ����
			
		} else if(obj==btnDel){
			if(cmd !=DELETE){
				setText(DELETE);//�̸����� �Է°��� ����
				return;
				
			}
			
			setTitle(e.getActionCommand()); // ��ü frame�� â �̸��� '����'�� �ٲ۴�.
			del();
			
		}else if(obj==btnSearch){
			if(cmd !=SEARCH){
				setText(SEARCH);//�̸����� �Է°��� ����
				return;
				
			}
			
			setTitle(e.getActionCommand()); // ��ü frame�� â �̸��� '�˻�'�� �ٲ۴�.
			search(); // search �޼ҵ� ����
			
		} else if(obj==btnTotal){
			
			setTitle(e.getActionCommand()); // ��ü ����
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
		txtNo.setText(""); txtNo.setEditable(false); //�ʱ� â�� �� â���� ����� �Է��� �Ұ����ϰ�
		txtName.setText(""); txtName.setEditable(false); 
		txtEmail.setText(""); txtEmail.setEditable(false);
		txtTel.setText(""); txtTel.setEditable(false);
	}
	
	
	private void setText(int command){
		switch (command) {
		case ADD:
			txtNo.setEditable(true); //�Է°��� ���·� �ٲ۴�.
			txtName.setEditable(true);//�Է°��� ���·� �ٲ۴�.
			txtEmail.setEditable(true);//�Է°��� ���·� �ٲ۴�.
			txtTel.setEditable(true);//�Է°��� ���·� �ٲ۴�.
			break;

		case DELETE:
		case SEARCH:
			txtName.setEditable(true); //�̸����� �Է°��� ����
			break;
			
		}
		setButton(command); // ��ư ��Ȱ��ȭ
		
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
			
			String strNo = txtNo.getText(); //������Ʈ�� �Է��� txt�� �Է��� ���� String ���·� �ٲ۴�.
			String strName = txtName.getText();
			String strEmail = txtEmail.getText();
			String strTel = txtTel.getText();
			
			if(strNo.length()<1||strName.length()<1){
				
				JOptionPane.showMessageDialog(null, "��ȣ�� �̸����� �ʼ� �Է¶��Դϴ�.");
				return;
			}
			
			pstmtInsert.setInt(1, Integer.parseInt(strNo)); // ù��° ���� �����ͺ��̽� code �� �Է�
			pstmtInsert.setString(2, strName);
			pstmtInsert.setString(3, strEmail);
			pstmtInsert.setString(4, strTel);
			pstmtInsert.executeUpdate(); // ����
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		JOptionPane.showMessageDialog(null, "�߰� ����"); //�⺻���� ���ο� null�� frame�� �߰������� ����.
	}
	
	private void del(){ //���� �޼ҵ�
		try {
			String strName= txtName.getText(); //���� �̸����� String���·� �ٲ۴�.
			
			if(strName.length() <1){ //���� �̸��� ���� ���
				JOptionPane.showMessageDialog(null, "�̸��� �ʼ� �Է¶��Դϴ�.");
				return;
			}
			pstmtDelete.setString(1, strName); // �������� strName���� �Է�
			pstmtDelete.executeUpdate(); // ����
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(null, "���� ����");
		
		
	}
	
	private void total(){ //��ü �˻�
		try {
			
			ResultSet rsScroll = pstmtTotalScroll.executeQuery();  
			//�������ప�� ResultSet Ŭ������ rsScroll ��ü�� �޴´�.
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
			JOptionPane.showMessageDialog(null, "�̸��� �ʼ� �Է¶��Դϴ�.");
			return;
		}
		
		try {
			pstmtSearchScroll.setString(1, strName); // SearchScroll�� strName���� �ش�
			ResultSet rsScroll = pstmtSearchScroll.executeQuery(); // ���� ������� rsScroll�� �޴´�.
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
