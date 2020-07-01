package runJava.ch21.ex08;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


/////*********** 이 클래스는 V 담당
public class FrameExam extends JFrame{
	
	MemberModel model;
	JTable table;
	
	public FrameExam() {
		// TODO Auto-generated constructor stub
		model= new MemberModel();
		
		table= new JTable(model);
		add(new JScrollPane(table));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setVisible(true);
			
	}
	

}
