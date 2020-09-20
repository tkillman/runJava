package javaEight.fupgm.ex14;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex14_01 {
	public static void main(String[] args) {
		
		
		Stream<String> st = Stream.of("a","B","c");
		
		
		st.filter(str -> str.equals("B"))
			.peek(str -> System.out.println(str))
			.collect(Collectors.toList());
	}
}
