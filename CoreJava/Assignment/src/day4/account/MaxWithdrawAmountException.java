package day4.account;

public class MaxWithdrawAmountException extends Exception{
    public MaxWithdrawAmountException(){
        super("You can withdraw upto 50000 Rs");
    }
}
