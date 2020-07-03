package hanJangHee.day1031;

class Arrayex1 {

	public static void main(String[] args) {

		/*
		 * String[] arr; arr = new String[3];
		 * 
		 * String[] arr1 = {"J", "A", "T"};
		 * 
		 * 
		 * for(int i = 0; i < arr1.length ; i++) System.out.println(arr1[i]);
		 * 
		 * 
		 * 
		 * String[] arr;
		 * 
		 * if(args.length>0){ arr = args; for(int i = 0 ; i < arr.length ;i++)
		 * System.out.println("arr[" +i+ "]:" + arr[i]); }else{
		 * System.out.println("args의 내용이 없습니다."); }
		 * 
		 * 
		 * 
		 * System.out.println("인수의 개수:" + args.length); for(int i = 0 ;i <
		 * args.length ; i++){ System.out.println("args[" +i+ "]=\"" +args[i] +
		 * "\""); }
		 * 
		 * 
		

		int[][] test;
		test = new int[2][3];
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;

		test[1][0] = 500;
		test[1][1] = 600;
		test[1][2] = 700;

		for (int i = 0; i < test.length; i++)
			for (int j = 0; j < test[i].length; j++) {
				System.out.println("test[" + i + "][" + j + "]=" + test[i][j]);
			}



	
		int[] t1 = {1,100};
		int[] t2 = {20,200,2000,20000};
		
		int[][] test = new int[2][];
		test[0]=t1;
		test[1]=t2;
		
		for(int i = 0 ; i <  test.length ; i++){
			for(int j = 0 ; j <  test[i].length; j++)
				System.out.println("test["+i+"]["+j+"]:"+test[i][j]);
			
		}
		
		
		
		byte ar1[] = {11,22,33,44,55};
		byte ar2[] = new byte[10];
		
		System.arraycopy(ar1,0,ar2,3,5);
		System.out.println(":::::원본배열:::::");
		
	 for(byte n : ar1)
		 System.out.print(n+" ");
	 System.out.println();
	 
	System.out.println(":::::복사본배열:::::");
	 for(byte n : ar2)
		 System.out.print(n+" ");
		
		

	 
		byte[] ar1 = {11,22,33,44,55};
		byte[] ar2 = new byte[10];
		
		System.arraycopy(ar1, 0, ar2, 3, 5);
		
		
		System.out.println(":::::원본배열:::::");
		 for(byte n : ar1)
			 System.out.print(n+" ");
		 
		 System.out.println( );
		 
		 System.out.println(":::::복사본배열:::::");
		  for(byte n : ar2)
			  System.out.print(n+" ");
		  
	
		
		
		int sum = 0;
		float average = 0f;
		
		int[] score = {100,88,100,100,90};
		 for(int i = 0 ; i < score.length; i++){
			 sum+= score[i];
		 }
		
		 average = sum / (float)score.length;
		 
		 System.out.println("총점:"+sum);
		 System.out.println("평균:"+average);
		
		 
		
		int[] score = {79,88,91,33,100,55,95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i =1; i < score.length; i++){
		 if(score[i]>max){
			 max = score[i];
		 }
		 if(score[i]<min){
			 min = score[i];
		 }}
	System.out.println("최대값:"+max);
		 System.out.println("최소값:"+min);
		 
	*/
		
		
		int[] number = new int[10];
		for(int i = 0 ; i < number.length ; i++){
			number[i]= i;
					System.out.print(number[i]);
			System.out.println();}
		for(int i = 0 ; i <100; i++){
			 int n = (int)(Math.random()*10);
			 
			 int temp = number[0];
			 number[0]=number[n];
			 number[n]=temp;
		}
		
		for(int i = 0 ; i < number.length; i++){
			System.out.print(number[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		
	}
}
