package runJava.ch08;


////////////************************* static ���� **********************
///////////   Ch08Ex04.java �� �Բ� �� ��
public class Account {
	
	int count;
	static int total;
	
	Account(int amount){ //�Ű������� ���� ������
		
		count+= amount;
		total+=amount;
		
	}

	static void showTotal(){ //���� �޼ҵ�
		System.out.println("total :" +total );
		//System.out.println("count :" +count);
		 // ���� �޼ҵ忡���� �ν��Ͻ� ������ ������ �� ����.
		
	}
	
}
