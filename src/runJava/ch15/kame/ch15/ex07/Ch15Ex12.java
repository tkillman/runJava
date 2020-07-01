package runJava.ch15.kame.ch15.ex07;


//**************StringBuffer 클래스의 다양한 메소드들 ************
public class Ch15Ex12 {

	public static void main(String[] args) {
		StringBuffer str= new StringBuffer(
				"누구든지 사랑하기 위해선 증오의 가슴이어야 했다.");
		
		System.out.println(str);
		
		//StringBuffer 클래스의 insert 메소드
		//누구든지 사랑하기 위해선 ==>14번째
		str.insert(14, "한 번쯤 ");
		System.out.println(str);
		
		
		//delete 메소드 0번째부터 1번째 전까지 삭제
		str.delete(0, 1);
		System.out.println(str);
		
		
		//deleteCharAt 구든지 사랑하기 0,1,2,3,4,5,6,7
		str.deleteCharAt(7);
		System.out.println(str);
		
		// 뒤집기
		str.reverse();
		System.out.println(str);
		
	}
	
}
