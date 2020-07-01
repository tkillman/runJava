package runJava.ch16;

import java.util.ArrayList;


///////************* ArraList의 메소드 *************

public class Ch16Ex04 {
	
	
		// ArrayList의 indexOf(String str) 메소드
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("사과");
		list.add("수박");
		list.add("귤");
		list.add("딸기");
		list.add("수박");
		
		int idx;
		
		idx= list.indexOf("수박");
		System.out.println(">>첫 번째 수박의 위치:" +idx);
		
		idx= list.lastIndexOf("수박");
		System.out.println(">>마지막 수박의 위치 :" +idx);
		
		idx= list.indexOf("바나나");
		System.out.println(">>바나나의 위치 :"+ idx);
		
		
	}
	

}
