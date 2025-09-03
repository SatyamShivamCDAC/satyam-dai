package day8.mulithreading;

public class CounterThread implements Runnable{

    Counter count;

    public CounterThread(Counter count){
        this.count = count;
    }

    @Override
    public void run(){
        for(int i = 0;i<50;i++){
            count.increment();
            count.getCount();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
