package day2.store;

public class Product {

    private int prodId;
    private String name;
    private double price;

    public Product(int prodId, String name, double price) {
        this.prodId = prodId;
        this.name = name;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
