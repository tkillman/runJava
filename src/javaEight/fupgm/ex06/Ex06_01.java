package javaEight.fupgm.ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1. Product VO를 만드세요. Product VO에는 String productId
//, String productName, double productPrice가 있습니다.

//2. ProductDiscount VO를 만드세요. ProductDiscount VO는 Product를 상속받습니다.

//3. productId = 1, productName = "껌", productPrice = 100 인 객체를 만드세요.
// productId = 1, productName = "사탕", productPrice = 200 인 객체를 만들어서
// List<Product> productList 에 담아보세요.

//4. List<ProductDiscount> productDiscountList를 만들어서 productPrice의 값을 절반으로 만들어서 담아보세요.

public class Ex06_01 {
	
	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(new Product("1", "껌",100), new Product("2", "사탕",200));
		
		List<ProductDiscount> productDiscountList = new ArrayList<ProductDiscount>();
		
		
		for (Product product : productList) {
			
			productDiscountList.add(new ProductDiscount(product.getProductId()
														,product.getProductName()
														,product.getProductPrice()));
		}
		
		System.out.println(productDiscountList);
	}
}

