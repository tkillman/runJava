package hanJangHee.day1118;

import java.awt.*;

class ChoiceEx {
	public static void main(String[] args){
		Frame f = new Frame("Choice �׽�Ʈ");
		Panel p = new Panel();
		
		Choice ch = new Choice();
		
		ch.add("���");
		ch.add("����");
		ch.add("��");
		ch.add("�ٳ���");
		
		p.add(ch);
		
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
	}

}
