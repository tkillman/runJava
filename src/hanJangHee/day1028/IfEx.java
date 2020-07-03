package hanJangHee.day1028;

class IfEx {

	public static void main(String[] args){
		
	// if(조건식){조건식의 결과가 true일 경우 실행할 수행문;}
    // 수행문이 하나일 경우, 블럭을 지울 수 있다.
		
	/*	int su1 = 40;
		String str=""; //빈문자열로 초기화
		
		if(su1 >= 50){
			str = "50이상";
			} else{
				str ="50미만";
			}
		
		System.out.println(str);
	
		
		
		int su1 = Integer.parseInt(args[0]);
		String str;
		
		if(su1>=41){str= "고급";}
		else if(su1>=10){str="중급";}
		else{str="초급";}
		
		System.out.println(str);
		
		
		
		String data = args[0];
		String res;
		
		if(data.equals("포도")){
			 res = "맛있다.";
		} else if(data.equals("수박")){
			res = "시원하다.";
		} else if(data.equals("딸기")){
			res = "달다";
		} else{res="기타";
		}
		
		*/
		
		
		 int jumsu = Integer.parseInt(args[0]);
		 String res;
		 
		 if(jumsu >= 90 && jumsu <= 100){
			 res = "A";
		      if(jumsu<=93){res+="-";}
		      else if(jumsu>=98){res+="+";}
		     res+="학점";
		 }
	
		
		 else if(jumsu >= 80 && jumsu <90){
			 res = "B학점";}
		 else if(jumsu >=70 && jumsu <80){
			 res = "C학점";}
		 else if(jumsu >=60 && jumsu <70){
			 res = "D학점";}
		 else if(jumsu >=50 && jumsu <60){
			 res = "E학점";}
		 else{
			 res = "죽어라 F";
		 }
		
		 System.out.println(res);
		 
		
		
		
		
		
	}
}
