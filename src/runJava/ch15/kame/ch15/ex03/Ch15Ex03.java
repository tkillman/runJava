package runJava.ch15.kame.ch15.ex03;


//// ************* Object Ŭ������ toString() �޼ҵ� �������̵�**************
// ���ڿ����� ��ȯ�Ѵ�.

class Point{
	int x,y;
	public Point(){}
	public Point(int x, int y){
		
		this.x = x;
		this.y =y;		
	}
	
// ��ü�� ���ڿ� ���� �ƴ� �������� ���ڿ� ���� �ް� ���� �� Object��
	//toString() �޼ҵ带 �� �����ؼ� ����Ѵ�.
	public String toString(){
		String str;
		str="("+x+","+y+")";
		return str;
		
	}
	
}

public class Ch15Ex03 {
	
		public static void main(String[] args) {
			
			Point d2=new Point(10, 20);
			
			System.out.println(d2.toString());
			
			System.out.println(">>>>d2 ��ü<<<<");
			System.out.println(d2);
			
		}
	
}
