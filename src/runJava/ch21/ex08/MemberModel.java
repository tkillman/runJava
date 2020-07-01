package runJava.ch21.ex08;

import javax.swing.table.AbstractTableModel;


  ///////////****** JTable을  MVC 모드로 사용하기 위한 AbstractTableModel 추상 클래스
//이 클래스는 M 담당
// **주요 메소드
// int getColumnCount() --> 열의 수를 반환
// int getRowCount() -->행의 수를 반환
// Object getValueAt(int row,int column) --> 주어진 행렬 위치에 저장된 데이터를 반환
// String getColumnName(int column) ---> 테이블의 컬럼 이름 반환

public class MemberModel extends AbstractTableModel{

	// 1. 테이블의 각 셀에 들어갈 내용을 이차원 배열에 넣는다.
	Object[][] data={
			{"강지아","jeea@mem.com","1111",20},
			{"이장미","rose@mem.com","2222",30},
			{"김백합","lily@mem.com","3333",25}
		}; 
	
	
	//2. 테이블의 열 이름에 들어갈 내용을 일차원 배열에 넣는다.
	String [] columnName= {"이름","아이디","패스워드","나이"};
	
	
	
	
	@Override
	public String getColumnName(int column) {
	// 컬럼 이름값을 알려주는 메소드	
		return columnName[column];
	}

	@Override
	public int getRowCount() { //행 갯수를 알려주는 메소드
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public int getColumnCount() { // 열 갯수를 알려주는 메소드
		// TODO Auto-generated method stub
		return data[0].length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) { //데이터를 집어넣는 메소드
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}
	
	

}
