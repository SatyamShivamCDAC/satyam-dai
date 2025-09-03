package day8.bank;

public class WithdrawAmount implements Runnable{

    private Account account;
    boolean hasBalance;

    public WithdrawAmount(Account account) {
        this.account = account;
        hasBalance = true;
    }

    @Override
    public void run() {


        while(true) {
            {
                account.withdraw(500);
                if(account.getBalance()<500){
                    break;
                }
                try {
                        Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                }
            }
        hasBalance = false;
        notifyAll();
    }
}
