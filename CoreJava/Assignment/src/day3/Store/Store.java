package day3.Store;

import java.util.Scanner;

public class Store {

    private Cart cart = new Cart();

    public void takeOrder(){

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Menu\n1.Candy\t2.Cookie\t3.Ice Cream\t4.Exit");

            int order = scanner.nextInt();

            if(order == 4){
                System.out.println("thanks");
                break;
            }

            System.out.println("Flavour : ");
            String flavour = scanner.next();

            System.out.println("Price : ");
            float price = scanner.nextFloat();

            System.out.println("Quantity : ");
            int quantity = scanner.nextInt();

            if(order == 1){
                cart.addToCart(new Candy(flavour,price,quantity));
            }

            else if(order == 2){
                cart.addToCart(new Cookie(flavour,price,quantity));
            }


            else if(order == 3){
                cart.addToCart(new IceCream(flavour,price,quantity));
            }

            else{
                System.out.println("incorrrect input");
            }

        }

        cart.showQuantity();
        cart.showBill();





    }



}
