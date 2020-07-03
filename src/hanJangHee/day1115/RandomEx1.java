package hanJangHee.day1115;

import java.util.Random;

class RandomEx1 {
	public static void main(String[] args){
		String[] lesson = {"Java Beg", "JSP", "XML&Java", "ELB"};
		Random r1 = new Random();
		
		int index = r1.nextInt(4);
        System.out.println("선택과목 :" + lesson[index]);
	
	}
	

}
