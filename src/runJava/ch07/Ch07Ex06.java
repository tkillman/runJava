package runJava.ch07;

// ************** �޼ҵ� �����ε�***************
// �Ű������� ������ �ٸ� ���,������ Ÿ���� �ٸ� ���


public class Ch07Ex06 {
	
	static void prn(int x, int y, int z){
		
		System.out.println(x+"+"+y+"+"+z);
		
	}
	
	static void prn(int x, int y){
		
		System.out.println(x +"+"+ y);
	}
	
	public static void main(String[] args) {
		
		prn(10,20,30);
		prn(10,20);
		
	}
	
	
}
