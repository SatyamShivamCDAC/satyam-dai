package day8.number;

public class PrintNumber {
    public static void main(String[] args) {
        OddEven oddEven = new OddEven();

        Runnable r1 = ()->{
            for (int i = 0; i < 5; i++) {
                oddEven.printEven();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable r2 = ()->{
            for (int i = 0; i < 5; i++) {
                oddEven.printOdd();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);

        thread1.start();
        thread2.start();
    }
}
