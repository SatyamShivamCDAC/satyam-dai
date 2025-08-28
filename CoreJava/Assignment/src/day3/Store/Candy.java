package day3.Store;

public class Candy extends Dessert {

    public Candy(String flavour, float price, int quantity) {
        super(flavour, price, quantity);
    }

    public float calculatePrice(){
        return (getPrice()*getQuantity())/1000;
    }
}
