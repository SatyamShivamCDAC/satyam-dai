package day8.number;

import java.sql.SQLOutput;

public class OddEven {

    private int num;
    private boolean isEven;

    public OddEven(){
        num = 1;
    }

    public synchronized void printOdd(){
        if(isEven){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Odd : " + num);
        num = num+1;
        isEven = true;
        notifyAll();
    }

    public synchronized void printEven(){
        if(!isEven){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Even : " + num);
        num = num + 1;
        isEven = false;
        notifyAll();
    }


}
