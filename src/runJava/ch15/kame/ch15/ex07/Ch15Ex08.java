package runJava.ch15.kame.ch15.ex07;


///// ********** new 연산자를 사용해서 Sring 객체를 만든 경우********
// 데이터 값이 같더라도 새로운 인스턴스가 생성된다.

public class Ch15Ex08 {


///////// *********** new 연산자를 사용해서 인스턴스를 생성한 경우
	public static void main(String[] args) {
		
		String str1= new String("해피 바이러스");
		String str2= new String("해피 바이러스");
		
		if(str1==str2){
			System.out.println("str1과 str2가 동일 인스턴스를 참조");
			
		} else {System.out.println("str1과 str2가 다른 인스턴스를 참조");}
		
	}

}
