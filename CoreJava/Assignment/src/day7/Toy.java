package day7;

public class Toy {
    private int id;
    private String name;
    private String category;
    private double price;
    private String ageGroup;
    private int year;

    public Toy(int id, String name, double price, String category, String ageGroup, int year) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.ageGroup = ageGroup;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Toy{" +
                " name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
