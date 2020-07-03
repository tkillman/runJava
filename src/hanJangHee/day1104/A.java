package hanJangHee.day1104;

class A { 

	private static A a = new A();
	
	int x;
	
	private A(){
	}
	
	public static A getInstance(){
		if(a==null){
			a=new A();
		}
		return a;
	}
	
	
}

class B{
	public static void main(String[] args){
		A a1 = A.getInstance();
		a1.x = 20;
		System.out.println(a1.x);
	}
}