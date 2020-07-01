package javaEight.fupgm.ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1. List<Integer> numberList에 1,2,3,4,5,6,7,8,9,10 을 넣는다.

// 2. numberList에서 3이상 9이하 작은 수를 찾는다.

// 3. 찾은 수를 2배씩 곱한다.

// 4. 2배씩 곱한 수 중 10보다 커지는 수를 리턴한다.

public class Ex07_01 {
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		for (Integer number : numberList) {
			if(number >= 3 && number <=9) {
				if(number * 2 > 10) {
					System.out.println("number :: " + number);
					break;
				}
			}
		}	
	}
}
