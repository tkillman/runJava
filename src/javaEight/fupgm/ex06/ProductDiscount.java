package javaEight.fupgm.ex06;


public class ProductDiscount extends Product{
	
	public ProductDiscount() {
		super();
	}
	
	public ProductDiscount(String productId, String productName, double productPrice) {
		super(productId, productName, productPrice);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("productId :: " + getProductId() + " , ");
		sb.append("productName :: " + getProductName() + " , ");
		sb.append("productPrice :: " + getProductPrice() + "\n");
		return sb.toString();
	}
}
