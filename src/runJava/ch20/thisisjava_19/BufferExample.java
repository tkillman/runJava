package runJava.ch20.thisisjava_19;

import java.nio.Buffer;
import java.nio.ByteBuffer;


///******** BufferExample *********
//Buffer�� ��ġ �Ӽ�
//position -- ���� �аų� ���� ��ġ �� ,0���� ���� limit���� Ŀ�� �� ����.
//limit -- ���ۿ��� �аų� �� �� �ִ� ��ġ�� �Ѱ� capacity���� �۰ų� ���� ��
//capacity -- ������ �ִ� ������ ����
//mark -- reset() �޼ҵ� ����� ���ƿ��� ��ġ�� �����ϴ� �ε���, mark() �޼ҵ�� ���� ����

//flip() �޼ҵ� -- position�� 0���� ������ limit�� position��ġ�� ������.

public class BufferExample {
	
	public static void main(String[] args) {
		
		System.out.println("7 ����Ʈ ũ��� ����  ����");
		ByteBuffer buffer = ByteBuffer.allocateDirect(7);
		
		printState(buffer);
		
		buffer.put((byte)10);
		buffer.put((byte)11);
	
		System.out.println("2����Ʈ ���� ��");
		printState(buffer);
		
		buffer.put((byte)12);
		buffer.put((byte)13);
		buffer.put((byte)14);
		
		System.out.println("3����Ʈ ���� ��");
		printState(buffer);
		
		
		buffer.flip();
		System.out.println("flip ���� ��");
		printState(buffer);
		
		
		
		
		System.out.println("3����Ʈ�� ���� ��"); //����� �б�
		buffer.get(new byte[3]);
		printState(buffer);
		
		
		System.out.println("----------���� ��ġ�� ��ũ �� ����");
		buffer.mark();
		printState(buffer);
		
		System.out.println("2����Ʈ�� ���� ��"); //����� �б�
		buffer.get(new byte[2]);
		printState(buffer);
		
		
		
		System.out.println("- position�� ��ũ ��ġ�� �ű�.");
		buffer.reset();
		printState(buffer);
		
		System.out.println("rewind()�� ���� ��");
		buffer.rewind();
		printState(buffer);
		
		
		System.out.println("clear()�� ���� ��");
		buffer.clear();
		printState(buffer);
		
		
		
	} //���� �޼ҵ� ����
	
	
	
	public static void printState(Buffer buffer){
		
		System.out.print("\tposition :" + buffer.position() +",");
		System.out.print("\tlimit :" + buffer.limit() +" , ");
		System.out.println("\tcapacity : " + buffer.capacity());
		
	}
	
	
	

}

