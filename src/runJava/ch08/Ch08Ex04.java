package runJava.ch08;



///////////*******Static ���� ����(���� �޼ҵ�)*************
// Ŭ������.�޼ҵ� ȣ�� ���� --> Ŭ������ ���� �����ؾ� �� �޼ҵ��� ���
// ���� �޼ҵ忡���� this��  �ν��Ͻ� ������ ����� �� ����.


public class Ch08Ex04 {

	public static void main(String[] args) {
		
		Account.showTotal(); 

		Account acc01 = new Account(10);
		Account.showTotal();
		acc01.showTotal();

		Account acc02 = new Account(20);
		Account.showTotal();
		acc02.showTotal();
		
	}

}
