package runJava.ch16;

import java.util.Stack;

///////////******************** Stack ****************

public class Ch16Ex07 {

		// LIFO : ���߿� �� ���� ���� ������
		public static void main(String[] args) {
		
			Stack<String> myStack = new Stack<String>();
			
			myStack.push("���");
			myStack.push("�ٳ���");
			myStack.push("��");
			myStack.push("Ű��");
			
			while(!myStack.isEmpty()){
				System.out.println(myStack.pop());
			}
			
			
	}
}
