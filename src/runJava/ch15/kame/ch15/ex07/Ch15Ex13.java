package runJava.ch15.kame.ch15.ex07;

import java.util.StringTokenizer;


//***************StringTokenizer 이용해보기*************
public class Ch15Ex13 {

	// StringTokenizer 이용해보기
	public static void main(String[] args) {
		
		StringTokenizer stok01= new StringTokenizer("사과,바나나,딸기,귤", ",");
		// String 사과,바나나,딸기,귤을 콤마로 분리한다. default일 경우 공백으로 구분
		while(stok01.hasMoreTokens()){
			// 토큰이 있으면
			System.out.println(stok01.nextToken());
			// 토큰을 얻어온다.
		}
		
	}
	
}
