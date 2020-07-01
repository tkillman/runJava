package runJava.ch15.kame.ch15.ex04;


////************* Object 클래스의 equals() 메소드 **************
/// *** == : 같은 인스턴스를 참조하는가??
/// *** equals : 데이터의 값이 같은가??
// ** 대부분 equals 메소드를 오버라이딩해서 재 정의해서 쓴다.
public class Ch15Ex04 {

	public static void main(String[] args) {
		
		int a=10;
		int b=10;
		
		if(a==b){
			System.out.println("a와 b는 같다");
			
		} else {System.out.println("a와 b는 다르다");}
		
		System.out.println(">>>>String 객체 이해<<<<<<<<");
		String str1= new String("hello");
		String str2= new String("hello");
		
		if (str1==str2){
			System.out.println("str1과 str2가 참조하는 인스턴스는 같다.");
			
		} else {System.out.println("str1과 str2가 참조하는 인스턴스는 다르다.");}
		
		System.out.println(">>>>>>인스턴스가 가지고 있는 데이터의 비교<<<<<<<<<<<<");
		if(str1.equals(str2)){
			//String 클래스에 object 클래스의 equals 메소드를  사용하고 있다.
			System.out.println("str1과 str이 담고있는 내용은 같다.");
		} else {System.out.println("str1과 str이 담고있는 내용은 다르다.");}
		
		
		
	}
	
	
}
