package hanJangHee.day1110;

class CloneEx2 {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		
		int[] arrClone = (int[])arr.clone();
		arrClone[0]=6;
		
		System.out.println();
	}

}
