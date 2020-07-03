package hanJangHee.day1114;

import java.util.*;

class IteratorEx1 {
	
	public static void main(String[] args){
		Vector<String> v = new Vector<String>(2,5);
		
		v.add("a");
		v.add("b");
		v.add("c");
		System.out.println("∫§≈Õ≈©±‚ :" + v.size());
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			it.remove();
		}
		
		
		System.out.println("∫§≈Õ≈©±‚:" + v.size());
		System.out.println(v);
		
	}
	
	

}
