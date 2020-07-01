package runJava.ch18.ex05;

////************************** 내부 클래스 설계하기*****************/////////////////

class OuterClass{
	String str="해피 바이러스";
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
