package javaEight.fupgm.ex11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

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
		map1.put("score2", 10);
		map1.put("score3", 1);
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("score1", 11);
		map2.put("score2", 14);
		map2.put("score3", 2);
		
		List<Map<String, Object>> mapList = new ArrayList<>();
		mapList.add(map1); mapList.add(map2);
 		
//		mapList.stream().map(vo -> (int)vo.get("score1"))
//						.reduce(0, (a, b) -> {return a + b;});
		
		Double d = mapList.stream().mapToInt(vo -> (int)vo.get("score1")).average().getAsDouble();
		int sumInt = mapList.stream().mapToInt(vo -> (int)vo.get("score1")).sum();
		
		System.out.println("d :: " + d);
		System.out.println("sumInt :: " + sumInt);
		
//		Map<String, Double> average = mapList.stream()
//			    .flatMap(map -> map.entrySet().stream())
//			    .filter(vo -> vo.getKey().equals("score1") || vo.getKey().equals("score2"))
//			    .collect(Collectors.groupingBy(Map.Entry::getKey,  Collectors.averagingInt(value -> (Integer) value.getValue())));
//		System.out.println(average);  // {A=3.0, B=4.333333333333333}
//		
//		Map<Object, Object> haha = mapList.stream()
//			    .flatMap(map -> map.entrySet().stream())
//			    .filter(vo -> vo.getKey().equals("score1") || vo.getKey().equals("score2"))
//			    .collect(Collectors.groupingBy(Map.Entry::getKey,  Collectors.reducing(0, Map.Entry::getValue, (a,b) -> (Integer)a + (Integer)b)));
		
//		System.out.println(sumValue);  // {A=3.0, B=4.333333333333333}
		
		
		Stream<Map.Entry<String, Object>> sbjectStream = mapList.stream().flatMap(map -> map.entrySet().stream())
												.filter(vo -> vo.getKey().equals("score1") || vo.getKey().equals("score2"));
		
		//1. groupingBy 합쳐짐
		//Map<Object, Double> avgMap = sbjectStream.collect(Collectors.groupingBy(Map.Entry::getKey,  Collectors.averagingInt(entry -> (Integer) entry.getValue())));

		//2, groupingBy 펼쳐
		ToIntFunction<Entry<String, Object>> getScoreToIntFunction = entry -> (Integer) entry.getValue();
		Function<Entry<String, Object>, Integer> getScore = entry -> (Integer) entry.getValue();
		
		
		//Map<String, Double> avgMap = sbjectStream.collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.averagingInt(getScoreToIntFunction)));		
		System.out.println("aa");

//		System.out.println(sbjectStream.collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.maxBy(comparing(getScore))))
//					.entrySet()
//					.stream()
//					.map(e -> e.getValue().get())
//					.collect(Collectors.toMap(Entry::getKey, Entry::getValue))
//					);
		
		 Function<Entry<String, Object>, String> classifier = entry -> entry.getKey();
		 Function<Entry<String, Object>, Integer> mapper = entry -> (Integer)entry.getValue();
		 Collector<String, ?, Map<String, Object>> collector1;
		 
		 
		 ////////////////////////////////////////// 최소값 최종 //////////////////////////////////////////////
//		System.out.println(sbjectStream.collect(Collectors.groupingBy(classifier, Collectors.maxBy(comparing(getScore))))
//														.entrySet()
//														.stream()
//														.map(e -> e.getValue().get())
//														.collect(Collectors.toMap(Entry::getKey, Entry::getValue))
//		);
		
		// 
		//	System.out.println(sbjectStream.collect(Collectors.groupingBy(classifier, Collectors.maxBy(comparing(getScore))))
		//);
		
		 List<Map<String, Object>> list2 = MockData11.makeMock();
		
		 Map<String, DoubleSummaryStatistics> result = list2.stream()
												 			.flatMap(map -> map.entrySet().stream())
												 			.collect(Collectors.groupingBy(entry -> entry.getKey()
									 						, Collectors.summarizingDouble(vo -> (Integer)vo.getValue())));

//		 Map<String, Object> aa = result.entrySet()
//		 		.stream()
//		 		.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue().getMax()));
		 
		 for (Entry e : result.entrySet()) {
			 System.out.println(e.getValue());
		 }
	}
}
