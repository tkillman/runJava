package runJava.ch16;

import java.util.HashSet;
import java.util.Iterator;

/*자료구조

1.Collection 1_1.List(순서) 1_1_1. LinkedList(링크)
 순서나 집합적인		  		   1_1_2. Stack(스택형)
 저장공간					   1_1_3. Vector (동기화)
 						   1_1_4. ArrayList(동기화 안 됨)
 
 
			 1_2. Set(집합)    1_2_1. HashSet

2.Map		 2_1.Hashtable
키와 값		 2_2.HashMap
			 2_3.SortedMap*/


/* 컬렉션 클래스의 주요 메소드
 * int size() 요소가 몇개 들어있는지를 반환
 * boolean isEmpty() 컬렉션이 비어 있었는지를 반환
 * boolean add(Object element)요소 추가 성공 시 true 반환 
 * boolean remove(Object element) 요소 삭제 성공 시 true 반환
 * boolean removeall(Collection other) 요소 전체 삭제
 * boolean contains(Object obj) 해당객체가 컬렉션 클래스에 포함되어 있으면 true 아니면 false
 * iterator iteratior() iterator 인터페이스를 얻어냄
 * Object[] toArray() 컬렉션에 들어있는 요소를 객체 배열로 바꿈.
 * 
 * */


/////**************** HashSet 과 iterator **************
// 특징 : 자료에 순서가 없다.
public class Ch16Ex01 {
	
	public static void main(String[] args) {
		
		HashSet<String> set= new HashSet<String>();
		// HashSet에는 String 형태만 저장 가능하다.
		// HashSet은 중복을 무시한다.
		// HashSet은 순서를 무시한다.
		// 집합과 비슷하다고 생각하면 편하다.
		
		set.add("사과");
		set.add("바나나");
		set.add("귤");
		set.add("오렌지");
		set.add("바나나"); // 바나나는 이미 있기 때문에 HashSet에 들어가지 않는다.
	    System.out.println("요소의 개수: "+set.size());
	    
	    Iterator elements = set.iterator();
	    while(elements.hasNext()){
	    	System.out.println(elements.next());
	    	
	    }
	    
	    
	}
	
	
	
	

}
