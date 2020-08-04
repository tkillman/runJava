package javaEight.fupgm.ex09;

import java.util.Optional;
import java.util.function.Supplier;

public class Ex09_01 {
	
// 전통적인 null의 저주	
//	order 파라미터에 null 값이 넘어옴
//	order.getMember()의 결과가 null 임
//	order.getMember().getAddress()의 결과가 null 임
//	order.getMember().getAddress().getCity()의 결과가 null 임
	
// 해결방안
//	Optional는 “존재할 수도 있지만 안 할 수도 있는 객체”, 즉, “null이 될 수도 있는 객체”을 감싸고 있는 일종의 래퍼 클래스입니다.	
	
	public static void main(String[] args) throws Exception {
		
		//1. Optional의 객체 생성방법 3가지
		// a) Optional.empty();
		// b) Optional.of(Object); 주의! Object가 null인 경우 에러 발생
		// c) Optional.ofNull(Object);
		
		Order order = new Order();
		Member member = new Member();
		Address address = new Address();
		address.setCity("Busan");
		
		member.setAddress(address);
		order.setMember(member);
		
		//Optional<Order> optionOrder = Optional.ofNullable(order);
		Optional<Order> optionOrder = Optional.ofNullable(null);
		
		//2. Optional 안에 객체 접근법
		// a) get();
		// b) orElse(T other);
		// c) orElseGet(Supplier<? extends T> other);
		// d) orElseThrow(Supplier<? extends X> exceptionSupplier)
		
		//a) optionOrder.get();
		//b) optionOrder.orElse(null);
		//c) optionOrder.orElseGet(() -> new Order());
		//d) optionOrder.orElseThrow(() -> new Exception());
		
		//### 잘못된 예 ###
		/* 주문을 한 회원이 살고 있는 도시를 반환한다 */
//		public String getCityOfMemberFromOrder(Order order) {
//			Optional<Order> maybeOrder = Optional.ofNullable(order);
//			if (maybeOrder.isPresent()) {
//				Optional<Member> maybeMember = Optional.ofNullable(maybeOrder.get());
//				if (maybeMember.isPresent()) {
//					Optional<Address> maybeAddress = Optional.ofNullable(maybeMember.get());
//					if (maybeAddress.isPresent()) {
//						Address address = maybeAddress.get();
//						Optinal<String> maybeCity = Optional.ofNullable(address.getCity());
//						if (maybeCity.isPresent()) {
//							return maybeCity.get();
//						}
//					}
//				}
//			}
//			return "Seoul";
//		}
		
//		### 올바른 코드
		String cityNm = optionOrder.map(Order::getMember).map(Member::getAddress).map(Address::getCity).orElse("Seoul");
		System.out.println("cityNm ::" + cityNm);
	}
}
