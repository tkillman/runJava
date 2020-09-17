# 함수형 프로그래밍

# 개요
1. Ex숫자_01.java에는 우리가 사용하는 방법(명령형 프로그래밍)으로 구현할 수 있는 문제가 있습니다. 
문제만 읽고 직접 구현해보시면서 소스를 보시면 더 재미있을거 같습니다.

2. Ex숫자_02.java에는 함수형 프로그래밍으로 ex숫자_01.java를 똑같이 구현했을 때의 소스입니다.


# 목차
ex01 Function<T, R>
	==> T 타입을 받아서 R 타입을 반환한다.
	
ex02 Consumer<T>
	==> T 타입을 받아서 리턴하지 않는다.
	
ex03 Predicate<T>
	==> T 타입을 받아서 boolean을 리턴한다.

ex04 Supplier<T> 
	==> 아무것도 받지 않고 T를 반환한다.
	
ex05 나만의 interface Function 만들기
	==> 1. @FunctionalInterface를 붙여서 interface myFunction<T1, T2, T3, T4, ..., R>를 만든다.	

ex06 map 메소드
	==> List<T> 타입을 받아서 List<R> 타입으로 바꿔준다.
	
ex07 stream
	==> stream의 장점
	==> stream을 다시 list나 set으로 반환받는 메소드
	==> stream을 join해서 string으로 반환하는 메소드
	
	
====================================================

#blog
https://futurecreator.github.io/2018/08/26/java-8-streams/
블로그 따라하기

 1. 생성하기
 2. 가공하기
 3. 결과 만들기
 
1. 생성하기
 배열/컬렉션/ 빈 스트림
 Stream.builder() / Stream.generate() / Stream.Iterate()
 기본 타입형/ String/ 파일스트림
 병렬스트림/ 스트림 연결하기	

2. 가공하기
Filtering
Mapping
Sorting
Iterating

3. 결과 만들기
Calculating
Reduction
Collecting
Matching
Iterating

전체 -->> 맵핑 -->> 필터링 -->> 필터링 -->> 결과 만들기 -->> 결과물

#목차 
ex01 배열스트림
ex02 컬렉션 스트림(Collection, List, Set), 비어있는 스트림
ex03 Stream.builder()
ex04 Stream.generate()
ex05 Stream.iterate()
ex06 기본 타입형 스트림 /String/ fileStream
ex07 filter
ex08 function
ex09 groupby
ex10 collect
ex11 reduce
====================================================
package practice
	
ch01. 평균 구하기, 최저점 구하기

	