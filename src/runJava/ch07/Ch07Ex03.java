package runJava.ch07;


///******* private ���� ��� : public get , set �޼ҵ�

class Point3{
	
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}


public class Ch07Ex03 {
	
	public static void main(String[] args) {
		
		Point3 pt01= new Point3();
		pt01.setX(10);
		pt01.setY(30);
		System.out.println("pt01.x=="+pt01.getX() +"\t  pt01.y=="+pt01.getY());
		
		
	}

}
