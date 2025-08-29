package day4.account;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(){
        super("You dont have sufficient Balance");
    }
}
