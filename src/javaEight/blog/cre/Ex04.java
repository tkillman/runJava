package javaEight.blog.cre;

import java.util.stream.Stream;

public class Ex04 {
	public static void main(String[] args) {
		
		//Stream.generate()
		
		Stream<String> geneatedStream
			= Stream.generate(()->"gen").limit(5);
	}
}
