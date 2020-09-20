package javaEight.fupgm.ex13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex13_01 {
    ////////////////////
    
	public static void main(String[] args) {
		
        List<Student13> totalList = Student13MockData.totalList;

        Stream<Student13> totalStream = totalList.stream();
        Function<Student13, Student13.Sex> classifier = Student13::getSex;
        Collector<Student13, ?, Map<Student13.Sex, List<Student13>>> collector = Collectors.groupingBy(classifier);

        Map<Student13.Sex, List<Student13>> mapBySex = totalStream.collect(collector);
        System.out.println(mapBySex);

        // 위의 코드와 같음
        mapBySex = totalList.stream().collect(Collectors.groupingBy(Student13::getSex));
		

        List<Student13> totalList2 = Student13MockData.totalList2;

        Stream<Student13> totalStream2 = totalList.stream();

        Function<Student13, Student13.City> classifier2 = Student13::getCity;
        Function<Student13, String> mapper = Student13::getName;

        Collector<String, ?, List<String>> collector1 = Collectors.toList();
                // Collectors의 mapping() 메소드로 Student를 이름으로 매핑하고 이름을 List에 수집하는 Collector를 얻는다.
        Collector<Student13, ?, List<String>> collector2 = Collectors.mapping(mapper, collector1);

        Collector<Student13, ?, Map<Student13.City, List<String>>> collector3 =
                Collectors.groupingBy(classifier2, collector2);

        Map<Student13.City, List<String>> mapByCity = totalStream.collect(collector3);
        System.out.println(mapByCity);

        mapByCity = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student13::getCity,
                                Collectors.mapping(Student13::getName, Collectors.toList())
                        )
                );
        System.out.println(mapByCity);

                // groupingBy(Function<? super T,? extends K> classifier, Supplier<M> mapFactory, Collector<? super T,A,D> downstream)
                // 위의 코드와 동일하나 TreeMap 객체를 생성해서 반환하도록 한다.
                mapByCity = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student13::getCity,
                                TreeMap::new,
                                Collectors.mapping(Student13::getName, Collectors.toList())
                        )
                );
        System.out.println(mapByCity);
    
	}
}
