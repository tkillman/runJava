package javaEight.test.ex01;

import java.util.Objects;
import java.util.function.Function;

public class Ex01_01_test {
	
	public static void main(String[] args) {
		
		String value = "37";
		System.out.println(Integer.parseInt(value));
		
		Function<String, Integer> toInt = str -> Integer.parseInt(str);
		Function<String, String> toString = str -> str;
		
		Function<Long, String> tolong = longNum -> String.valueOf(longNum);
		
		Function<String, Integer> toInt2 = toInt.compose(toString);
		
		
		Function<String, Long> tolong3 = str -> Long.parseLong(str);

		
		Function<Long, String> tolong2 = new Function<Long, String>() {
			
			@Override
			public String apply(Long t) {
				// TODO Auto-generated method stub
				return String.valueOf(t);
			}

			@Override
			public <V> Function<V, String> compose(Function<? super V, ? extends Long> before) {
				// TODO Auto-generated method stub
				System.out.println("tolong2");
				return Function.super.compose(before);
			}
		};
		
		
		tolong2.compose(tolong3).apply("37");
		
		
	}
}
