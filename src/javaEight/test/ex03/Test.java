package javaEight.test.ex03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		List<TTVO> ttvoList = new ArrayList<>();
		
		TTVO ttv01 = new TTVO();
		ttv01.setId(1);
		ttv01.setName("김동규");
		
		TTVO ttv02 = new TTVO();
		ttv02.setId(2);
		ttv02.setName("김동규");
		
		TTVO ttv03 = new TTVO();
		ttv03.setId(3);
		ttv03.setName("김가원");
		
		TTVO ttv04 = new TTVO();
		ttv04.setId(4);
		ttv04.setName("홍길동");
		ttvoList.add(ttv01);
		ttvoList.add(ttv02);
		ttvoList.add(ttv03);
		ttvoList.add(ttv04);
		
		
		
		String str = ttvoList.stream().map(vo -> vo.getName()).collect(Collectors.joining(","));
		
		
		
		List tt = ttvoList.stream().collect(Collectors.groupingBy(TTVO::getName)).entrySet().stream().collect(Collectors.toList());
		
		String str2 = ttvoList.stream().collect(Collectors.groupingBy(TTVO::getName)).keySet()
																						.stream()
																						.map(value -> ("\'"+value+"\'"))
																						.collect(Collectors.joining(","));
										
					
		System.out.println(str2);
		
	}
}
