package runJava.ch21.ex06;

import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/////************** ����Ʈ �ڽ�********************
//1. ����Ʈ �ڽ� ���� Jlist
//2. ������ â�� ���δ�. 

// ****** ����Ʈ �ڽ� ó��*********
//

public class FrameExam extends JFrame implements ListSelectionListener {

	JList<String> list;
	JTextField tf;
	
	public FrameExam() {
		// TODO Auto-generated constructor stub
	String[] str={"���","���弭��","����", "����","����","��ȭ"};
	list= new JList<String>(str);
	
	add(new Label("��̸� �����Ͻÿ�."),BorderLayout.NORTH);
	add(list, BorderLayout.CENTER);
	
	tf=new JTextField();
	add(tf, BorderLayout.SOUTH);
	
	list.addListSelectionListener(this);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(500,200);
	setVisible(true);
	
	}
	
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		Object [] item; //���õ� �׸���� ������ �迭 ����
		String total=""; // ���õ� �׸���� �����Ͽ� ������  String ��ü ����
		
		JList li= (JList)e.getSource();
		//���� ���õ� �׸��� �迭 ���·� ��� ��..
		
		item = li.getSelectedValues();
		
		for(int i=0;i<item.length;i++){
			
			total=total+item[i] +",  ";
		}
		// ���õ� �׸��� �ؽ�Ʈ �ʵ忡 ����ϱ�
		
		tf.setText(total+"�� ���õǾ����ϴ�.");
	
	}

}
