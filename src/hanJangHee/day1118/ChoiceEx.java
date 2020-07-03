package hanJangHee.day1118;

import java.awt.*;

class ChoiceEx {
	public static void main(String[] args){
		Frame f = new Frame("Choice 테스트");
		Panel p = new Panel();
		
		Choice ch = new Choice();
		
		ch.add("사과");
		ch.add("딸기");
		ch.add("배");
		ch.add("바나나");
		
		p.add(ch);
		
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
	}

}
