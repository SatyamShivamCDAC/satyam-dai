package day8.array;

public class Main {

    public static void main(String[] args) {
        DemoArray arr = new DemoArray(new int[]{1,2,3,4,5});



        Thread thread1 = new Thread(new Printjob(arr));
        Thread thread2 = new Thread(new Printjob(arr));

        thread2.setName("Thread 2");
        thread1.setName("Thread 1");

        thread1.start();
        thread2.start();

    }

}
