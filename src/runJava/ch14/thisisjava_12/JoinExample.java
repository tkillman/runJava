package runJava.ch14.thisisjava_12;

//*****SumThread,JoinExample***
//join�� ���� join�� ȣ����!!!!! �����尡 �����°� �ȴ�.



public class JoinExample {
	
	public static void main(String[] args) {
		
		SumThread st = new SumThread();
		st.start();
		
		try {
			st.join(); // st �����尡 ���� ������ join�޼ҵ带 ȣ���� ������(������ ����)�� �����°� �ȴ�.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(st.num);
		// st�� ���� ������ ��ٷ��� ����� 5050�� ����� ���´�.
		//���� join�� ���ٸ� st�� 1~100���� ���ϴ� ���� �߰��� ����� ���� �����´�.
	}

}
