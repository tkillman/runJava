package runJava.ch04;

public class Ch04Ex03 {
	
/*	switch 사용문 
 * , 점수 100점은 학점A,점수 90점 이상은 학점B,80점 이상은 학점C를 주도록 코딩*/
	
	public static void main(String[] args) {
		
		int score = 94;
		
		switch (score/10) { //정수로 인식된다.
		case 10:
			System.out.println("100점 입니다.");
			break;

		case 9:
			System.out.println("90점 이상입니다");
			break;
		case 8:
			System.out.println("80점 이상입니다");
			break;
		case 7:
			System.out.println("70점 이상입니다");
			break;
		case 6:
			System.out.println("60점 이상입니다");
			break;
		case 5:
			System.out.println("50점 이상입니다");
			break;
		case 4:
			System.out.println("40점 이상입니다");
			break;
		case 3:
			System.out.println("30점 이상입니다");
			break;
		default:
			System.out.println("공부좀 하세요");
			break;
		}
	}
	
	

}
