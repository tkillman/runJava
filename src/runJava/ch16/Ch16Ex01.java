package runJava.ch16;

import java.util.HashSet;
import java.util.Iterator;

/*�ڷᱸ��

1.Collection 1_1.List(����) 1_1_1. LinkedList(��ũ)
 ������ ��������		  		   1_1_2. Stack(������)
 �������					   1_1_3. Vector (����ȭ)
 						   1_1_4. ArrayList(����ȭ �� ��)
 
 
			 1_2. Set(����)    1_2_1. HashSet

2.Map		 2_1.Hashtable
Ű�� ��		 2_2.HashMap
			 2_3.SortedMap*/


/* �÷��� Ŭ������ �ֿ� �޼ҵ�
 * int size() ��Ұ� � ����ִ����� ��ȯ
 * boolean isEmpty() �÷����� ��� �־������� ��ȯ
 * boolean add(Object element)��� �߰� ���� �� true ��ȯ 
 * boolean remove(Object element) ��� ���� ���� �� true ��ȯ
 * boolean removeall(Collection other) ��� ��ü ����
 * boolean contains(Object obj) �ش簴ü�� �÷��� Ŭ������ ���ԵǾ� ������ true �ƴϸ� false
 * iterator iteratior() iterator �������̽��� ��
 * Object[] toArray() �÷��ǿ� ����ִ� ��Ҹ� ��ü �迭�� �ٲ�.
 * 
 * */


/////**************** HashSet �� iterator **************
// Ư¡ : �ڷῡ ������ ����.
public class Ch16Ex01 {
	
	public static void main(String[] args) {
		
		HashSet<String> set= new HashSet<String>();
		// HashSet���� String ���¸� ���� �����ϴ�.
		// HashSet�� �ߺ��� �����Ѵ�.
		// HashSet�� ������ �����Ѵ�.
		// ���հ� ����ϴٰ� �����ϸ� ���ϴ�.
		
		set.add("���");
		set.add("�ٳ���");
		set.add("��");
		set.add("������");
		set.add("�ٳ���"); // �ٳ����� �̹� �ֱ� ������ HashSet�� ���� �ʴ´�.
	    System.out.println("����� ����: "+set.size());
	    
	    Iterator elements = set.iterator();
	    while(elements.hasNext()){
	    	System.out.println(elements.next());
	    	
	    }
	    
	    
	}
	
	
	
	

}
