package practice11_print01;

public class Book1 extends TangibleAsset{

	String isbn;
	
	public Book1(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn=isbn;
	
	}
	
	public String isbn() {
		return this.isbn;
	}
}
