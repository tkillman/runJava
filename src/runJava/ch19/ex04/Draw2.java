package runJava.ch19.ex04;
import java.awt.*;

public class Draw2 extends Frame{
  
	public Draw2(String title){
    super(title);
  }
  
  public void paint(Graphics g){
    
    g.fillRoundRect(120,30,50,50,20,20);
   
  }
  
  public static void main(String[] args){
    Frame f= new Draw2("도형 그리기");
    f.setSize(300,200);
    f.setVisible(true);
  }
}