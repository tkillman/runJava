package hanJangHee.day1114;

import java.util.Vector;

class VectorEx2 {
	
	public static void main(String[] args){
		Vector<Double> v =  new Vector<Double>(2,5);
		
		v.add(100.3);
		v.add(3.14);
		v.addElement(1000.);
		for(Double n : v)
		  System.out.println(n);
		
		double search = 1000.0;
		int index = v.indexOf(search);
		if(index != -1)
			System.out.println("�˻���� "+search+"�� ��ġ :"+index);
		else
			System.out.println("�˻���� "+search+"�� �����ϴ�.");
		
		System.out.println(":::::::���� �� �뷮/ũ�� Ȯ��:::::::");
		System.out.println("capacity : "+v.capacity ());
		System.out.println("size : "+v.size ());
		
		double del = 3.14;
		if(v.contains(del)){
			v.remove(del);
			System.out.println(del+"���� �Ϸ�!");
		}
		
		System.out.println(":::::::���� �� �뷮/ũ�� Ȯ��:::::::");
		System.out.println("capacity : "+v.capacity ());
		System.out.println("size : "+v.size ());
		
		v.trimToSize();
		System.out.println(":::::�뷮���� �� �뷮/ũ�� Ȯ��:::::");
		System.out.println("capacity : "+v.capacity ());
		System.out.println("size : "+v.size ());

	}

}
