package javaEight.fupgm.ex07;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex07_02 {
	
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(
			numberList.stream()
						.filter(number -> number >= 3 && number <= 9)
						.map(number -> number * 2)
						.filter(number -> number > 10)
						.findFirst()
		);
		
		
	}
}
