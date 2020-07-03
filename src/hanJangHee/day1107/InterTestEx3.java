package hanJangHee.day1107;

import java.util.Scanner;

interface Say{
	public void Hello();
}

class Korean implements Say{
	public void Hello(){
		System.out.println("¾È³ç");
	}
}

class English implements Say{
	public void Hello(){
		System.out.println("Hello");
	}
}

class Etc implements Say{
	public void Hello(){
		System.out.println("Hi~~~");
	}
}
public class InterTestEx3 {
	public static void main(String[] args){
		Korean k = new Korean();
		English e = new English();
		Etc et = new Etc();
		
		Say s;
		String lang = new Scanner(System.in).next();
		
		if(lang.equals("e")){
			s = e;}
		else if(lang.equals("k")){
			s=k;
		}
		else{
			s=et;
		}
		s.Hello();
	}
}
	


