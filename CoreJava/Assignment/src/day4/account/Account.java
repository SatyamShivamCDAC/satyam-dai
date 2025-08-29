package day4.account;

public abstract class Account {

    private long accNo;
    private String name;
    private double balance;

    public Account(long accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public long getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract boolean withdraw(int amount)throws InvalidAmmountException,InsufficientBalanceException,MaxWithdrawAmountException,MInBalanceException;
    public abstract boolean deposit(int amount) throws InvalidAmmountException,MinDenominationException;

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
