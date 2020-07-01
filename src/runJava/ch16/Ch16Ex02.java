package runJava.ch16;

import java.util.ArrayList;
import java.util.Iterator;



////////***************ArrayList와 iterator******************//
// 특징 : 자료 순서가 상관이 있다, 중복 허용, 자동적으로 배열의 크기를 늘린다.

public class Ch16Ex02 {

	public static void main(String[] args) {
		
		// ArrayList의 특징 : 중복을 허용, 데잍터가 들어간 순서가 상관이 있다.
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("오렌지");
		list.add("바나나"); // list는 중복을 허용하기 때문에 list의 데이터에 들어간다.
		
		System.out.println("list의 요소 개수 : "+list.size());
		
		
		System.out.println(">>>>>>Iterator 객체로 요소 얻기<<<<<<<<<");
		
		Iterator<String> elements = list.iterator();
		
		while(elements.hasNext()){
			
			System.out.print(elements.next() +"\t");
			
		}
		
		System.out.println();
		
		System.out.println(">>>>>>>>>>get 메소드로 요소 얻기<<<<<<<<");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"\t");
		}
		
	}
		
	
}
