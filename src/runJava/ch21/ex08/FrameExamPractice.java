package runJava.ch21.ex08;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class FrameExamPractice extends JFrame{

	ModelPractice model;	
	JTable table;
	
	public FrameExamPractice() {
		// TODO Auto-generated constructor stub
	  
		model = new ModelPractice();	
		table = new JTable(model);	
		add(new JScrollPane(table));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,200);
		setVisible(true);
	
	}
}
