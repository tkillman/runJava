package runJava.ch20.thisisjava_19;

public class Index {
	
	/*
	 * NIO ���� : 1.ä�ι�� 2. ���� 3. �񵿱��� 4.���ŷ/�ͺ��ŷ �Ѵ� ���� 
	 * 		   : ��� ����? ���� Ŭ���̾�Ʈ�� ���� ���۵Ǵ� �뷮�� ���� ����� �۾��� ���� ������ ���
	 * 
	 */
	/////***************** PathExample**********************//
	// Path�� IO��� File Ŭ������ ���� , get()�޼ҵ带 ���� ��ü�� ���� �� �ִ�.
	
	///*********** FileSystemExample *****************
	// �ü���� ���� �ý����� ������ ���� �� �ִ� FileSystem Ŭ����~getDefault() �޼ҵ带 ���� ������ü ����
	
	//********* FileExample *****************
	// ������ �Ӽ��� ���� �� �ִ� Files Ŭ����
	
	//************* DirectoryExample 
	// ���丮�� ������ �����ϰ� ���丮�� ������ ����ϴ� ����
	
	//**************** WathchServiceExample*****************
	// WatchService �������̽��� newWatchService()�޼ҵ带 ���� ������ü�� ���� �� �ִ�.


	///********** BufferSizeExample *****************
	//** �ʹ��̷�Ʈ ���� : ������� - allocate() ,��� �޸� ������ JVM      
	// ** ���̷�Ʈ ���� : �������- allcateDirect() , ��� �޸� ������ �ü�� , ���� ũ�Ⱑ ũ�� ����� ������ ����.
	
	//********* DirectBufferCapacityExample 
	//���̷�Ʈ ���� ���� �뷮 Ȯ��
	
	
	///************** ComputerByteOrderExample
	// ���� ����Ʈ���� ó�� Big endian , ���� ����Ʈ���� ó�� Little endian
	
	///******** BufferExample *********
	//Buffer�� ��ġ �Ӽ�
	//position -- ���� �аų� ���� ��ġ �� ,0���� ���� limit���� Ŀ�� �� ����.
	//limit -- ���ۿ��� �аų� �� �� �ִ� ��ġ�� �Ѱ� capacity���� �۰ų� ���� ��
	//capacity -- ������ �ִ� ������ ����
	//mark -- reset() �޼ҵ� ����� ���ƿ��� ��ġ�� �����ϴ� �ε���, mark() �޼ҵ�� ���� ����

	//flip() �޼ҵ� -- position�� 0���� ������ limit�� position��ġ�� ������.
	

	//**** CompactExample **
	//compact() �޼ҵ� -- ���� ���� �����͸� 0 �ε������� ����
	
	

	//********* ByteBufferToStringExample *******
	// ByteBuffer <-> String ���ڵ�, ���ڵ�
	
	//*********ByteBufferToIntBufferExample
	// ByteBuffer<-> IntBuffer
	// int[] �迭�� warp() �޼ҵ� ȣ���ؼ� IntBuffer ��ü ���� ����
	//IntBuffer��  ByteBuffer�� putInt() �޼ҵ带 ���� ���� ����
	// ByteBuffer�� �޼ҵ� asIntBuffer()�� IntBuffer ��ü ���� ����.
	
	// ** FileChannelWriteExample
	// FileChannel�� ���� �޼ҵ��� open�� ���ؼ� ��ü ���� ����.
	//���Ͽ� �����͸� ���� write() �޼ҵ� , int�� ��ȯ
	

	//*****************FileChannelReadExample
	//���� �о����
	
	// ********* FileCopyExample ************
	// Channel�� �ΰ� ���ÿ� ��� ���ʿ����� �Է¸� �ް� �ٸ� �ʿ����� ��¸� ����ϸ� ���簡 �ȴ�.

	
	///***************FilesCopyMEthodExample
	////********* Files�� copy �޼ҵ带 ���� ����
	
	
	//////************ AsynchronousFileChannelWriteExample	
	//FileChannel�� read()�� write() �޼ҵ�� ���ŷ�� �Ǳ� ������ �̸� �ذ��ϱ� ���� ä��
	//�񵿱�� ���� ���� �� ����
	//write(���� ��ü,���� �ε���,÷�� ��ü, �ݹ� �޼ҵ带 ���� ��ü)

	
	
	
	
	
}


