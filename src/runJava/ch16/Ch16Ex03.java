package runJava.ch16;

import java.util.ArrayList;
import java.util.Iterator;


////////***************ArrayList*****************//


public class Ch16Ex03 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		list.add("사과");
		list.add("수박");
		list.add("귤");
		list.add("딸기");
		list.add("수박"); // ArrayList 의 add(String str) 메소드
		prn(list);
		
		
		//add(int a, String str) 메소드
		System.out.println(">>>>>>>>>>>인덱스 2인 위치에 키위 삽입<<<<<<<<");
		list.add(2,"키위");
		prn(list);
		
		
		//set(int a, String str) 메소드
		System.out.println(">>>>>>>> 인덱스 4인 위치에 데이터를 포도로 변경<<<<<<<<<<<");
		list.set(4, "포도"); 
		prn(list);
		
		
		//remove(String str) 메소드
		System.out.println(">>>>>>>>> 사과란 데이터를 찾아서 제거<<<<<<<<<<<<<");
		list.remove("사과");
		prn(list);
		
	}
		
		static void prn(ArrayList<String> list){
			
			
			for(int i=0;i<list.size();i++){
				
				System.out.print(list.get(i) +"\t");
				
			}
				System.out.println();
			}
			
		}
		

