package runJava.ch16;

import java.util.ArrayList;
import java.util.Iterator;


////////***************ArrayList*****************//


public class Ch16Ex03 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		list.add("���");
		list.add("����");
		list.add("��");
		list.add("����");
		list.add("����"); // ArrayList �� add(String str) �޼ҵ�
		prn(list);
		
		
		//add(int a, String str) �޼ҵ�
		System.out.println(">>>>>>>>>>>�ε��� 2�� ��ġ�� Ű�� ����<<<<<<<<");
		list.add(2,"Ű��");
		prn(list);
		
		
		//set(int a, String str) �޼ҵ�
		System.out.println(">>>>>>>> �ε��� 4�� ��ġ�� �����͸� ������ ����<<<<<<<<<<<");
		list.set(4, "����"); 
		prn(list);
		
		
		//remove(String str) �޼ҵ�
		System.out.println(">>>>>>>>> ����� �����͸� ã�Ƽ� ����<<<<<<<<<<<<<");
		list.remove("���");
		prn(list);
		
	}
		
		static void prn(ArrayList<String> list){
			
			
			for(int i=0;i<list.size();i++){
				
				System.out.print(list.get(i) +"\t");
				
			}
				System.out.println();
			}
			
		}
		

