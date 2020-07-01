package runJava.ch11.test;
import runJava.ch11.kame.ch11.ex02.*;

///************* 래퍼런스 변수배열***************
//Shape s_arr= new Shape(); 
//Shape 클래스의 래퍼런스 변수로 s_arr선언 , Shape클래스에 인스턴스를 할당해 객체를 만듬.
// int[] a = new int[5];
//	a ={1,2,3,4,5};
//a[0] =1 , a[1]=2 , a[2]=3 ....	

public class Ch11Ex03 {
	
	public static void main(String[] args) {
		
		Shape[] s_arr =new Shape[3]; // 클래스로 요소 3개를 갖는 배열을 선언
		
		s_arr[0] = new Circle(); // 래퍼런스 배열에 인스턴스를 할당
		s_arr[1] = new Rectangle(); 
		s_arr[2] = new Triangle();
		
		
		for(int i=0; i<s_arr.length;i++){
			
			System.out.println("도형의 면적은"+s_arr[i].area());
		}
	}
	
}
