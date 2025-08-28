package day3.Store;

public class Cart {


    private Dessert[] desserts;
    public static  int itemCount = 0 ;

    public Cart() {
        this.desserts = new Dessert[10];
    }

    public void addToCart(Dessert dessert){

        desserts[itemCount] = dessert;
        itemCount++;

    }

    public Dessert[] getDesserts() {
        return desserts;


    }
    public void showBill(){

        float total = 0;

        for(int i = 0;i<Cart.itemCount;i++){
            total += desserts[i].calculatePrice();
        }

        System.out.println("your bill is : "+ total);
    }

    public void showQuantity(){
        System.out.println("You have bought " + itemCount + " items");
    }

}
