package hanJangHee.day1028;

class SwitchEx {

	public static void main(String[] args){
		
		int month = Integer.parseInt(args[0]);
		String res;
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			res = "31";
			break;
		case 4 : case 6 : case 9 : case 11:
			res = "30";
			break;
		case 2 : res = "29";
		    break;
		default:
			res = "몰라";
 		}
		
		System.out.println(month + "월은" + res + "일입니다.");
		
		
	}
	
}
