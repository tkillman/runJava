package runJava.ch16;

import java.util.Vector;


//////////////************** Vector Ŭ����*****************

public class Ch16Ex05 {
	
	public static void main(String[] args) {
		
		Vector<String> vec= new Vector<String>(4,3);
		// ���� 4�� �����ϰ� �þ�� �� �ʿ伺�� ����� �ִ�ġ�� 3��ŭ ���ؼ� �þ��.
		
		
		System.out.println("���Ϳ� ����� ����� ���� :" + vec.size());
		System.out.println("������ �뷮 :" + vec.capacity() +"\n");
		// ����� ������ 0�� ,���� �뷮  4 
		
		vec.add("���");
		vec.add("����");
		vec.add("��");
		vec.add("����");
		vec.add("����");
		
		System.out.println(">>>get �޼ҵ�� ��� ���<<<<");
		for(int i=0; i<vec.size();i++){
			
			System.out.print(vec.get(i) +"\t");
		}	System.out.println("\n");
		
		System.out.println("���Ϳ� ����� ����� ���� :" + vec.size());
		System.out.println("������ �뷮 :" + vec.capacity() +"\n");
		// �뷮�� 4���µ� 5���� ��Ұ� �����鼭 ���Ͱ� �ڵ������� �뷮�� �÷Ȱ� 
		// �÷����� �뷮���� 3�� ���� ��ŭ �÷��� 4+3 = 7 �� �Ǿ���.
		
		
		
		
		System.out.println(">>>Vector�� �뷮�� ���� ũ��� ����<<<<<<<<");
		vec.trimToSize();
		//�뷮�� ����ġ�� ����.
		
		System.out.println("���Ϳ� ����� ����� ���� :" +vec.size());
		System.out.println("������ �뷮 " +vec.capacity());
		
		
		
	}
}
