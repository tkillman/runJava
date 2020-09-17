package javaEight.fupgm.ex09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex09_02 {
	public static void main(String[] args) {
		
		List<TTVO> ttvoList = new ArrayList<>();
		
		TTVO ttv01 = new TTVO();
		ttv01.setId(1);
		ttv01.setName("김동규");
		ttv01.setScore(5);
		
		TTVO ttv02 = new TTVO();
		ttv02.setId(2);
		ttv02.setName("김동규");
		ttv02.setScore(15);
		
		TTVO ttv03 = new TTVO();
		ttv03.setId(3);
		ttv03.setName("김가원");
		ttv03.setScore(25);
		
		TTVO ttv04 = new TTVO();
		ttv04.setId(4);
		ttv04.setName("홍길동");
		ttv04.setScore(35);
		
		ttvoList.add(ttv01);
		ttvoList.add(ttv02);
		ttvoList.add(ttv03);
		ttvoList.add(ttv04);
		
		String str = ttvoList.stream().collect(Collectors.groupingBy(TTVO::getName))
														.keySet()
														.stream()
														.map(value -> ("'"+value+"'"))
														.collect(Collectors.joining(","));
		
		System.out.println(str);
		
		
		
	}
}
