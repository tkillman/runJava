package runJava.ch21.ex04;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//라디오 버튼, 체크박스와 아이템 이벤트
//1.JRadioButton을 통한 버튼 생성
//2. 버튼끼리 연관성이 있는 것을 보여주기 위한 ButtonGroup 클라스 이용
// 체크된 이벤트를 처리하기 위한 ItemListener 인터페이스 사용ItemEvent.SELECTED 와 같다면 선택된 것.
//

public class FrameExam extends JFrame implements ItemListener {

	JPanel ceterPanel;
	JRadioButton rb01,rb02,rb03,rb04;
	JCheckBox ch01,ch02,ch03,ch04;
	JTextArea ta;
	
	public FrameExam() {
		// TODO Auto-generated constructor stub
	
		ceterPanel=new JPanel(new GridLayout(3, 2));
		
		//성별 구분을 위한 라디오 버튼 등록
		JPanel p01= new JPanel();
		ButtonGroup gr01= new ButtonGroup();
		rb01= new JRadioButton(" 남     자  ",true);
		rb02= new JRadioButton("여   자",false);
		gr01.add(rb01); gr01.add(rb02);
		
		p01.add(new JLabel("성별 구분:"));
		p01.add(rb01); p01.add(rb02);
		ceterPanel.add(p01);
		
		
		//회원 구분을 위한 라디오 버튼 등록
		JPanel p02= new JPanel();
		ButtonGroup gr02= new ButtonGroup();
		rb03= new JRadioButton("우수회원",true);
		rb04= new JRadioButton("일반회원",false);
		gr02.add(rb03); gr02.add(rb04);
		p02.add(new JLabel("회원구분 :"));
		p02.add(rb03); p02.add(rb04);
		ceterPanel.add(p02);
		
		//취미 선택을 위한 체크박스 등록
		JPanel p03= new JPanel();
		ch01= new JCheckBox("등산", true);
		ch02= new JCheckBox("윈드서핑", false);
		ch03 = new JCheckBox("독서", false);
		p03.add(new JLabel("취미 선택: "));
		p03.add(ch01); p03.add(ch02); p03.add(ch03);
		ceterPanel.add(p03);
		
		 add(ceterPanel,BorderLayout.CENTER);
		
		ta=new JTextArea(10,20);
		add(new JScrollPane(ta), BorderLayout.SOUTH);
		
		rb01.addItemListener(this);
		rb02.addItemListener(this);
		rb03.addItemListener(this);
		rb04.addItemListener(this);
		
		ch01.addItemListener(this);
		ch02.addItemListener(this);
		ch03.addItemListener(this);
		
		
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object obj=e.getSource();
		if(e.getStateChange()==ItemEvent.SELECTED){
			if(obj==rb01){
				ta.append("남자선택 \n");}
				else if(obj==rb02){ ta.append("여자선택 \n");}
				else if(obj==rb03){ta.append("우수회원선택 \n");}
				else if(obj==rb04){ta.append("일반회원선택 \n");}
				
			}
			
		if(obj==ch01){
			if(e.getStateChange()== ItemEvent.SELECTED){
				ta.append("등산 선택  \n");
			} else{ ta.append("등산 해체 \n");}
			
		}
		if(obj==ch02){
			if(e.getStateChange()== ItemEvent.SELECTED){
				ta.append("윈드서핑 선택 \n");
			} else{ ta.append("윈드서핑해제 \n");}
			
		}
		if(obj==ch03){
			if(e.getStateChange()== ItemEvent.SELECTED){
				ta.append("독서 선택  \n");
			} else{ ta.append("독서 해제 \n");}
			
		}
		
		}
		
		
	}


