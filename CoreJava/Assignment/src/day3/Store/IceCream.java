package day3.Store;

public class IceCream extends Dessert{

    public IceCream(String flavour, float price, int quantity) {
        super(flavour, price, quantity);
    }

    public float calculatePrice(){
        return (getPrice()*getQuantity());
    }
}
