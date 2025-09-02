package day4;

public class Book {

    private int isbn;
    private String title;
    private double price;

    public Book(int isbn, String title, double price) {

        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
