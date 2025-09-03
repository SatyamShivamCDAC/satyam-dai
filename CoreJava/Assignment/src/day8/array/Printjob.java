package day8.array;

public class Printjob implements Runnable{
    DemoArray arr;

    public Printjob(DemoArray arr) {
        this.arr = arr;
    }

    @Override
    public void run(){
        arr.printArray();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
