package javaEight.blog.cre;

import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		
		Stream<Integer> iteratedStream
			= Stream.iterate(30, n -> n + 2).limit(5);
	}
}
