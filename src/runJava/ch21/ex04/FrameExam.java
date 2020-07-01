package runJava.ch21.ex04;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//���� ��ư, üũ�ڽ��� ������ �̺�Ʈ
//1.JRadioButton�� ���� ��ư ����
//2. ��ư���� �������� �ִ� ���� �����ֱ� ���� ButtonGroup Ŭ�� �̿�
// üũ�� �̺�Ʈ�� ó���ϱ� ���� ItemListener �������̽� ���ItemEvent.SELECTED �� ���ٸ� ���õ� ��.
//

public class FrameExam extends JFrame implements ItemListener {

	JPanel ceterPanel;
	JRadioButton rb01,rb02,rb03,rb04;
	JCheckBox ch01,ch02,ch03,ch04;
	JTextArea ta;
	
	public FrameExam() {
		// TODO Auto-generated constructor stub
	
		ceterPanel=new JPanel(new GridLayout(3, 2));
		
		//���� ������ ���� ���� ��ư ���
		JPanel p01= new JPanel();
		ButtonGroup gr01= new ButtonGroup();
		rb01= new JRadioButton(" ��     ��  ",true);
		rb02= new JRadioButton("��   ��",false);
		gr01.add(rb01); gr01.add(rb02);
		
		p01.add(new JLabel("���� ����:"));
		p01.add(rb01); p01.add(rb02);
		ceterPanel.add(p01);
		
		
		//ȸ�� ������ ���� ���� ��ư ���
		JPanel p02= new JPanel();
		ButtonGroup gr02= new ButtonGroup();
		rb03= new JRadioButton("���ȸ��",true);
		rb04= new JRadioButton("�Ϲ�ȸ��",false);
		gr02.add(rb03); gr02.add(rb04);
		p02.add(new JLabel("ȸ������ :"));
		p02.add(rb03); p02.add(rb04);
		ceterPanel.add(p02);
		
		//��� ������ ���� üũ�ڽ� ���
		JPanel p03= new JPanel();
		ch01= new JCheckBox("���", true);
		ch02= new JCheckBox("���弭��", false);
		ch03 = new JCheckBox("����", false);
		p03.add(new JLabel("��� ����: "));
		p03.add(ch01); p03.add(ch02); p03.add(ch03);
		ceterPanel.add(p03);
		
		 add(ceterPanel,BorderLayout.CENTER);
		
		ta=new JTextArea(10,20);
		add(new JScrollPane(ta), BorderLayout.SOUTH);
		
		rb01.addItemListener(this);
		rb02.addItemListener(this);
		rb03.addItemListener(this);
		rb04.addItemListener(this);
		
		ch01.addItemListener(this);
		ch02.addItemListener(this);
		ch03.addItemListener(this);
		
		
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object obj=e.getSource();
		if(e.getStateChange()==ItemEvent.SELECTED){
			if(obj==rb01){
				ta.append("���ڼ��� \n");}
				else if(obj==rb02){ ta.append("���ڼ��� \n");}
				else if(obj==rb03){ta.append("���ȸ������ \n");}
				else if(obj==rb04){ta.append("�Ϲ�ȸ������ \n");}
				
			}
			
		if(obj==ch01){
			if(e.getStateChange()== ItemEvent.SELECTED){
				ta.append("��� ����  \n");
			} else{ ta.append("��� ��ü \n");}
			
		}
		if(obj==ch02){
			if(e.getStateChange()== ItemEvent.SELECTED){
				ta.append("���弭�� ���� \n");
			} else{ ta.append("���弭������ \n");}
			
		}
		if(obj==ch03){
			if(e.getStateChange()== ItemEvent.SELECTED){
				ta.append("���� ����  \n");
			} else{ ta.append("���� ���� \n");}
			
		}
		
		}
		
		
	}


