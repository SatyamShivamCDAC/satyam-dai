package day8.mulithreading;

public class Thread1 extends Thread{
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
