package runJava.ch16;

import java.util.Enumeration;
import java.util.Vector;


////////************* Vector�� ��Ұ��� ã�� Enumeration***********////

public class Ch16Ex06 {
	
	public static void main(String[] args) {
		
		Vector<String> vec= new Vector<String>();
		vec.add("���");
		vec.add("����");
		vec.add("��");
		vec.add("����");
		vec.add("����");
		
		//���� ��ҵ鿡 ���� Enumeration ��ü�� ��ȯ
		Enumeration element= vec.elements();
		
		while(element.hasMoreElements()){
				System.out.println(element.nextElement());
		}
		
	}
	

}
