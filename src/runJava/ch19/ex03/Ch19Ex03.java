package runJava.ch19.ex03;

import java.awt.Frame;
import java.awt.Graphics;

public class Ch19Ex03 {

	public static void main(String[] args) {
		
		
		
		GraphicsFrame f= new GraphicsFrame();
		Graphics g=f.getGraphics();
		f.print(g);
	}
}
