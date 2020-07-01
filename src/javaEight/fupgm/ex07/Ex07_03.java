package javaEight.fupgm.ex07;

import java.util.Arrays;
import java.util.List;
import java.util.Map;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex07_03 {
	
	public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//List 형태로 반환받기 Collectors.toList()
		List<Integer> resultList = numberList.stream().filter(i -> i > 3)
										.collect(Collectors.toList());
		
		System.out.println(resultList.toString());
		
		
		//Collectors.joining('구분자', '앞에 prefix', '뒤에 suffix')
		String result = resultList.stream()
					.map(i -> String.valueOf(i))
					.collect(Collectors.joining(",", "[[", "]]"));
		
		resultList.stream().collect(Collectors.toList());
		System.out.println(result);
	}
}
