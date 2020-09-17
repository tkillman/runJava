package javaEight.blog.cre;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex01 {
	public static void main(String[] args) {
		//stream
		String[] arr = new String[] {"a","b","c"};
		
		Stream<String> stream = Arrays.stream(arr);
		
		Stream<String> streamOfArrayPart =
				Arrays.stream(arr, 1,3);
	}
}
