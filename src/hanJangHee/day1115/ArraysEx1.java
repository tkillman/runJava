package hanJangHee.day1115;

import java.util.Arrays;

class ArraysEx1 {
	
	public static void main(String[] args){
		String[] ar = {"fill()","in","the","Arrays"};
		
		Arrays.fill(ar, "SunAe");
		for(String n : ar)
			System.out.println(n+",");
		
		System.out.println("\n---------------------");
		Arrays.fill(ar, 1,3,"¢¾");
		for(String n : ar)
			System.out.println(n+",");
	}

}
