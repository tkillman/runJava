package runJava.ch15.kame.ch15.ex07;


//*********** String class의 특이점 *******
public class Ch15Ex09 {
	
	public static void main(String[] args) {
		String str1=new String("해피 바이러스");
		System.out.println(str1.replace("바이러스", "썬데이"));
		//String 클래스의 replace 메소드에 의해 변화된 값
		
		System.out.println(str1);
		// 하지만 String 클래스의 객체는 불변의 성격이 있어서 변하지 않았다.
		
	}

}
