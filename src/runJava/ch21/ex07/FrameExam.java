package runJava.ch21.ex07;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


/////////******** JTable ���****************
//  1. �� ���� �� ������ ������ ������ �迭 ����
/*	Object [][] data = {  ,  ,  ,};
    2. �������� ����� ������ ������ ������ �迭 ����
    String [] columnName = {   ,    , };
    3. JTable ��ü ����
	JTable table = new JTable(data, columnName);
	4. �����ӿ� ���̺��� �߰�				
	add(new JScrollPane(table));				
					
					*/
public class FrameExam extends JFrame{
	
	//1.���̺��� �� ���� �� ������ ������ �迭�� �ִ´�.
	Object[][] data={
		{"������","jeea@mem.com","1111",20},
		{"�����","rose@mem.com","2222",30},
		{"�����","lily@mem.com","3333",25}
	};

	//2. ���̺��� �� �̸��� �� ������ ������ �迭�� �ִ´�.
	String [] columnName= {"�̸�","���̵�","�н�����","����"};
	JTable table;
	
	public FrameExam() {
		// TODO Auto-generated constructor stub
		
		//3. JTable ��ü ����
	table = new JTable(data,columnName);
	
	    //4. JScrollPane �� ���̺���
	add(new JScrollPane(table));
	
	setSize(500,200);
	setVisible(true);
	
	}
	
}
