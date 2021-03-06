package hanJangHee.day1123;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

class MultiClient implements ActionListener{
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private JFrame jframe;
	private JTextField jtf;
	private JTextArea jta;
	private JLabel jlb1, jlb2;
	private JPanel jp1, jp2;
	private String ip;
	private String id;
	private JButton jbtn;
	
	public MultiClient(String argIp, String argId){
		ip = argIp;
		id = argId;
		jframe = new JFrame("Multi Chatting");
		jtf = new JTextField(30);
		jta = new JTextArea("", 10, 50);
		jlb1 = new JLabel("Usage ID : [[ " + id + "]]");
		jlb2 = new JLabel("IP : " + ip);
		jbtn = new JButton("����");
		jp1 = new JPanel();
		jp2 = new JPanel();
		jlb1.setBackground(Color.yellow);
		jlb2.setBackground(Color.green);
		jta.setBackground(Color.pink);
		jp1.setLayout(new BorderLayout());
		jp2.setLayout(new BorderLayout());
		jp1.add(jbtn, BorderLayout.EAST);
		jp1.add(jtf, BorderLayout.CENTER);
		jp2.add(jlb1, BorderLayout.CENTER);
		jp2.add(jlb2, BorderLayout.EAST);
		jframe.add(jp1, BorderLayout.SOUTH);
		jframe.add(jp2, BorderLayout.NORTH);
		JScrollPane jsp = new JScrollPane(jta,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jframe.add(jsp, BorderLayout.CENTER);
		jtf.addActionListener(this);
		jbtn.addActionListener(this);
		
		jframe.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				try{
					oos.writeObject(id + "#eixt");
				}catch(IOException ee){
					System.out.println(id);
					ee.printStackTrace();
				}
				System.exit(0);
			}
			public void windowOpened(WindowEvent e){
				jtf.requestFocus();
			}
			
		});
		jta.setEditable(false);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int screenHeight = d.height;
		int screenWidth = d.width;
		jframe.pack();
		jframe.setLocation((screenWidth - jframe.getWidth()) / 2,
				(screenHeight - jframe.getHeight()) / 2);
		jframe.setResizable(false);
		jframe.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		
	
	
	
		
		
	}
	
	

}
