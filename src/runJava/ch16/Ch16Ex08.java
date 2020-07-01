package runJava.ch16;

import java.util.LinkedList;

////////////// *******************LinkedList*********************
public class Ch16Ex08 {
	// FIFO : 먼저 들어간 놈이 먼저 나오기
	public static void main(String[] args) {
		
		LinkedList<String> myQue = new LinkedList<String>();
		myQue.offer("사과");
		myQue.offer("바나나");
		myQue.offer("귤");
		myQue.offer("키위");
		
		while(myQue.peek()!=null){
			
			System.out.println(myQue.poll());
		}
		
	}

}
