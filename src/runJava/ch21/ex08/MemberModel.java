package runJava.ch21.ex08;

import javax.swing.table.AbstractTableModel;


  ///////////****** JTable��  MVC ���� ����ϱ� ���� AbstractTableModel �߻� Ŭ����
//�� Ŭ������ M ���
// **�ֿ� �޼ҵ�
// int getColumnCount() --> ���� ���� ��ȯ
// int getRowCount() -->���� ���� ��ȯ
// Object getValueAt(int row,int column) --> �־��� ��� ��ġ�� ����� �����͸� ��ȯ
// String getColumnName(int column) ---> ���̺��� �÷� �̸� ��ȯ

public class MemberModel extends AbstractTableModel{

	// 1. ���̺��� �� ���� �� ������ ������ �迭�� �ִ´�.
	Object[][] data={
			{"������","jeea@mem.com","1111",20},
			{"�����","rose@mem.com","2222",30},
			{"�����","lily@mem.com","3333",25}
		}; 
	
	
	//2. ���̺��� �� �̸��� �� ������ ������ �迭�� �ִ´�.
	String [] columnName= {"�̸�","���̵�","�н�����","����"};
	
	
	
	
	@Override
	public String getColumnName(int column) {
	// �÷� �̸����� �˷��ִ� �޼ҵ�	
		return columnName[column];
	}

	@Override
	public int getRowCount() { //�� ������ �˷��ִ� �޼ҵ�
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public int getColumnCount() { // �� ������ �˷��ִ� �޼ҵ�
		// TODO Auto-generated method stub
		return data[0].length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) { //�����͸� ����ִ� �޼ҵ�
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}
	
	

}
