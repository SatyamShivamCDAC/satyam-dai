package day8.prodcon;

public class DemoProdCon {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0 ; i < 10 ; i++){
//                    queue.setValue("value " + i);
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0;i<10;i++){
//                    queue.getValue();
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        });

        Thread thread1 = new Thread(new SetThread(queue));
        Thread thread2 = new Thread(new GetThread(queue));

        thread1.setName("Set Thread");
        thread2.setName("Get Thread");

        thread1.start();
        thread2.start();
    }

}
