package day4;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book)throws DuplicateBookException{
        for(Book bo:books){
            if(bo.getIsbn() == book.getIsbn())
                throw new DuplicateBookException();
        }

        books.add(book);
        System.out.println("Book added");
    }

}
