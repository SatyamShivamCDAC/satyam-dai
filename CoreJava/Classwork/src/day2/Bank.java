package day2;

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account("Satyam",12,12000);
        System.out.println(acc1.calculateInterest());

        Account.displayInterestRate();


    }
}
