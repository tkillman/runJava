package runJava.ch21.ex05;

import java.awt.BorderLayout;


import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

////////************�޺� �ڽ�******************
//�޺� �ڽ� : ���� ���� �׸� �߿��� �ϳ��� ������ �� �ֵ���
//
public class FrameExam extends JFrame implements ItemListener{
	JComboBox<String> combo;
	JTextArea ta;
	
	public FrameExam() {
		// TODO Auto-generated constructor stub
	String[] str={"�̸�","���̵�","����","��ȭ��ȣ"};
	combo = new JComboBox<String>(str);
	
	add(new Label("�˻��ϰ��� �ϴ� �׺��� �����Ͻÿ�"),BorderLayout.NORTH);
	add(combo, BorderLayout.CENTER);
	
	ta=new JTextArea(10,20);
	add(new JScrollPane(ta), BorderLayout.SOUTH); // JTextArea ������ Scroll�� ��� �� �� �ֵ���
	
	combo.addItemListener(this);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pack(); // �ȿ� ����ִ� ������Ʈ �鿡 ���� �ڵ������� ó�� ũ�⸦ ����
	setVisible(true);
	
	
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getStateChange() == ItemEvent.SELECTED){
			
			ta.append(e.getItem() +"�� ���õǾ����ϴ� \n");
		}
		
		
	}
	

}
