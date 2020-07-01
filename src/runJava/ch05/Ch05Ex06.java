package runJava.ch05;

public class Ch05Ex06 {

	/////**********continue 사용법************///
	//continue는 continue 이후의 코드를 실행하지 않고 반복문으로 돌아간다.
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");

		for (int i = 1; i <= 10; i++) {

			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
