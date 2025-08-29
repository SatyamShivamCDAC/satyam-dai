package day4.account;

public class MinDenominationException extends Exception{
    public MinDenominationException(){
        super("Minimum of 50 Rs must be deposit");
    }
}
