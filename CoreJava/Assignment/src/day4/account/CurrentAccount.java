package day4.account;

public class CurrentAccount extends Account {

    public CurrentAccount(long accNo, String name, double balance) {
        super(accNo, name, balance);
    }



    @Override
    public boolean withdraw(int amount) throws InvalidAmmountException,InsufficientBalanceException,MaxWithdrawAmountException{
        if(amount<0){
            throw new InvalidAmmountException();
        }
        else if(amount > super.getBalance()){
            throw new InsufficientBalanceException();

        }
        else if (amount > 50000){

            throw new MaxWithdrawAmountException();
        }
        else{
            super.setBalance(super.getBalance()-amount);
//            System.out.format("\nAmount withdraw\nCurrent balance - %f \n",super.getBalance());
            return true;
        }

    }

    @Override
    public boolean deposit(int amount) throws InvalidAmmountException,MinDenominationException{

        if (amount<0){
            throw new InvalidAmmountException();
        }

        else if(amount <= 50){
            throw new MinDenominationException();

        }
        else{
            super.setBalance(super.getBalance()+amount);
//            System.out.format("Amount deposited : %d\nCurrent balance - %f \n",super.getBalance());
            return true;

        }


    }


}
