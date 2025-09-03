package day8.prodcon;

public class GetThread implements Runnable{
    private MyQueue queue;

    public GetThread(MyQueue queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            queue.getValue();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
