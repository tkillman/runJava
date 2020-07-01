package runJava.ch14.thisisjava_12;


//***ProducerThread,ConsumerThread,DataBox,WaitNotifyExample2******////////
//wait() �ڽ��� �����带 �Ͻô�� ���·� �����. notify() �Ͻô�� ������ �����带 ������ ���·� �����.

public class DataBox {

	String data;

	public synchronized String getData() {
//wait�� notify�� ���� ���ؼ��� synchronized (����ȭ )�� �޼ҵ带 ����Ѵ�.
		if (data == null) {
			

			try {
				wait(); // �����Ͱ� ���ٸ� ConsumerThread�� �Ͻ��������·� �����.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String resultValue = data;
		data =null;
		notify(); // data�� null�� �����Ƿ� ProducerThread�� ������ ���·� �����.
		System.out.println("Consumer�� ���� ������ : "+ resultValue);
		return resultValue;

	}

	public synchronized void setData(String data) {

		if (this.data != null) {
		
			try {
				wait();// �����Ͱ� ���� �����Ƿ� ProducerThread�� �����·�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		this.data = data; //�����Ͱ� ���ٸ� �����͸� �����Ѵ�.
		System.out.println("Producer�� ������ ������ : " +data);
		notify(); // �����͸� ���������Ƿ� ConsumerThread�� ��������·� �����.
	}

}
