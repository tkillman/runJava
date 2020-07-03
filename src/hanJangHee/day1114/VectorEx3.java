package hanJangHee.day1114;

import java.util.Vector;

class VectorEx3 {
	
	public static void main(String[] args){
		
		Vector<Double> v = new Vector<Double>(2,5);
		
		v.add(100.3);
		v.add(3.14);
		v.addElement(1000.);
		
		int size = v.size();
		Double[] data = new Double[size];
		v.copyInto(data);
	
		for(double n : data)
			System.out.println(n);
	}

}
