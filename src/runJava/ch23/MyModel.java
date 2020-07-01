package runJava.ch23;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel{

	Object [][] data; //data�� Object 2�� �迭�� �޴´�.
	String [] columnName; //�÷����� String �迭�� �޴´�.
	// ���ڵ��� ��� ���� ������ ������ ���� ����
	
	int rows, cols; // ��� �� �� ����

	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		
		return data.length; // �ప�� ��ȯ
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		
		return columnName.length; //������ ��ȯ
	}

	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex]; //data ������ �־��ش�.
	}
	
	// ���ڵ��� ������ �˾Ƴ���.
	
	public void getRowCount(ResultSet rsScroll){ // �������� �� ���� ������ true �� ��ȯ�ؼ� ���� , ������ false �� ��ȯ�ؼ� �������� �ʵ��� �Ѵ�.
		
		try {
			
			rsScroll.last(); // ���� ���������� true , ������ false�� ��ȯ 
		    rows = rsScroll.getRow();
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	// ������ ���̽��� ����� �����͸� ä��
	
	public void setData(ResultSet rs){ // ResultSet rs�� �Ű������� �޴� setData �޼ҵ� ����
		
		try {
			
			ResultSetMetaData rsmd; //rsmd ���۷������� ����
			rsmd= rs.getMetaData(); // 
			cols = rsmd.getColumnCount(); // int col =��ü �÷� �������� ��ȯ
			columnName = new String[cols]; // String[cols] ��ŭ columnName�̶�� �迭 ����  
			for(int i=0;i<cols;i++){
				columnName[i] = rsmd.getColumnName(i+1);} //�÷� �̸����� �����Ϳ� �ִ´�.
			
			data = new Object[rows][cols]; // data�� �ν��Ͻ� �Ҵ�
			
			int r=0;
			
			while(rs.next()){ // rs�� ���� ���� ������
				for(int c=0; c<cols; c++){ //c
					if(cols!=1)
						data[r][c] = rs.getObject(c+1);
						
					 else data [r][c] = (String)rs.getObject(c+1);	}	
			
				r++;
			} 	
			
			
			rs.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
	

