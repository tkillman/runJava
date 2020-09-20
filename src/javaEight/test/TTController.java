package javaEight.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class TTController {
	
	public static void main(String[] args) {
		
		Stream<String> strStream = Stream.of("a", "b", "c", "d");

		List<String> hah = strStream.collect(()-> new ArrayList<String>(), (t, u) -> t.add(u), (t, u) -> t.removeAll(u));
		
		System.out.println(hah);
		
		List<String> kList = Arrays.asList("k"); 
		hah.addAll(kList);
		System.out.println(hah);
	}
	
	public static <T> T ttTClassReturn(T value) {
		
		return value;
	}
}
