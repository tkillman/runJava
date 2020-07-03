package hanJangHee.day1111;

class GenericEx1Main {
	
	public static void main(String[] args){
		GenericEx1<String> t = new GenericEx1<String>();
		
		String[] ss= {"¾Ö", "¾Æ", "¼­"};
		t.set(ss);
		t.print();
		
		GenericEx1 t1 = new GenericEx1();
		Integer[] s = {1,2,3};
		t1.set(s);
		t1.print();
	}

}


class GenericEx1<T>{
	
	T[] v;
	
	public void set(T[] n){
		v = n;
	}
	public void print(){
		for(T s : v)
	      System.out.println(s);
	}
}
