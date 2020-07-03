package hanJangHee.day1111;

class MemberInner {
	 int a = 10;
	 private int b = 100;
	 static int c = 200;
	 
	 class Inner{
		 public void printData(){
			 System.out.println("inta : "+a);
			 System.out.println("private intb : " + b);
			 System.out.println("static intc : " +c);
		 }
	 }
	 
	 public static void main(String[] args){
		 
		 MemberInner.Inner inner = new MemberInner().new Inner();
		 inner.printData();
	 }

}
