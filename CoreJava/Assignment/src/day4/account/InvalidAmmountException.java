package day4.account;

public class InvalidAmmountException extends Exception{
    public InvalidAmmountException(){
        super("Enter positive amount");
    }
}
