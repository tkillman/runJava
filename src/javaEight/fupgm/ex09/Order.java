package javaEight.fupgm.ex09;

import java.util.Date;

/* 주문 */
public class Order {
	private Long id;
	private Date date;
	private Member member;
	// getters & setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
	
}
