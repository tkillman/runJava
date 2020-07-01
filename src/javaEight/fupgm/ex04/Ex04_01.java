package javaEight.fupgm.ex04;

import java.util.concurrent.TimeUnit;

//문제
//1. public static String getName() 메소드를 정의해서 "김동규" 를 반환하는데 한번 수행할 때 3초가 걸리도록 해주세요. java.util.concurrent.TimeUnit.SECONDS.sleep(3) 사용
//2. main 메소드 시작전에 long start = System.currentTimeMillis(); 정의해주세요.
//3. main 메소드 마지막에 System.out.println((System.currentTimeMillis() - start) / 1000 + "seconds"); 넣어주세요.
//4. public static void check(boolean b, String name) 메소드를 정의해서 b가 true일때만 System.out.println(name); 해주세요.
//5. main 메소드에서 check 메소드를 3번 수행하는데 boolean b는 원하는 내용을 name은 getName()을 넣어서 수행해주세요.


public class Ex04_01 {
	
	//명령형 프로그래밍
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		check(true,getName());
		check(false,getName());
		check(true,getName());
		
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
	
	public static void check(boolean b, String name) {
		if(b) {
			System.out.println(name);
		} 
	}
}
