package runJava.ch21.ex05;

import java.awt.BorderLayout;


import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

////////************콤보 박스******************
//콤보 박스 : 여러 개의 항목 중에서 하나를 선택할 수 있도록
//
public class FrameExam extends JFrame implements ItemListener{
	JComboBox<String> combo;
	JTextArea ta;
	
	public FrameExam() {
		// TODO Auto-generated constructor stub
	String[] str={"이름","아이디","성별","전화번호"};
	combo = new JComboBox<String>(str);
	
	add(new Label("검색하고자 하는 항복을 선택하시오"),BorderLayout.NORTH);
	add(combo, BorderLayout.CENTER);
	
	ta=new JTextArea(10,20);
	add(new JScrollPane(ta), BorderLayout.SOUTH); // JTextArea 구간을 Scroll로 사용 할 수 있도록
	
	combo.addItemListener(this);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pack(); // 안에 들어있는 컴포넌트 들에 따라 자동적으로 처음 크기를 조정
	setVisible(true);
	
	
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getStateChange() == ItemEvent.SELECTED){
			
			ta.append(e.getItem() +"가 선택되었습니다 \n");
		}
		
		
	}
	

}
