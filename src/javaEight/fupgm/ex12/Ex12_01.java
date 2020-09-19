package javaEight.fupgm.ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex12_01 {
	public static void main(String[] args) {

		Map<String, Object> map1 = new HashMap<>();
		map1.put("ga1", 1);
		map1.put("gb1", 4);
		map1.put("gb2", 2);

		Map<String, Object> map2 = new HashMap<>();
		map2.put("ga1", 11);
		map2.put("gb1", 4);
		map2.put("gb2", 2);

		List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
		listMap.add(map1);
		listMap.add(map2);
		
		//2번방식
//		List<Map<String, Object>> listMap2 = new ArrayList<Map<String, Object>>();
//		listMap.stream().forEach(map -> {
//			Map m = map.entrySet()
//							.stream()
//							.filter(e -> e.getKey().startsWith("gb"))
//							.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//			listMap2.add(m);
//		});
//		System.out.println("listmap2");
//		System.out.println(listMap2);
		
		
		
		// map
		Stream<Object> iStream = listMap.stream().map(vo -> vo.get("gb1"));
		iStream.forEach(System.out::print);

		String[][] sample = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "a" }, { "a", "h" }, { "i", "j" } };

		Stream<String[]> strStream = Arrays.stream(sample).filter(vo -> {
			return vo[0].equals("a") || vo[1].equals("a");
		});

		strStream.forEach(vo -> System.out.println(vo[0] + vo[1]));

		Stream<String> strStream2 = Arrays.stream(sample).flatMap(vo -> Arrays.stream(vo)).filter(vo -> vo.equals("a"));

		strStream2.forEach(System.out::println);
		System.out.println("  ");
		/// 
		Student obj1 = new Student();
		obj1.setName("mkyong");
		obj1.addBook("Java 8 in Action");
		obj1.addBook("Spring Boot in Action");
		obj1.addBook("Effective Java (2nd Edition)");

		Student obj2 = new Student();
		obj2.setName("zilap");
		obj2.addBook("Learning Python, 5th Edition");
		obj2.addBook("Effective Java (2nd Edition)");

		List<Student> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);

		List<String> collect = list.stream().map(x -> x.getBook()) // Stream<Set<String>>
				.flatMap(x -> x.stream()) // Stream<String>
				.distinct().collect(Collectors.toList());

		collect.forEach(x -> System.out.println(x));

	}
}
