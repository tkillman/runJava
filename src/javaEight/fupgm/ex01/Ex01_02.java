package javaEight.fupgm.ex01;

import java.util.function.Function;

public class Ex01_02 {
	
	// Ex01_01의 내용을 interface Fuction<T,R> 를 사용해서 구현해보세요.
	
	public static void main(String[] args) {
		//함수형 프로그래밍
		Function<String, Integer> toInt = value -> Integer.parseInt(value);
		System.out.println(toInt.apply("37"));
		
//		역컴파일러가 없다면 Help --> Eclipse Marketplace에서 decompile 이라고 검색 한 뒤 Enhanced Class Decompiler를 설치해주자.
//		 java8부터 interface 내부에 abstract 메소드를 선언할 수 있다.
//		
//		 아래 주석은 위의 코드를 이해하기 위해 풀어쓴 내용이다
//		 interface인 Function을 인스턴스로 만들기 위해서 내부 메소드를 override해서 구현해주었다.
//		 람다식을 사용하기 위해서는 interface 내부에 선언된 interface용 메소드는 한개여야 한다. apply

//		소스 이해를 돕기위한 풀어쓴 내용
//		Function<String, Integer> toInt = new Function<String, Integer>() {
//
//			@Override
//			public Integer apply(String value) {
//				
//				return Integer.parseInt(value);
//			}
//			
//		};
	}
}
