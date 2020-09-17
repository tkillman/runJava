package javaEight.fupgm.ex09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Ex09_01 {
	
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
		
		/// groupby를 사용하여 김동규,김가원,홍길동 string 만들기
		Set<String> strSet = new HashSet<>();
		
		for (int i = 0; i < ttvoList.size(); i++) {
			String name = "'"+ttvoList.get(i).getName()+"'";
			strSet.add(name);
		}
		
		StringBuffer resultBuffer = new StringBuffer();
		for (Iterator<String> iter = strSet.iterator(); iter.hasNext();) {
			resultBuffer.append(iter.next());
			resultBuffer.append(",");
		}
		
		System.out.println(resultBuffer.toString().substring(0,resultBuffer.toString().length() - 1));
		
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


