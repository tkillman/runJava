package runJava.ch14.thisisjava_12;

public class Index {

	//*******StateMain ,StateThread,TargetThread �����*****
	////�������� ���¸� Ȯ���ϴ� ���.
	

	//*****SumThread,JoinExample***
	//join�� ���� join�� ȣ����!!!!! �����尡 �����°� �ȴ�.
	

/////***** ThreadA,ThreadB,WorkObject,WaitNotifyExample ���***********
//1.notify()��? �Ͻ��������� �ٸ� �����带 ���� ��� ���·� �����.
//2.wait()��? �ڽ��� �����带 �Ͻ� ���� ���·� �����. �ٸ� �����尡 notify�� Ǯ����� ������ ���°� �ȴ�.
//3.��� ���
//����ȭ �� �޼ҵ峪 ������ ��� �����ϴ�.
//4. ��� ����
//� �����ڰ� ���� ���� �� ���� �� ���� ���� �� �Ŀ� �Һ��ڰ� �� ���� ����ϰ�
//�� ���� �����ڰ� �ٽ� ���� �����ϵ��� ������ְ� ���� ��
	
	
	
	//***ProducerThread,ConsumerThread,DataBox,WaitNotifyExample2******////////
	//wait() �ڽ��� �����带 �Ͻô�� ���·� �����. notify() �Ͻô�� ������ �����带 ������ ���·� �����.
	
	
	
	//****PrintThread1 ,StopFlagExample ******
	//�������� stop() �޼ҵ带 ������� �ʰ� ������Ű�� ���
	//Thread�� ����� Ŭ������ boolean ������ ������ �ΰ� ���� ������ boolean ���¸� �־�д�.
	//�����带 ���߰� ������ boolean ���¸� true�� �༭  ���ѷ����� �����Ų��.
	
	
	
	//****PrintThread2,InterruptExample**********
	//���� interrupt() �޼ҵ�� �Ͻ����� ���¿� �ִ� �����忡 ���ܸ� �߻����Ѽ� ������Ű�µ�
	//�����尡 �Ͻ����� ���°� ���ٸ� ��� �����带 ������ų��?
	//boolean state = Thread.interrupt() ���� �޼ҵ� �Ǵ� isinterrupted() �� �̿��Ѵ�.
	//Thread ���� �޼ҵ��� interrupt()�� interrupt �޼ҵ尡 ȣ��Ǹ� true�� ��ȯ�Ѵ�.
	//�̸� run�޼ҵ忡�� �ݺ������� ����Ǵ� �ڵ� �ȿ� �־��ָ� �ݺ����� �������� �� �ִ�.

		
////******* AutoSaveThread, DaemonExample ****////
//setDaemon �޼ҵ� ���� �� �� �޼ҵ带 �θ� �����忡 �������� �� �����尡 ������� �ٸ� �����嵵 ���� ������.
	

	/// ********* ThreadInfoExample , AutoSaveThread *******************
	// Thread�� �׷� ���¸� ���� ���.
	
	
	//****** WorkThread, ThreadGroupExample , 
	// ������ �׷��� �����ؼ� �ѹ��� ���� ���..
	

	///************* ExecuteExample
	//������ Ǯ�� ����� ����� ������ Ǯ�� ���� ���¹�**********///////
	//1. ExecutorService �������̽��� Executors ���� �޼ҵ� nexFixedThreadPool�� ���.
	
	///********** NoResultExample , ���ϰ��� ���� �۾� �Ϸ� �뺸 ***********////
	
	
	///********* ResultByCallableExample , ���ϰ��� �����ϴ� �۾� �Ϸ� �뺸*********////////
	// 1. Callable ����
	// 2. ExecutorService�� submit �� ���� Future�� ����
	// 3. Future ��ü�� get() �޼ҵ�� �޴´�.


	//******** ResultByRunnableExample , �۾� ó�� ����� �ܺ� ��ü�� ���� *********////////
	// ****** 1. ������Ǯ ����
	// ****   2.������ ��ü Ŭ���� ���� 
	// *** 3. ������ �۾��� ������ Ŭ���� �����ϰ� ���� ��ü�� �����ڿ��� �޴´�.
	//*** 4. ������ �۾��� ������Ǯ�� �־ �����ϰ� ������� �޴´�.
	// ***

	
	//***********CompletionServiceExample ****************/////
	// *** �۾� �Ϸ� ������ �뺸�ޱ�  ****///////////////////////
	// *** 1.executorService ��ü ����
	// *** 2. CompletionService ��ü ����
	// *** 3. ó���� �� �۾��� CompletionService���� �����ϰ�
	// ** 4. ����� ����� executorService���� �޾Ƽ� �����Ѵ�.
	

	// * CallbackExample , �ݹ� ����� �۾� �Ϸ� �뺸 �ޱ�

	
	
	
	
	
	
}
