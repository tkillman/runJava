package javaEight.fupgm.ex06;

import lombok.Data;

@Data
public class Product {
	
	private String productId;
	
	private String productName;
	
	private double productPrice;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String productId, String productName, double productPrice) {
		// TODO Auto-generated constructor stub
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
}
