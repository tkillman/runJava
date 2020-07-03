package hanJangHee.day1107;

interface InterTest{
	int A = 100;
	int getA();
}

class InterTestEx implements InterTest{
	public static void main(String[] args){
		InterTest it = new InterTestEx();
		System.out.println("getA()::" + it.getA());
	}

public int getA(){
	return A;
}
}