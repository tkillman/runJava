package runJava.ch05;

public class Ch05Ex05 {

	
//////////****레이블을 사용한 반복문 빠져나오기*******/////	
	public static void main(String[] args) {
		int cnt;
		int i;

		for (cnt = 1; cnt < 5; cnt++) {
			for (i = 1; i < 10; i++) {
				if (i % 3 == 0) {
					break;
				}
				System.out.print(" " + i);
			}
			System.out.println();
		}

		System.out.println("\n break에 레이블 지정하기");

		exit_for: for (cnt = 1; cnt <= 5; cnt++) {
			for (i = 1; i < 10; i++) {
				if (i % 3 == 0) {
					break exit_for;
				}
				System.out.print(" " + i);
			}
		}
	}

}// 메인 메소드 종료
