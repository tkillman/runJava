package hanJangHee.day1115;

import java.util.Arrays;

class ArraysEx3 {
	
	public static void main(String[] args){
		
		int[] ar1 = {20,4,12,1,5};
		
		Arrays.sort(ar1);
		for(int n : ar1)
			System.out.println(n+",");
	}

}
