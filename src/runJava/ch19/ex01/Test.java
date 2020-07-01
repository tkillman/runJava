package runJava.ch19.ex01;
import java.awt.*;


public class Test extends Frame {

	
	
	public void print(Graphics g) {
		
		g.drawString("hello", 0,0);
		g.drawString("해피 바이러스", 100, 100);
	}
	
	public static void main(String[] args) {
		
		Frame f= new Test();
	
		f.setSize(300, 200);
		f.setVisible(true);

}
}