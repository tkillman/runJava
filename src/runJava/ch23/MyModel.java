package runJava.ch23;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel{

	Object [][] data; //data를 Object 2차 배열로 받는다.
	String [] columnName; //컬럼값을 String 배열로 받는다.
	// 레코드의 행과 열의 개수를 저장할 변수 선언
	
	int rows, cols; // 행과 열 값 설정

	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		
		return data.length; // 행값을 반환
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		
		return columnName.length; //열값을 반환
	}

	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex]; //data 값들을 넣어준다.
	}
	
	// 레코드의 개수를 알아낸다.
	
	public void getRowCount(ResultSet rsScroll){ // 내려가야 될 값이 있으면 true 를 반환해서 실행 , 없으면 false 를 반환해서 실행하지 않도록 한다.
		
		try {
			
			rsScroll.last(); // 값이 남아있으면 true , 없으면 false를 반환 
		    rows = rsScroll.getRow();
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	// 데이터 베이스에 저장된 데이터를 채움
	
	public void setData(ResultSet rs){ // ResultSet rs를 매개변수로 받는 setData 메소드 정의
		
		try {
			
			ResultSetMetaData rsmd; //rsmd 래퍼런스변수 생성
			rsmd= rs.getMetaData(); // 
			cols = rsmd.getColumnCount(); // int col =전체 컬럼 갯수값을 반환
			columnName = new String[cols]; // String[cols] 만큼 columnName이라는 배열 생성  
			for(int i=0;i<cols;i++){
				columnName[i] = rsmd.getColumnName(i+1);} //컬럼 이름값을 데이터에 넣는다.
			
			data = new Object[rows][cols]; // data에 인스턴스 할당
			
			int r=0;
			
			while(rs.next()){ // rs에 값이 남아 있으면
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
	

