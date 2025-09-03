package day8.prodcon;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue {

    private Queue<String> myQueue;
    private boolean hasValue;

    public MyQueue() {
        myQueue = new ArrayDeque<>();
    }

    public synchronized void setValue(String value){
        if(hasValue){
            try
            {
                wait();
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        myQueue.add(value);
        hasValue = true;
        notifyAll();
        System.out.println(Thread.currentThread().getName() + " set value : " + value);
    }

    public synchronized void getValue(){
        if(!hasValue){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " Get value : " + myQueue.poll());
        hasValue= false;
        notifyAll();
    }

}
