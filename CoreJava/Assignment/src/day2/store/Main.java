package day2.store;

public class Main {
    public static void main(String[] args) {

       Product bag = new Product(101,"bag",1200);
       Product shirt = new Product(102,"shirt",300);
       Product watch = new Product(103,"watch",2000);

       Store store = new Store(new Product[]{bag,shirt,watch});

       store.displayProducts();
        System.out.println(store.searchProduct(103));

    }
}
