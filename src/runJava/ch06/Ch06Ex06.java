package runJava.ch06;

///************* return�� ���ӻ�************
// 1. �޼ҵ��� ������� ��ȯ 
//2. �������������� ���̻� ������ �������� �ʰ� �޼ҵ带 �������´�.


public class Ch06Ex06 {
	
	static int abs(int x){
		int y;
		if(x<0)
		y=-x;
		else 
			y=x;
		return y;
		
	}

	public static void main(String[] args) {
		int a=-5, result; // int�� �ڷ� result Ư���� ���ǹ���̳�
		
		result = abs(a);
		
		System.out.println(a+"�� ���밪��  :" +result +"�̴�.");
		
		System.out.println(10 +"�� ���밪�� : " +abs(10) +"�̴�.");
	}
	
}
