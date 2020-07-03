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
		 super("메모장-제목없음");
		 
		 mb = new MenuBar();
		 
		 mnufile = new Menu("파일");
		 mnuedit = new Menu("편집");
		 mnuhelp = new Menu("도움말");
		 
		 mnunew = new MenuItem("새파일");
		 mnuopen = new MenuItem("열기");
		 mnusave = new MenuItem("저장");
		 mnuexit = new MenuItem("종료");
		 
		 mnucut = new MenuItem("잘라내기");
		 mnucopy = new MenuItem("복사하기"); 
		 mnupaste = new MenuItem("붙여넣기");
		 mnuall = new MenuItem("전체선택");
		 mnudelete = new MenuItem("삭제");
		 
		 mnuhelpinfo = new MenuItem("메모장 정보");
		 
		 
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
		 
		 if(name.equals("새파일")){
			 if(bModify){
				 MessageBox();
				 if(bSaveas){
					 saveFile();
				 }
			 }
			 ta.setText("");
			 ta.requestFocus();
		 }else if(name.equals("열기")){
			 openfile = new FileDialog(this, "Open", FileDialog.LOAD);
			 openfile.show();
			 ta.requestFocus();
		 }else if(name.equals("저장")){
			 bSaveas = true;
			 saveFile();
			 ta.requestFocus();	 
		 }else if(name.equals("종료")){
			 if(bModify){
				 MessageBox();
				 if(bSaveas){
					 saveFile();
				 }
			 }
			 System.exit(0);
		 }else if(name.equals("복사하기")){
			 String data = ta.getSelectedText();
			 StringSelection ss = new StringSelection(data);
			 cb.setContents(ss, ss);
		 }else if(name.equals("잘라내기")){
			 String data = ta.getSelectedText();
			 
		 }
	 }
	 
	

}

