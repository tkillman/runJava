package runJava.ch07;


// default �����ڸ� �ּ�ó��

public class Point2 {
		int x;
		int y;
	
	
	/*public Point2() {
		// TODO Auto-generated constructor stub
		System.out.println("�Ű������� ���� ����Ʈ ������");
		
	}
*/	
	public Point2(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	public void showPoint(){
		System.out.println("(" + x +","+y +")");
		
	}
	
}
