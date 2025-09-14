package libraryManagementSystem;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
	private List<Book> books;
	
	public Library() {
		Book atomichabit = new Book("Atomic habit","James Clear",336622,2018);
		Book ikigai = new Book("Ikigai","Hector Garcia",335522,2016);
		Book alcemist = new Book("Alchemist","Paulo Coelho",336633,1988);
		
		books = List.of(atomichabit,ikigai,alcemist);

	}
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added");
	}
	
	public void displayBooks() {
		Iterator<Book> it = books.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void searchBookByAuthor(String str) throws BookNotFoundException{
		List<Book> book = books.stream().filter(b->b.getAuthor()==str).collect(Collectors.toList());
		if(book!=null) {
			System.out.println("Books by " + str + " -");
			for(Book b : book) {
				System.out.println(b.getAuthor());
			}
		}
		else {
			throw new BookNotFoundException("Book of this author is not Found");
		}
	}
	
	public void searchBookByTitle(String str) throws BookNotFoundException {
		List<Book> book = books.stream().filter(b->b.getTitle()==str).collect(Collectors.toList());
		if(book!=null) {
			System.out.println(str + " book exist in library");
		}
		else {
			throw new BookNotFoundException("Book by title not found");
		}
	}
}
