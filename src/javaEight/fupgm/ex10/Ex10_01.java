package javaEight.fupgm.ex10;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Ex10_01 {
	public static void main(String[] args) {
		
		// collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner)
		
		Stream<String> fruits = Stream.of("monkeyBanana", "apple", "mango", "kiwi", "peach", "cherry", "lemon");
		
//		HashSet<String> fruitHashSet = fruits.collect(HashSet::new, HashSet::add, HashSet::addAll);
		
//		Set<String> fruitHashSet2 = fruits.collect(Collectors.toSet());
//		
//		List<String> fruitList = fruits.collect(Collectors.toList());
//		
//		String result2 = fruits.collect(Collectors.joining());
//		System.out.println(result2);
		
		//글자길이가 가장 긴 문자 찾기
		Function<String, Integer> getCount = fruit-> fruit.length();
		Optional<String> result = fruits.map(Object::toString).collect(maxBy(comparing(getCount)));
		System.out.println(result.get());
		
		//평균값 구하기
		List<Integer> list = Arrays.asList(1,2,3,4);
		Double average = list.stream().collect(Collectors.averagingInt(v -> v*2));
		System.out.println("Average: " + average);
		
		//custom 객체에 collect 적용
		Stream<Fruit> fruits2 = Stream.of(new Fruit("1", "banana"), new Fruit("2", "apple"),
		        new Fruit("3", "mango"), new Fruit("4", "kiwi"),
		        new Fruit("5", "peach"), new Fruit("6", "cherry"),
		        new Fruit("7", "lemon"));
		
		Map<String, String> map = fruits2.collect(Collectors.toMap(Fruit::getId, Fruit::getName));
		
		for (String key : map.keySet()) {
		    System.out.println("key: " + key + ", value: " + map.get(key));
		}
		
		System.out.println("================================================================================");
		//동일 key를 가진 경우 IllegalStateException 예외처리
		
		Stream<Fruit> fruits3 = Stream.of(new Fruit("1", "banana"), new Fruit("2", "apple"),
		        new Fruit("3", "mango"), new Fruit("4", "kiwi"),
		        new Fruit("5", "peach"), new Fruit("6", "cherry"),
		        new Fruit("5", "lemon"));
		
		Map<String, String> map2 = fruits3.collect(
			    Collectors.toMap(item -> item.getId(), item -> item.getName(),
			            (existingValue, newValue) -> existingValue));
		
		
		for (String key : map2.keySet()) {
		    System.out.println("key: " + key + ", value: " + map2.get(key));
		}
		
	}
	
	static class Fruit {
	    public String id;
	    public String name;

	    Fruit(String id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public String getId() {
	        return id;
	    }
	    public String getName() {
	        return name;
	    }
	}
}

