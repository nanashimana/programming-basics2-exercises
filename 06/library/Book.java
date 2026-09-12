だpackage library;

public class Book {
	
	String title;
	String author;
	int price;
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.printf("%s(著書: %s) - %d円\n", title, author, price);
	}
	
	public int getPrice() {
		return price;
		
	}
	
	
}