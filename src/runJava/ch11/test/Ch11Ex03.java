package runJava.ch11.test;
import runJava.ch11.kame.ch11.ex02.*;

///************* ���۷��� �����迭***************
//Shape s_arr= new Shape(); 
//Shape Ŭ������ ���۷��� ������ s_arr���� , ShapeŬ������ �ν��Ͻ��� �Ҵ��� ��ü�� ����.
// int[] a = new int[5];
//	a ={1,2,3,4,5};
//a[0] =1 , a[1]=2 , a[2]=3 ....	

public class Ch11Ex03 {
	
	public static void main(String[] args) {
		
		Shape[] s_arr =new Shape[3]; // Ŭ������ ��� 3���� ���� �迭�� ����
		
		s_arr[0] = new Circle(); // ���۷��� �迭�� �ν��Ͻ��� �Ҵ�
		s_arr[1] = new Rectangle(); 
		s_arr[2] = new Triangle();
		
		
		for(int i=0; i<s_arr.length;i++){
			
			System.out.println("������ ������"+s_arr[i].area());
		}
	}
	
}
