package runJava.ch19.ex02;

import java.awt.Graphics;

public class Ch19Ex02 {

	public static void main(String[] args) {
		GraphicsFrame f= new GraphicsFrame();
		Graphics g=f.getGraphics();
		f.print(g);
	}
}
