package runJava.ch16;

import java.util.Enumeration;
import java.util.Vector;


////////************* Vector의 요소값을 찾는 Enumeration***********////

public class Ch16Ex06 {
	
	public static void main(String[] args) {
		
		Vector<String> vec= new Vector<String>();
		vec.add("사과");
		vec.add("수박");
		vec.add("귤");
		vec.add("딸기");
		vec.add("수박");
		
		//벡터 요소들에 대한 Enumeration 객체를 반환
		Enumeration element= vec.elements();
		
		while(element.hasMoreElements()){
				System.out.println(element.nextElement());
		}
		
	}
	

}
