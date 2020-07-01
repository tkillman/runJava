package javaEight.fupgm.ex08;

import java.util.function.Function;

public class Ex08_01 {
	
	public static void main(String[] args) {
		Function<Function<Integer, String>, String> f = g -> g.apply(10);
		f.apply(i -> "#" + i);
	}
}
