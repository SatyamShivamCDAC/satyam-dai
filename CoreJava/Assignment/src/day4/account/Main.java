package day4.account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SavingAccout acc1 = new SavingAccout(101,"satyam",15000);
        CurrentAccount acc2 = new CurrentAccount(102,"shivam", 200000);
        SavingAccout acc3 = new SavingAccout(103,"Arbab",12000);

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3 + "\n");


//        try{
//            acc1.withdraw(-20);
//        }
//        catch(InvalidAmmountException|InsufficientBalanceException|MInBalanceException e){
//            System.out.println(e.getMessage());
//        }

//        try{
//            acc1.deposit(1000);
//        }
//        catch(InvalidAmmountException e){
//            System.out.println(e.getMessage());
//        }


//        try{
//            acc2.withdraw(-50);
//        }
//        catch(InvalidAmmountException|InsufficientBalanceException|MaxWithdrawAmountException e){
//            System.out.println(e.getMessage());
//        }

        try{
            acc2.deposit(20);
        }
        catch(InvalidAmmountException|MinDenominationException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n"+acc1);
        System.out.println(acc2);
        System.out.println(acc3);


    }
}
