package javaEight.fupgm.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Ex03_01 을 Predicate<T>를 이용해서 구현해보세요.
public class Ex03_02 {
	
	public static <T> List<T> filter(List<T> numberList, Predicate<T> predicate){
		List<T> result = new ArrayList<T>();
		for (T num : numberList) {
			if(predicate.test(num)) {
				result.add(num);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(-4, -3, -2, -1, 0, 1, 2, 3);
		List<Integer> resultLsit = new ArrayList<Integer>();
		List<Integer> resultLsit2 = new ArrayList<Integer>();
		
//		Predicate<Integer> predicate = t -> t >= 0;
//		Predicate<Integer> predicate2 = t -> t <= -2;
		
		//filter 메소드는 상단에 선언되어 있습니다.
		System.out.println(filter(numberList, t -> t >= 0));
		System.out.println(filter(numberList, t -> t <= -2));

//		소스 이해를 돕기위한 풀어쓴 내용
//		Predicate<Integer> predicate = new Predicate<Integer>() {
//			
//			@Override
//			public boolean test(Integer t) {
//				if(t >= 0) {
//					return true;
//				}else {
//					return false;
//				}
//			}
//		};
//		
//		Predicate<Integer> predicate2 = new Predicate<Integer>() {
//			
//			@Override
//			public boolean test(Integer t) {
//				if(t <= -2) {
//					return true;
//				}else {
//					return false;
//				}
//			}
//		};
//		
//		for (Integer num : numberList) {
//			if(predicate.test(num)) {
//				resultLsit.add(num);
//			}
//			
//			if(predicate2.test(num)) {
//				resultLsit2.add(num);
//			}
//		}
//		
//		System.out.println(resultLsit);
//		System.out.println(resultLsit2);
	}

}
