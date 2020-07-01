package runJava.ch21.ex07;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


/////////******** JTable 사용****************
//  1. 각 셀에 들어갈 내용을 저장한 이차원 배열 선언
/*	Object [][] data = {  ,  ,  ,};
    2. 제목으로 출력할 내용을 저장한 일차원 배열 선언
    String [] columnName = {   ,    , };
    3. JTable 객체 생성
	JTable table = new JTable(data, columnName);
	4. 프레임에 테이블을 추가				
	add(new JScrollPane(table));				
					
					*/
public class FrameExam extends JFrame{
	
	//1.테이블의 각 셀에 들어갈 내용을 이차원 배열에 넣는다.
	Object[][] data={
		{"강지아","jeea@mem.com","1111",20},
		{"이장미","rose@mem.com","2222",30},
		{"김백합","lily@mem.com","3333",25}
	};

	//2. 테이블의 열 이름이 들어갈 내용을 일차원 배열에 넣는다.
	String [] columnName= {"이름","아이디","패스워드","나이"};
	JTable table;
	
	public FrameExam() {
		// TODO Auto-generated constructor stub
		
		//3. JTable 객체 생성
	table = new JTable(data,columnName);
	
	    //4. JScrollPane 에 테이블을
	add(new JScrollPane(table));
	
	setSize(500,200);
	setVisible(true);
	
	}
	
}
