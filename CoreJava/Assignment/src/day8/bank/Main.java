package day8.bank;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(2000);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<4;i++){
                    account.withdraw(1000);
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<4;i++ ){
                    account.deposit(1000);
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                }
            }
        });

        thread1.setName("Withdraw");
        thread2.setName("deposit");

        thread1.start();
        thread2.start();
    }

}
