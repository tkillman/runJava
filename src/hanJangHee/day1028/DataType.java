package hanJangHee.day1028;

class DataType {

	public static void main(String[] args) {
		
	/*	int a = 10;
		System.out.println(++a);
		System.out.println(a++);
		
		System.out.println(a);
	
	
		
		int i = 10;
		int n = i++%2;
		
		System.out.println(i);
		System.out.println(n);
		
		
		
		int a = 15;
		int b = 16;
		
		String s = "";
		
		s += a > b ? (a-b)+"��ŭ a�� ũ��" : (b-a)+"��ŭ b�� ũ��";
		
	    System.out.println(s);
	    
		
	*/
		
	    int a = 15;
	    int b = 16;
		
	    String s ="";
	    
		s += ++a >= b ? a==b ? "a�� b�� ����" : (a-b)+"��ŭ a�� ũ��" : (b-a)+"��ŭ b�� ũ��";
		
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
	}
}
