package javaEight.fupgm.ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex06_02 {
	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(new Product("1", "껌",100), new Product("2", "사탕",200));
		
		List<ProductDiscount> productDiscountList = new ArrayList<ProductDiscount>();
		
		Function<Product, ProductDiscount> f = t -> new ProductDiscount(t.getProductId(), t.getProductName(), t.getProductPrice() * 0.5);
		
		productDiscountList = map(productList, f);
		
		//System.out.println(productDiscountList);
		
		//filter
//		Predicate<Product> predicate =  t -> t.getProductPrice() > 80;
//		List<ProductDiscount> filterProductList = filter(productDiscountList, predicate);
		//System.out.println(filterProductList);
	}
		
	public static <T,R> List<R> map(List<T> list, Function<T, R> function){
		List<R> result = new ArrayList<R>();
		
		for (T t : list) {
			result.add(function.apply(t));
		}
		return result;
	}
	
	
	public static <T> List<T> filter(List<T> list, Predicate<? super T> predicate){
		List<T> result = new ArrayList<T>();
		for (T t : list) {
			if(predicate.test(t)) {
				result.add(t);
			}
		}
		return result;
	}
}
