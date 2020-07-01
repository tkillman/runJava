package runJava.ch05;

public class Ch05Ex07 {

	//////// ******* 무한루프*********/////
	public static void main(String[] args) {
		int i = 0;
		while (true) {
			i++;
			System.out.print(i + " ");
			if (i > 10) {
				break;
			}

		}

	}

}
