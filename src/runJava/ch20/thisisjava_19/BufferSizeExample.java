package runJava.ch20.thisisjava_19;

import java.nio.ByteBuffer;



///********** BufferSizeExample *****************
//** �ʹ��̷�Ʈ ���� : ������� - allocate() ,��� �޸� ������ JVM      
// ** ���̷�Ʈ ���� : �������- allcateDirect() , ��� �޸� ������ �ü�� , ���� ũ�Ⱑ ũ�� ����� ������ ����.







public class BufferSizeExample {

	public static void main(String[] args) {

		ByteBuffer directBuffer = ByteBuffer.allocateDirect(200 * 1024 * 1024);

		System.out.println("���̷�Ʈ ���۰� �����Ǿ����ϴ�.");
		
		
		//�� ���̷�Ʈ�� ������ ����.
		ByteBuffer nonDirectBuffer = ByteBuffer.allocate(200*1024*1024);
		System.out.println("�� ���̷�Ʈ ������ �����Ǿ����ϴ�.");
		
	}

}
