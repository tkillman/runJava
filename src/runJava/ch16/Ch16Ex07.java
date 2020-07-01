package runJava.ch16;

import java.util.Stack;

///////////******************** Stack ****************

public class Ch16Ex07 {

		// LIFO : 나중에 들어간 놈이 먼저 나오기
		public static void main(String[] args) {
		
			Stack<String> myStack = new Stack<String>();
			
			myStack.push("사과");
			myStack.push("바나나");
			myStack.push("귤");
			myStack.push("키위");
			
			while(!myStack.isEmpty()){
				System.out.println(myStack.pop());
			}
			
			
	}
}
