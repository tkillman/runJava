package javaEight.blog.cre;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02 {
	public static void main(String[] args) {
		//컬렉션 스트림
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> stream = list.stream();
		
		Stream<String> parallelStream = list.parallelStream();
		
		//비어있는 스트림
		Stream emptyStream = Stream.empty();
		
	}
}
