package runJava.ch15.kame.ch15.ex04;


////************* Object Ŭ������ equals() �޼ҵ� **************
/// *** == : ���� �ν��Ͻ��� �����ϴ°�??
/// *** equals : �������� ���� ������??
// ** ��κ� equals �޼ҵ带 �������̵��ؼ� �� �����ؼ� ����.
public class Ch15Ex04 {

	public static void main(String[] args) {
		
		int a=10;
		int b=10;
		
		if(a==b){
			System.out.println("a�� b�� ����");
			
		} else {System.out.println("a�� b�� �ٸ���");}
		
		System.out.println(">>>>String ��ü ����<<<<<<<<");
		String str1= new String("hello");
		String str2= new String("hello");
		
		if (str1==str2){
			System.out.println("str1�� str2�� �����ϴ� �ν��Ͻ��� ����.");
			
		} else {System.out.println("str1�� str2�� �����ϴ� �ν��Ͻ��� �ٸ���.");}
		
		System.out.println(">>>>>>�ν��Ͻ��� ������ �ִ� �������� ��<<<<<<<<<<<<");
		if(str1.equals(str2)){
			//String Ŭ������ object Ŭ������ equals �޼ҵ带  ����ϰ� �ִ�.
			System.out.println("str1�� str�� ����ִ� ������ ����.");
		} else {System.out.println("str1�� str�� ����ִ� ������ �ٸ���.");}
		
		
		
	}
	
	
}
