package runJava.ch20.thisisjava_19;

import java.nio.ByteBuffer;


//**** CompactExample **
//compact() �޼ҵ� -- ���� ���� �����͸� 0 �ε������� ����


public class CompactExample {
	
	public static void main(String[] args) {
		System.out.println("7 ����Ʈ ũ��� ���� ���� ");
		ByteBuffer buffer = ByteBuffer.allocateDirect(7);
		
		
		buffer.put((byte)10);
		buffer.put((byte)11);
		buffer.put((byte)12);
		buffer.put((byte)13);
		buffer.put((byte)14);
		buffer.flip(); //�����͸� �б� ���� ��ġ �Ӽ��� ���� , limit �� ����
		
		
		System.out.println("3����Ʈ�� ����");
		buffer.get(new byte[3]);
		printState(buffer);
		
		
		System.out.println("compact() ���� �� "); // ���� ���� �����ʹ� 0 �ε������� ����
		buffer.compact();
		printState(buffer); 
		
		
		
		
	} //���� �޼ҵ� ����
	
	public static void printState(ByteBuffer buffer){ // ByteBuffer���� get �޼ҵ� ��� ����
		
		System.out.print(buffer.get(0) +", ");
		System.out.print(buffer.get(1) +", ");
		System.out.print(buffer.get(2) +", ");
		System.out.print(buffer.get(3) +", ");
		System.out.println(buffer.get(4) +", ");
		System.out.print("position : " + buffer.position() + ",");
		System.out.print("limit : " + buffer.limit() + ",");
		System.out.println("capacity : " + buffer.capacity() );
		
		
		
	}
	
	
	
	

}
