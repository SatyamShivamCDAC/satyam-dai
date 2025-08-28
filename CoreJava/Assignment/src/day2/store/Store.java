package day2.store;

import java.sql.SQLOutput;

public class Store {

    private Product[] products;

    public Store(Product[] products) {
        this.products = products;
    }

    public void displayProducts(){
        System.out.println("Product Details - \n");
        for(Product product : products){
            System.out.println("Product Id : " + product.getProdId());
            System.out.println("Product Name : " + product.getName());
            System.out.println("Product Price : " + product.getPrice() + "\n");
        }
    }

    public int searchProduct(int id){
        for(int i = 0 ; i < products.length ; i++ ){
            if (products[i].getProdId() == id){
                return i;
            }

        }
        return -1;
    }

}
