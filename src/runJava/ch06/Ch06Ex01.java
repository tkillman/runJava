package runJava.ch06;

//////////// **************** 배열 선언*******************
//*** 일일이 변수명을 지정하지 않아도 동일한 데이터의 값들을 저장하기 편하게 만들어준다.

public class Ch06Ex01 {

	public static void main(String[] args) {
		int[] a = new int[5];

		a[0] = 0;
		a[1] = 50;
		a[2] = 100;
		a[3] = 150;
		a[4] = 200;

		for (int i = 0; i < 5; i++) {
			System.out.println("a[" + i + "] :" + a[i]);
		}
	}

}
