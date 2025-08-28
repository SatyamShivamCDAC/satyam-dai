package wednesday.account;

public class CurrentAccount extends Account{

    public CurrentAccount(long accNo, String name, double balance) {
        super(accNo, name, balance);
    }



    @Override
    public boolean withdraw(int amount) {
        if(amount > super.getBalance()){
//            System.out.println("Insufficient Funds");
            return false;
        }
        else if (amount > 50000){
//            System.out.println("Amount is greater than 50000");
            return false;
        }
        else{
            super.setBalance(super.getBalance()-amount);
//            System.out.format("\nAmount withdraw\nCurrent balance - %f \n",super.getBalance());
            return true;
        }

    }

    @Override
    public boolean deposit(int amount) {

        if(amount <= 50){
//            System.out.println("\nMinimum of 50 rs is requried to be deposited\n");
            return false;
        }
        else{
            super.setBalance(super.getBalance()+amount);
//            System.out.format("Amount deposited : %d\nCurrent balance - %f \n",super.getBalance());
            return true;

        }


    }


}
