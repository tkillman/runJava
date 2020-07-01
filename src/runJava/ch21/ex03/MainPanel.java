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


///////////////********** JOptionPane Ŭ���� ���
//		�ֿ� �޼ҵ��� showXXXDialog�� �Ű����� Ž��
/*//// Static void showXXXDialog(
							Component ParentComponentcon, //��ȭ���ڸ� ������ �θ� ������Ʈ
							Object message, // ����� �޼���
							String title, // �����ٿ� ������ ����
							int messageType, //��ȭ���� �Ʒ��ʿ� ��µ� �ɼ� ��ư
							icon i) ��ȭ���� ���ʿ� ��µ� �ɼǹ�ư*/

public class MainPanel extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	
	JTextField txtName,txtId,txtPwd,txtAge;
	JButton btnadd, btnCancel;
	
	public MainPanel(){
		
		//7�� 1��¥�� �׸��� ���̾ƿ��� ��ġ �����ڷ� ����
		setLayout(new GridLayout(7, 1 ));
		add(new JLabel("")); //������ ���ؼ� ���̺� �߰�
		
		JPanel p01 = new JPanel();
		p01.add(new JLabel("��   �� :",JLabel.RIGHT));
		p01.add(txtName= new JTextField(20));
		add(p01);
		
		JPanel p02 = new JPanel();
		p02.add(new JLabel("�� �� �� :",JLabel.RIGHT));
		p02.add(txtId= new JTextField(20));
		add(p02);
		
		JPanel p03 = new JPanel();
		p03.add(new JLabel("�� �� �� ��:",JLabel.RIGHT));
		p03.add(txtPwd= new JTextField(20));
		add(p03);
		
		JPanel p04 = new JPanel();
		p04.add(new JLabel("�� ��:",JLabel.RIGHT));
		p04.add(txtAge= new JTextField(20));
		add(p04);
		
		JPanel p05 = new JPanel();
		p05.add(btnadd= new JButton("�����ϱ�"));
		p05.add(btnCancel= new JButton("�ٽ� ����"));
		add(p05);
		
		btnadd.addActionListener(this);
		btnCancel.addActionListener(this);
		
	}

	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub


		String msg="";
		if(e.getSource()==btnadd){
			msg+="�̸� :"+ txtName.getText();
			msg+="\n ���̵�" + txtId.getText();
			msg+="\n �н�����" +txtPwd.getText();
			msg+="\n ����"+txtAge.getText();
			
		}else if(e.getSource()==btnCancel){
			
			msg="�Է��� ������ ����մϴ�.";		
		}
	
		JOptionPane.showMessageDialog(this, msg); // 
		txtName.setText("");
		txtId.setText("");
		txtPwd.setText("");
		txtAge.setText("");
	
		
		
	}
}

