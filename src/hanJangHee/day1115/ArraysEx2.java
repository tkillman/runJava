package hanJangHee.day1115;

import java.util.Arrays;

class ArraysEx2 {
	
	public static void main(String[] args){
		String[] ar1 = {"fill()","in","the","Arrays"};
		String[] ar2 = {"fill()","in","","Arrays"};
		
		if(!Arrays.equals(ar1, ar2))
			System.out.println("�� Array�� �ٸ��ϴ�.");
		System.out.println("------------------------------");

		Arrays.fill(ar2, 2,3,"the");
		if(!Arrays.equals(ar1, ar2))
			System.out.println("�� Array�� �ٸ��ϴ�.");
		else
			System.out.println("�� Array�� �����ϴ�.");
	}

}
