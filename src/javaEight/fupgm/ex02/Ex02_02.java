package javaEight.fupgm.ex02;

import java.util.function.Consumer;

//Ex02_01를 Consumer<T>를 사용해서 구현해보세요.

public class Ex02_02 {
	public static void main(String[] args) {
		
		Consumer<String> p = value -> System.out.println("hello " + value);
		p.accept("world");
		
		//Consumer는 T를 받아서 아무것도 리턴하지 않는다.

//		소스 이해를 돕기위한 풀어쓴 내용
//		Consumer<String> p = new Consumer<String>() {
//			
//			@Override
//			public void accept(String value) {
//				System.out.println("hello " + value);
//			}
//		};
		
		
	}
}
