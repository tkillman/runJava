package runJava.ch08;


/*this�� ����ϴ� ���� : �ʵ� ������ ������ �޼ҵ��� �Ű������� ������ �̸��� ������ ���� �� �̸�
				�����ϱ� ���ؼ� �ڵ������� ������ ���۷��� ������ this�� ����ϰ� �ȴ�.
*/	
///     ******Ch08Ex01�� �Բ� �� ��...	


public class Point {
	
	int x;
	int y;
	public Point() {
		// TODO Auto-generated constructor stub
	}

	public Point(int new_x,int new_y){
		this.x= new_x;
		this.y= new_y;
		
	}
	
	public void setX(int x){
		this.x=x;
		//x=x; �̷��� �ϰ� �Ǹ� �ʵ��� x���� �ٲ� ���� ����.
	}
	
	public void showPoint(){
		System.out.println("x��ǥ :"+x+",y��ǥ : "+y);
	}
	
	
	
}
