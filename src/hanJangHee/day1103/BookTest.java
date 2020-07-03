package hanJangHee.day1103;

class Book{
	
	String bookName;
	int bookPrice;
	double bookDiscountRate ;
	
	Book(){}
	
	Book(String bookName, int bookPrice, double bookDiscountRate){
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate * 0.01;
	}
	
	double getDiscountBookPrice(){
	           return bookPrice - (bookPrice * bookDiscountRate) ;
	}
	
	public String getBookName(){
		return bookName;
	}
	public void setBookName(String bookName){
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate * 0.01;
	}
	
}


class BookTest {

	public static void main(String[] args){
		
		Book a = new Book("SQL Plus", 50000, 5.0);
		Book b = new Book("Java 2.0", 40000, 3.0);
		Book c = new Book("JSP Servlet", 60000, 6.0);
		
		System.out.println("책이름\t가격\t할인율\t할인후금액");
		System.out.println("--------------------------------------------------------");
		System.out.println(a.bookName + "\t" + a.bookPrice + "\t" + a.bookDiscountRate +"% \t" + a.getDiscountBookPrice()+ "원");
		System.out.println(b.bookName + "\t" + b.bookPrice + "\t" + b.bookDiscountRate + "% \t"+ b.getDiscountBookPrice()+ "원");
		System.out.println(c.bookName + "\t" + c.bookPrice + "\t" + c.bookDiscountRate + "% \t"+ c.getDiscountBookPrice()+ "원");
		
	}
	
}

	

