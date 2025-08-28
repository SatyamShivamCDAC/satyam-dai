package day3.Store;

public class Cookie extends Dessert{

    public Cookie(String flavour, float price, int quantity) {
        super(flavour, price, quantity);
    }

    public float calculatePrice(){
        return (getPrice()*getQuantity())/12;
    }
}
