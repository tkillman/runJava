package hanJangHee.day1121;

import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.awt.datatransfer.*;

class Memo extends Frame implements ActionListener{
	
	MenuBar mb;
	
	Menu mnufile;
	Menu mnuedit;
	Menu mnuhelp;
	
	MenuItem mnunew;
	MenuItem mnuopen;
	MenuItem mnusave;
	MenuItem mnuexit;
	
	MenuItem mnucut;
	MenuItem mnucopy;
	MenuItem mnupaste;
	MenuItem mnuall;
	MenuItem mnudelete;
	
	MenuItem mnuhelpinfo;
	
	TextArea ta;
	
	 FileDialog openfile;
	 FileDialog savefile;
	 
	 Dialog messagebox;
	 Button yes,no;
	 
	 Dialog d1;
	 Button bu1;
	 
	 Clipboard cb;
	 
	 String str = "";
	 
	 boolean bModify = false, bSaveas = true;
	 
	 public Memo(){
		 super("�޸���-�������");
		 
		 mb = new MenuBar();
		 
		 mnufile = new Menu("����");
		 mnuedit = new Menu("����");
		 mnuhelp = new Menu("����");
		 
		 mnunew = new MenuItem("������");
		 mnuopen = new MenuItem("����");
		 mnusave = new MenuItem("����");
		 mnuexit = new MenuItem("����");
		 
		 mnucut = new MenuItem("�߶󳻱�");
		 mnucopy = new MenuItem("�����ϱ�"); 
		 mnupaste = new MenuItem("�ٿ��ֱ�");
		 mnuall = new MenuItem("��ü����");
		 mnudelete = new MenuItem("����");
		 
		 mnuhelpinfo = new MenuItem("�޸��� ����");
		 
		 
		 mnufile.add(mnunew);
		 mnufile.add(mnuopen);
		 mnufile.add(mnusave);
		 mnufile.addSeparator();
		 mnufile.add(mnuexit);
		 
		 mnuedit.add(mnucut);
		 mnuedit.add(mnucopy);
		 mnuedit.add(mnupaste);
		 mnuedit.add(mnuall);
		 mnuedit.addSeparator();
		 mnuedit.add(mnudelete);
		 
		 mnuhelp.add(mnuhelpinfo);
		 
		 mb.add(mnufile);
		 mb.add(mnuedit);
		 mb.add(mnuhelp);
		 
		 setMenuBar(mb);
		 
		 ta = new TextArea(20,40);
		 add(ta);
		 
		 setBounds(300,200,400,400);
		 setVisible(true);
		 
		 addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e){
				 if(bModify){
					 savefile();
				 }
				 System.exit(0);;
			 }
		 });
		 
		mnunew.addActionListener(this);
		mnuopen.addActionListener(this);
		mnusave.addActionListener(this); 
		mnuexit.addActionListener(this);
		
		mnucut.addActionListener(this);
		mnucopy.addActionListener(this); 
		mnupaste.addActionListener(this); 
		mnuall.addActionListener(this); 
	    mnudelete.addActionListener(this);
	    mnuhelpinfo.addActionListener(this);
	    
	    ta.addKeyListener(new KeyAdapter(){
	    	public void keyTyped(KeyEvent ke){
	    		bModify = true;
	    	}
	    });
	    
	    cb = getToolkit().getSystemClipboard();  
	 }
	 
	 public void actionPerformed(ActionEvent e){
		 String name = e.getActionCommand();
		 
		 if(name.equals("������")){
			 if(bModify){
				 MessageBox();
				 if(bSaveas){
					 saveFile();
				 }
			 }
			 ta.setText("");
			 ta.requestFocus();
		 }else if(name.equals("����")){
			 openfile = new FileDialog(this, "Open", FileDialog.LOAD);
			 openfile.show();
			 ta.requestFocus();
		 }else if(name.equals("����")){
			 bSaveas = true;
			 saveFile();
			 ta.requestFocus();	 
		 }else if(name.equals("����")){
			 if(bModify){
				 MessageBox();
				 if(bSaveas){
					 saveFile();
				 }
			 }
			 System.exit(0);
		 }else if(name.equals("�����ϱ�")){
			 String data = ta.getSelectedText();
			 StringSelection ss = new StringSelection(data);
			 cb.setContents(ss, ss);
		 }else if(name.equals("�߶󳻱�")){
			 String data = ta.getSelectedText();
			 
		 }
	 }
	 
	

}

