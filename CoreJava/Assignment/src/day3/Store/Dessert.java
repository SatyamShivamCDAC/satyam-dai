package day3.Store;

public abstract class Dessert {
    private String flavour;
    private float price;
    private int quantity;

    public Dessert(String flavour, float price, int quantity){
        this.flavour = flavour;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract float calculatePrice();

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "flavour='" + flavour + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
