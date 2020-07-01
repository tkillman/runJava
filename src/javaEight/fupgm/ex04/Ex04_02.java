package javaEight.fupgm.ex04;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

//Ex04_01 를 똑같이 구현하는데 
//public static void check(boolean b, Supplier<String> supplier) 를 사용해서 시간을 단축시켜 주세요.

public class Ex04_02 {
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

//		소스 이해를 돕기위한 내용
//		Supplier<String> supplier =new Supplier<String>() {
//			
//			@Override
//			public String get() {
//				return getName();
//			}
//		};
		
		check(true,() -> getName());
		check(false,() -> getName());
		check(true,() -> getName());
		
		System.out.println((System.currentTimeMillis() - start) / 1000 + "seconds");
	}
	
	public static String getName() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "김동규";
	}
	
	public static void check(boolean b, Supplier<String> supplier) {
		if(b) {
			System.out.println(supplier.get());
		} 
	}
}
