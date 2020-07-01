package runJava.ch16;

import java.util.ArrayList;
import java.util.Iterator;



////////***************ArrayList�� iterator******************//
// Ư¡ : �ڷ� ������ ����� �ִ�, �ߺ� ���, �ڵ������� �迭�� ũ�⸦ �ø���.

public class Ch16Ex02 {

	public static void main(String[] args) {
		
		// ArrayList�� Ư¡ : �ߺ��� ���, �����Ͱ� �� ������ ����� �ִ�.
		ArrayList<String> list = new ArrayList<String>();
		list.add("���");
		list.add("�ٳ���");
		list.add("��");
		list.add("������");
		list.add("�ٳ���"); // list�� �ߺ��� ����ϱ� ������ list�� �����Ϳ� ����.
		
		System.out.println("list�� ��� ���� : "+list.size());
		
		
		System.out.println(">>>>>>Iterator ��ü�� ��� ���<<<<<<<<<");
		
		Iterator<String> elements = list.iterator();
		
		while(elements.hasNext()){
			
			System.out.print(elements.next() +"\t");
			
		}
		
		System.out.println();
		
		System.out.println(">>>>>>>>>>get �޼ҵ�� ��� ���<<<<<<<<");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"\t");
		}
		
	}
		
	
}
