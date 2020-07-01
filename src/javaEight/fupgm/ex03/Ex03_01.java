package javaEight.fupgm.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//문제 :
// List<Integer> numberList 에 -4, -3, -2, -1, 0, 1, 2, 3 을 넣고
// List<Integer> resultList 에 0 이상의 숫자만 넣어서 출력해보세요.
// List<Integer> resultList2 에 -2이하의 숫자만 넣어서 출력해보세요.

public class Ex03_01 {
	//명령형 프로그래밍
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(-4, -3, -2, -1, 0, 1, 2, 3);
		List<Integer> resultLsit = new ArrayList<Integer>();
		List<Integer> resultLsit2 = new ArrayList<Integer>();
		
		for (Integer num : numberList) {
			if(num >= 0) {
				resultLsit.add(num);
			}
			
			if(num <= -2) {
				resultLsit2.add(num);
			}
		}
		
		System.out.println(resultLsit);
		System.out.println(resultLsit2);
	}
}
