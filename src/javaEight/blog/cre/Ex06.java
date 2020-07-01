package javaEight.blog.cre;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		// 기본 타입형 스트림
		IntStream intStream = IntStream.range(1, 5);
		
		LongStream longStream = LongStream.rangeClosed(1, 5);
		
		Stream<Integer> boxedIntStream = IntStream.range(1, 3).boxed();
		
		DoubleStream doubles = new Random().doubles(3);
		
		//문자열 스트링
		Stream<String> stringStream = Pattern.compile(", ").splitAsStream("Eric, Elena, JAVA");
		
		//파일 스트림
		Stream<String> lineStream = Files.lines(Paths.get("file.txt"),Charset.forName("UTF-8"));
		
	}
}
