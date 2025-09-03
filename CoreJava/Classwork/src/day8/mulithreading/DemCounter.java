package day8.mulithreading;

public class DemCounter {

    public static void main(String[] args) {

        Counter count = new Counter();
//        Runnable r1 = () -> {
//            for(int i = 0;i<50;i++){
//                count.increment();
//                count.getCount();
//
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//        Thread thread1 = new Thread(r1);
//
//        Runnable r2 = ()->{
//            for(int i = 0;i<50;i++){
//                count.increment();
//                count.getCount();
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//        Thread thread2 = new Thread(r2);

        Thread thread1 = new Thread(new CounterThread(count));
        Thread thread2 = new Thread(new CounterThread(count));
        thread1.start();
        thread2.start();
    }

}
