import library.Book;


public class Main {
	public static void main(String[] args) {
		
		Book book1 = new Book("ノルウェイの森", "村上春樹", 780);
		Book book2 = new Book("獣の奏者", "上橋菜穂子", 660);
		
		book1.showInfo();
		book2.showInfo();
		
		System.out.printf("合計金額: %d円\n", book1.getPrice() + book2.getPrice());
		
		}
	
}
