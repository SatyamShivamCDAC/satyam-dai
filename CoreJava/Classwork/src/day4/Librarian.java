package day4;

public class Librarian {


    public static void main(String[] args)  {
        Book book1 = new Book(11,"Morning",22);
        Book book2 = new Book(12,"jsfa",21);
        Book book3 = new Book(11,"sda",22);

        Library lib = new Library();

        try{
            lib.addBook(book1);
            lib.addBook(book2);
            lib.addBook(book3);
        }
        catch (DuplicateBookException e){
            System.out.println(e.getMessage());
        }
    }

}
