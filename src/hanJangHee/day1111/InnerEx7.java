package hanJangHee.day1111;

import java.awt.*;
import java.awt.event.*;

class InnerEx7 {
	public static void main(String[] args){
		Frame f = new Frame();
		Button b = new Button("Start");
		b.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				System.out.println("ActionEvent occurred!!!");
			}
		});
		
		f.add(b);
		f.setSize(300, 300);
		f.setVisible(true);
		
	}
}

/*class EventHandler implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("ActionEvent occurred!!");
	} 
} */
