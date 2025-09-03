package day8.bank;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(2000);

        Thread thread1 = new Thread(new WithdrawAmount(account));

        thread1.start();
    }

}
