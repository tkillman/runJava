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
	
	public JDBCProStep1(){ //������Ʈ ���̴� �޼ҵ�
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
			
		} else if(obj==btnDel){
			if(cmd !=DELETE){
				setText(DELETE);
				return;
				
			}
			
			setTitle(e.getActionCommand()); // ����
		
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
	
	public static void main(String[] args) {
		
		new JDBCProStep1();
		
	}

}
