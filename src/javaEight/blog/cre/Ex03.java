package javaEight.blog.cre;

import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		//Stream.builder()
		Stream<String> builderStream = Stream.<String>builder().add("Eric").build();	
	}
}
