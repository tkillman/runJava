package runJava.ch08;


////////////************************* static 변수 **********************
///////////   Ch08Ex04.java 와 함께 볼 것
public class Account {
	
	int count;
	static int total;
	
	Account(int amount){ //매개변수를 갖는 생성자
		
		count+= amount;
		total+=amount;
		
	}

	static void showTotal(){ //정적 메소드
		System.out.println("total :" +total );
		//System.out.println("count :" +count);
		 // 정적 메소드에서는 인스턴스 변수에 접근할 수 없다.
		
	}
	
}
