package hanJangHee.day1118;

import java.awt.*;

class CanvasEx {
	public static void main(String[] args){
		Frame f = new Frame("Canvas Å×½ºÆ®");
		
		MyCanvas canvas = new MyCanvas();
		
		canvas.setBackground(Color.white);
		
		f.add(canvas);
		
		f.setLocation(300,300);
		f.setSize(200,200);
		f.setVisible(true);
	}

}

class MyCanvas extends Canvas{
	public void paint(Graphics g){
		g.setColor(Color.green);
		g.drawRect(20, 20, 100, 100);
	}
}
