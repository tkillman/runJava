package hanJangHee.day1102;

class InitTest {

	static int cv = 1;
	int iv = 1;
	
	static{ cv = 2;}
	{ iv = 2; }
	InitTest(){ iv = 3; }
	
	public static void main(String[] args){
		InitTest in = new InitTest();
		System.out.println(InitTest.cv);
		System.out.println(in.iv);
	}
	
	
}
