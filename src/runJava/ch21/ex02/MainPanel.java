package runJava.ch21.ex02;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


////*********** ���� JLabel ,JTextField, JButton ���***********
// JLabel ---> ������â �ȿ� �̸�ǥ ��ƼĿ
// JTextFiled ---> ������ â �ȿ� �ؽ�Ʈ �Է� �ڽ�
// JButton --> �ؽ�Ʈ �Է�â �ȿ� ���� �� �ִ� ����


public class MainPanel extends JPanel{
	
	JTextField txtName,txtId,txtPwd,txtAge;
	JButton btnadd, btnCancel;
	
	public MainPanel(){
		//7�� 1��¥�� �׸��� ���̾ƿ��� ��ġ �����ڷ� ����
		setLayout(new GridLayout(7, 1 ));
		
		add(new JLabel("")); //������ ���ؼ� ���̺� �߰� --->
		
		JPanel p01 = new JPanel(); // 
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
		
				
		
	}
	
	
	

}
