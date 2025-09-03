package day8.bank;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn - " +amount+" " + Thread.currentThread().getName() + " || Balance left :- "+balance);

        }
        else
            System.out.println("Insufficient balance");
    }

    public void deposit(int amount){
        balance+=amount;
        System.out.println("Deposit - " +amount+" " + Thread.currentThread().getName() + " || Balance left :- "+balance);
    }

    public double getBalance() {
        return balance;
    }
}
