package runJava.ch16;

import java.util.Enumeration;
import java.util.Hashtable;


////////////******************* HashMap ********************
// Ű�� ���� �ִ�.
// enumeration�� ���� ������ ����.


public class Ch16Ex09 {
	
	public static void main(String[] args) {
		Hashtable<String, String> ht= new Hashtable<String, String>();
		
		ht.put("ȫ�浿", "010-111-1111");
		ht.put("������", "010-222-2222");
		ht.put("�Ѽ���", "010-333-3333");
		
		String Val= (String) ht.get("�Ѽ���");
		if(Val !=null){
			System.out.println("�Ѽ��� -->" +Val);
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
