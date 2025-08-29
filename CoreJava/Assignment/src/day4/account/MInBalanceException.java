package day4.account;

public class MInBalanceException extends Exception{
    public MInBalanceException(){
        super("You must maintain minimum of 10000 Rs");
    }
}
