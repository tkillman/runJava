package runJava.ch12.kame.ch12.ex04;

public class Triangle implements Color {

	
	int color=0; // color ������ 0
	
	
	@Override
	public void setColor(int c) { //setColor(����) �޼ҵ�
		color =c; 

	}

	@Override
	public int getColor() { //getColor() �޼ҵ�
		
		return color;
	}

}
