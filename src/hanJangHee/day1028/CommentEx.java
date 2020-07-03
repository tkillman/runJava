package hanJangHee.day1028;

class CommentEx {
 
	 public static void main(String[] args){
	
		 /*exit:	
	for(int i = 0 ; i  < 3 ; i++){
		for(int j = 0 ; j  < 5 ; j++){
			if(j==3) break exit;
			System.out.println("i값:" + i + ",j값:" + j);
		}
	}

	
	
	for(int i = 0 ; i < 10 ; i++){
		 if(!(i%4 == 0)){
			 continue;
		 }
		 System.out.println("i값:"+i);
		 
	}
	
	*/
	
		 label:
			 for(int i = 0 ; i < 5 ; i++){
				 for(int j = 0 ; j <5; j++){
					 if(j==3)
						 continue label;
					 System.out.println("i값 :" +i+ ", j값:" + j);
					 
				 }
			 }
		 
		 
		 
		 
		 
}	
}
