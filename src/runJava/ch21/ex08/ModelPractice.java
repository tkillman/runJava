package runJava.ch21.ex08;

import javax.swing.table.AbstractTableModel;

public class ModelPractice extends AbstractTableModel{

	
	Object [][] data={
			{"�赿��","tkil@naver.com","1111",30},
			{"�ֺ���","bichan@naver.com","1111",26},
			{"����ö","inchol@naver.com","1111",28}
	};
	
	String [] colName ={"�̸�","�̸���","��й�ȣ","����"};
	
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}


	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return data[0].length;
	}


	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}

	
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return colName[column];
	}


	public ModelPractice() {
		// TODO Auto-generated constructor stub
	}

}
