package javaEight.fupgm.ex11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex11_01 {

	public static void main(String[] args) {
//		Integer reducedParams = Stream.of(1, 2, 3)
//				  .reduce(10, // identity
//				          Integer::sum, // accumulator
//				          (a, b) -> {
//				            System.out.println("combiner was called");
//				            return a + b;
//				          });
		
//		System.out.println(reducedParams);
		
		Integer reducedParallel = Arrays.asList(1, 2, 3)
				  .parallelStream()
				  .reduce(10,
				          Integer::sum,
				          (a, b) -> {
				            System.out.println("combiner was called");
				            return a + b;
				          });
		
		//Stream.of(new Ex11VO(1,1,1), new Ex11VO(2,1,3), new Ex11VO(4,2,3), new Ex11VO(5,2,1));
		Map<String, Object> map1 = new HashMap<>();
		map1.put("score1", 1);
		map1.put("score2", 4);
		map1.put("score3", 2);
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("score1", 11);
		map2.put("score2", 4);
		map2.put("score3", 2);
		
		List<Map<String, Object>> mapList = new ArrayList<>();
		mapList.add(map1); mapList.add(map2);
 		
//		mapList.stream().map(vo -> (int)vo.get("score1"))
//						.reduce(0, (a, b) -> {return a + b;});
		
		Double d = mapList.stream().mapToInt(vo -> (int)vo.get("score1")).average().getAsDouble();
		int sumInt = mapList.stream().mapToInt(vo -> (int)vo.get("score1")).sum();
		
		System.out.println("d :: " + d);
		System.out.println("sumInt :: " + sumInt);
		
		Map<String, Double> average = mapList.stream()
			    .flatMap(map -> map.entrySet().stream())
			    .filter(vo -> vo.getKey().equals("score1") || vo.getKey().equals("score2"))
			    .collect(Collectors.groupingBy(Map.Entry::getKey,  Collectors.averagingInt(value -> (Integer) value.getValue())));
		System.out.println(average);  // {A=3.0, B=4.333333333333333}
		
		Map<Object, Object> haha = mapList.stream()
			    .flatMap(map -> map.entrySet().stream())
			    .filter(vo -> vo.getKey().equals("score1") || vo.getKey().equals("score2"))
			    .collect(Collectors.groupingBy(Map.Entry::getKey,  Collectors.reducing(0, Map.Entry::getValue, (a,b) -> (Integer)a + (Integer)b)));
		
		System.out.println(haha);
//		System.out.println(sumValue);  // {A=3.0, B=4.333333333333333}
	}
}
