package runJava.ch14.thisisjava_12;

//*****SumThread,JoinExample***
//join을 쓰면 join을 호출한!!!!! 쓰레드가 대기상태가 된다.



public class JoinExample {
	
	public static void main(String[] args) {
		
		SumThread st = new SumThread();
		st.start();
		
		try {
			st.join(); // st 쓰레드가 끝날 때까지 join메소드를 호출한 쓰레드(지금은 메인)가 대기상태가 된다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(st.num);
		// st가 끝날 때까지 기다려서 결과값 5050이 제대로 나온다.
		//만약 join이 없다면 st가 1~100까지 더하는 도중 중간에 계산한 값을 가져온다.
	}

}
