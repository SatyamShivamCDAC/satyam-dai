package day8.mulithreading;

public class DemoThread {
    public static void main(String[] args) {
        Thread thread = new Thread1();
        thread.start();//starts execution of thread
//        thread.run();
        for(int i=0;i<5;i++){

            System.out.println(i);

        }
}}
