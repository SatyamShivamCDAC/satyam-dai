package day8.bank;

public class Account {
    private double balance;
    private double amount_needed;
    public Account(double balance) {
        this.balance = balance;
        this.amount_needed = 0;
    }

    public synchronized void withdraw(double amount) {

        if(amount > balance){
            System.out.println("insufficient amount");
            amount_needed = amount;
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        balance = balance - amount;
        amount_needed = 0;
        System.out.println("Amount Withdrawn : " + amount + "Balance remaining : " + balance);


    }

    public synchronized void deposit(double amount){

        balance += amount;
        System.out.println("Amount deppsit : " + amount + "Balance remaining : " + balance);
        if(balance>amount_needed && amount_needed!=0){
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
