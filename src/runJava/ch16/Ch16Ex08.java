package runJava.ch16;

import java.util.LinkedList;

////////////// *******************LinkedList*********************
public class Ch16Ex08 {
	// FIFO : ���� �� ���� ���� ������
	public static void main(String[] args) {
		
		LinkedList<String> myQue = new LinkedList<String>();
		myQue.offer("���");
		myQue.offer("�ٳ���");
		myQue.offer("��");
		myQue.offer("Ű��");
		
		while(myQue.peek()!=null){
			
			System.out.println(myQue.poll());
		}
		
	}

}
