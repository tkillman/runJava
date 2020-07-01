package runJava.ch21.ex06;

import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/////************** 리스트 박스********************
//1. 리스트 박스 생성 Jlist
//2. 프레임 창에 붙인다. 

// ****** 리스트 박스 처리*********
//

public class FrameExam extends JFrame implements ListSelectionListener {

	JList<String> list;
	JTextField tf;
	
	public FrameExam() {
		// TODO Auto-generated constructor stub
	String[] str={"등산","윈드서핑","독서", "수영","골프","영화"};
	list= new JList<String>(str);
	
	add(new Label("취미를 선택하시오."),BorderLayout.NORTH);
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
		Object [] item; //선택된 항목들을 저장할 배열 선언
		String total=""; // 선택된 항목들을 연결하여 저장할  String 객체 선언
		
		JList li= (JList)e.getSource();
		//다중 선택된 항목을 배열 형태로 얻어 옴..
		
		item = li.getSelectedValues();
		
		for(int i=0;i<item.length;i++){
			
			total=total+item[i] +",  ";
		}
		// 선택된 항목을 텍스트 필드에 출력하기
		
		tf.setText(total+"가 선택되었습니다.");
	
	}

}
