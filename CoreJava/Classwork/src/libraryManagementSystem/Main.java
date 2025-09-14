package libraryManagementSystem;

public class Main {
	public static void main() {
		
		Library library = new Library();
		
		library.displayBooks();
		
		try {
			library.searchBookByAuthor("James Clear");
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		try {
			library.searchBookByTitle("Alchemist");
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		try {
			library.searchBookByAuthor("James");
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
