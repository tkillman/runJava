package runJava.ch18.ex05;

////************************** ���� Ŭ���� �����ϱ�*****************/////////////////

class OuterClass{
	String str="���� ���̷���";
	class InnerClass{
		void print(){
			System.out.println(str);
		}
		
	}
	
}

public class Ch18Ex05 {

		public static void main(String[] args) {
			OuterClass outObj = new OuterClass();
			OuterClass.InnerClass inObj = outObj.new InnerClass();
			inObj.print();
		}
}
