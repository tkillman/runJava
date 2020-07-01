package runJava.ch16;

import java.util.ArrayList;


//////////////****************** for(자료형 접근 변수명 : 배열이나 컬렉션 변수명)***************
public class Ch16Ex10 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("오렌지");
		list.add("바나나");
		
		for(String element: list){
			
			System.out.print(element+"\t");
		}
		
	}

}
