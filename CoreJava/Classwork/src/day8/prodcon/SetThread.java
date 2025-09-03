package day8.prodcon;

public class SetThread implements Runnable{

 private MyQueue queue;

    public SetThread(MyQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            queue.setValue("Value " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
