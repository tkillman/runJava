package runJava.ch16;

import java.util.ArrayList;


///////************* ArraList�� �޼ҵ� *************

public class Ch16Ex04 {
	
	
		// ArrayList�� indexOf(String str) �޼ҵ�
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("���");
		list.add("����");
		list.add("��");
		list.add("����");
		list.add("����");
		
		int idx;
		
		idx= list.indexOf("����");
		System.out.println(">>ù ��° ������ ��ġ:" +idx);
		
		idx= list.lastIndexOf("����");
		System.out.println(">>������ ������ ��ġ :" +idx);
		
		idx= list.indexOf("�ٳ���");
		System.out.println(">>�ٳ����� ��ġ :"+ idx);
		
		
	}
	

}
