package day8.mulithreading;

public class Counter {
    private int count;

    public Counter(){
        count = 0 ;
    }

    public  void  increment(){
        count++;

    }
    public void getCount(){
        System.out.println(Thread.currentThread().getName() + " : "+ count);
    }
}
