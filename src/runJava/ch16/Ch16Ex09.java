package runJava.ch16;

import java.util.Enumeration;
import java.util.Hashtable;


////////////******************* HashMap ********************
// 키와 값이 있다.
// enumeration을 통해 값들을 얻어낸다.


public class Ch16Ex09 {
	
	public static void main(String[] args) {
		Hashtable<String, String> ht= new Hashtable<String, String>();
		
		ht.put("홍길동", "010-111-1111");
		ht.put("성춘향", "010-222-2222");
		ht.put("한석봉", "010-333-3333");
		
		String Val= (String) ht.get("한석봉");
		if(Val !=null){
			System.out.println("한석봉 -->" +Val);
		}
		
		System.out.println("\n");
		Enumeration<String> Enum= ht.keys();
		while(Enum.hasMoreElements()){
			String k= Enum.nextElement();
			String v= ht.get(k);
			System.out.println(k+":"+v);
		}
	
	
	}
	

}
