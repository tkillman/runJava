package hanJangHee.day1118;

import java.awt.*;

class DialogEx extends Frame{
	
	public DialogEx(){
		super("Dialog Test");
		
		Dialog d = new Dialog(this, "����� ���̾�α�");
		
		setSize(200,200);
		setVisible(true);
		
		d.setSize(200, 100);
		d.setVisible(true);
		
	}

	public static void main(String[] args){
		new DialogEx();
	}
	
}
